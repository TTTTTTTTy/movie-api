package com.summer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author Administrator
 * @since 2019/7/10 11:12
 */

@Document(indexName = "movie", type = "movie_infos", shards = 1, replicas = 0)
public class movie_infos {

    @Id
    Integer id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String movie_name;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String movie_daoyan;

    @Field(type = FieldType.Keyword)
    private String movie_bianju;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String movie_zhuyan;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String movie_leixing;

    @Field(type = FieldType.Keyword)
    private String shangyingriqi;

    @Field(type = FieldType.Keyword)
    private String shichang;

    @Field(type = FieldType.Double)
    private String pingfen;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String jianjie;


    @Field(type = FieldType.Keyword)
    private String pinglun1;

    @Field(type = FieldType.Keyword)
    private String pinglun2;

    @Field(type = FieldType.Keyword)
    private String pinglun3;

    @Field(type = FieldType.Keyword)
    private String pinglun4;

    @Field(type = FieldType.Keyword)
    private String pinglun5;

    @Field(type = FieldType.Keyword)
    private String tupian_url;

}
