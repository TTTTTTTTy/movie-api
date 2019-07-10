package com.summer;

import com.summer.model.EsBlog;
import com.summer.model.movie_infos;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieApiApplicationTests {

    @Autowired
    JestClient jestClient;

    @Test
    public void contextLoads() {
        EsBlog esBlog=new EsBlog();
        esBlog.setBlogId(10001l);
        esBlog.setId("10001");
        esBlog.setContent("content");
        esBlog.setSummary("summary");
        esBlog.setTitle("title");
        //构建一个索引功能
        Index index=new Index.Builder(esBlog).index("thblog").type("blog").build();

        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSearch(){
        //查询表达式
        String json="{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"movie_name\" : \"千与千寻\"\n" +
                "        }\n" +
                "    }\n" +
                "}";
//        String json="{\"query\" : {\"match\" : {\"pingfen\" : \"9.4\"}}\n}";
        //构建搜索功能
        Search search=new Search.Builder(json).addIndex("movie").addType("_doc").build();

        try {
            SearchResult result=jestClient.execute(search);
            System.out.println(result.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
