package com.summer.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.summer.model.Movie;
import com.summer.util.KeyValue;
import com.summer.util.QueryMatch;
import com.summer.util.QueryRange;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/11 14:00
 */
@Service
public class ESClient {

    @Autowired
    JestClient jestClient;

    private static final Logger LOGGER = LoggerFactory.getLogger(ESClient.class);

    String queryString(List<String> source, QueryMatch match, QueryRange range, KeyValue sort){
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if(!(source == null || source.size() == 0)){
            sb.append("\"_source\": [");
            for(String s : source){
                sb.append("\"");
                sb.append(s);
                sb.append("\"");
                sb.append(",");
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.append("],");
        }
        if(match == null && range == null){
            sb.append(" \"query\": {\"match_all\": {} },");
        }
        else{
            if(match != null){
                sb.append(match.GetQuery());
            }
            else {
                sb.append(range.GetQuery());
            }
        }
        if(sort != null){
            sb.append("\"sort\": [{ \"");
            sb.append(sort.getKey());
            sb.append("\":\"");
            sb.append(sort.getValue());
            sb.append("\"}],");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }

    public String queryString(List<String> source, QueryMatch match, QueryRange range, KeyValue sort, int from, int size){
        StringBuilder query = new StringBuilder(queryString(source, match, range, sort));
        query.deleteCharAt(query.length() - 1);
        query.append(",\"from\" : " + from + ", \"size\" : " + size + "}");
        return  query.toString();

    }

    private List<Movie> convert(JSONArray hits){
        List<Movie> movies = new ArrayList<>();
        if(hits == null || hits.size() == 0){
            return movies;
        }
        for(int i = 0; i < hits.size(); i++){
            JSONObject source = hits.getJSONObject(i).getJSONObject("_source");
            movies.add(JSONObject.toJavaObject(source, Movie.class));
        }
        return movies;
    }
    List<Movie> search(String json, String index) throws IOException {
        LOGGER.info("Elastic Search查询： {}", json);
        Search search = new Search.Builder(json).addIndex(index).addType("_doc").build();
        try {
            SearchResult result =  jestClient.execute(search);
            JSONObject jsonObject = JSONObject.parseObject(result.getJsonString());
            if(jsonObject.getJSONObject("hits") == null){
                LOGGER.error("Elastic Search查询失败： {}", jsonObject.get("error"));
                return null;
            }
            JSONArray hits = jsonObject.getJSONObject("hits").getJSONArray("hits");
            LOGGER.info("Elastic Search查询结果条数： {}", hits.size());
            return convert(hits);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public boolean insertOrUpdateDoc(String id, Movie movie, String index) {
        Index update = new Index.Builder(movie).index(index).type("_doc").id(id).refresh(true).build();
        try {
            JestResult result = jestClient.execute(update);
            if (result != null && !result.isSucceeded()) {
                throw new RuntimeException(result.getErrorMessage()+"更新索引失败!");
            }
        } catch (Exception e) {
            LOGGER.error("更新索引失败，{}", e);
            return false;
        }
        return true;
    }

    public Movie searchDoc(String id, String index) throws IOException {
        QueryMatch queryMatch = new QueryMatch("id", id);
        String query = queryString(null, queryMatch, null, null);
        List<Movie> movies = search(query, index);
        if (movies == null || movies.size() == 0) {
            return null;
        }
        return movies.get(0);
    }
}
