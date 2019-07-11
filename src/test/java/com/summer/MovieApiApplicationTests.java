package com.summer;

import com.summer.service.MovieService;
import io.searchbox.client.JestClient;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieApiApplicationTests {

    @Autowired
    JestClient jestClient;

    @Autowired
    MovieService movieService;

    @Test
    public void contextLoads() {
        movieService.getMoviesByName("");
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
