package com.summer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * @author Administrator
 * @since 2019/7/10 11:12
 */

public class Movie {

    private Integer id;

    private String movie_name;

    private String movie_daoyan;

    private String movie_bianju;

    private String movie_zhuyan;

    private String movie_leixing;

    private String shangyingriqi;

    private String shichang;

    private String pingfen;

    private String jianjie;

    private String pinglun1;

    private String pinglun2;

    private String pinglun3;

    private String pinglun4;

    private String pinglun5;

    private String tupian_url;

    private Integer remenzhishu;

    private String comment_id;

    public Movie(Integer id, String movie_name, String movie_daoyan, String movie_bianju, String movie_zhuyan, String movie_leixing, String shangyingriqi, String shichang, String pingfen, String jianjie, String pinglun1, String pinglun2, String pinglun3, String pinglun4, String pinglun5, String tupian_url, Integer remenzhishu, String comment_id) {
        this.id = id;
        this.movie_name = movie_name;
        this.movie_daoyan = movie_daoyan;
        this.movie_bianju = movie_bianju;
        this.movie_zhuyan = movie_zhuyan;
        this.movie_leixing = movie_leixing;
        this.shangyingriqi = shangyingriqi;
        this.shichang = shichang;
        this.pingfen = pingfen;
        this.jianjie = jianjie;
        this.pinglun1 = pinglun1;
        this.pinglun2 = pinglun2;
        this.pinglun3 = pinglun3;
        this.pinglun4 = pinglun4;
        this.pinglun5 = pinglun5;
        this.tupian_url = tupian_url;
        this.remenzhishu = remenzhishu;
        this.comment_id = comment_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_daoyan() {
        return movie_daoyan;
    }

    public void setMovie_daoyan(String movie_daoyan) {
        this.movie_daoyan = movie_daoyan;
    }

    public String getMovie_bianju() {
        return movie_bianju;
    }

    public void setMovie_bianju(String movie_bianju) {
        this.movie_bianju = movie_bianju;
    }

    public String getMovie_zhuyan() {
        return movie_zhuyan;
    }

    public void setMovie_zhuyan(String movie_zhuyan) {
        this.movie_zhuyan = movie_zhuyan;
    }

    public String getMovie_leixing() {
        return movie_leixing;
    }

    public void setMovie_leixing(String movie_leixing) {
        this.movie_leixing = movie_leixing;
    }

    public String getShangyingriqi() {
        return shangyingriqi;
    }

    public void setShangyingriqi(String shangyingriqi) {
        this.shangyingriqi = shangyingriqi;
    }

    public String getShichang() {
        return shichang;
    }

    public void setShichang(String shichang) {
        this.shichang = shichang;
    }

    public String getPingfen() {
        return pingfen;
    }

    public void setPingfen(String pingfen) {
        this.pingfen = pingfen;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie;
    }

    public String getPinglun1() {
        return pinglun1;
    }

    public void setPinglun1(String pinglun1) {
        this.pinglun1 = pinglun1;
    }

    public String getPinglun2() {
        return pinglun2;
    }

    public void setPinglun2(String pinglun2) {
        this.pinglun2 = pinglun2;
    }

    public String getPinglun3() {
        return pinglun3;
    }

    public void setPinglun3(String pinglun3) {
        this.pinglun3 = pinglun3;
    }

    public String getPinglun4() {
        return pinglun4;
    }

    public void setPinglun4(String pinglun4) {
        this.pinglun4 = pinglun4;
    }

    public String getPinglun5() {
        return pinglun5;
    }

    public void setPinglun5(String pinglun5) {
        this.pinglun5 = pinglun5;
    }

    public String getTupian_url() {
        return tupian_url;
    }

    public void setTupian_url(String tupian_url) {
        this.tupian_url = tupian_url;
    }

    public Integer getRemenzhishu() {
        return remenzhishu;
    }

    public void setRemenzhishu(Integer remenzhishu) {
        this.remenzhishu = remenzhishu;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }
}
