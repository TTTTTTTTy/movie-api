package com.summer.service.impl;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author Administrator
 * @since 2019/7/14 15:04
 */

@Service
public class CommentEmotion {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommentEmotion.class);

    public Boolean sendPost(String data) throws IOException {
        String url = "https://aip.baidubce.com/rpc/2.0/nlp/v1/sentiment_classify?access_token=24.f2224b0c23619d9edc5bf8655c6f3009.2592000.1565679237.282335-16801824";
        LOGGER.info("request: " + data);
        CloseableHttpClient httpClient = null;
        httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(url);
        // 设置请求的参数
        JSONObject jsonParam = new JSONObject();
        jsonParam.put("text", data);
        StringEntity entity = new StringEntity(jsonParam.toString(), "GBK");
        entity.setContentEncoding("GBK");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        HttpResponse response = httpClient.execute(httpPost);
        String json = EntityUtils.toString(response.getEntity(), "utf-8");
        JSONObject jsonObject = JSONObject.parseObject(json);
        if(jsonObject.getString("error_code") != null){
            LOGGER.error("调用百度情感分析API失败：{}", jsonObject.getString("error_msg"));
            throw new RuntimeException();
        }
        if(jsonObject.getJSONArray("items").getJSONObject(0).getIntValue("sentiment") == 0){
            return false;
        }
        return true;
    }
}
