package com.summer.model;

import java.util.List;

public class Movie {
    private Integer id;

    private String movie_name;

    private String movie_daoyan;

    private String movie_bianju;

    private String movie_zhuyan;

    private String movie_leixing;

    private String shangyingriqi;

    private String shichang;

    private Double pingfen;

    private String pinglun1;

    private String pinglun2;

    private String pinglun3;

    private String pinglun4;

    private String pinglun5;

    private String tupian_url;

    private Integer remenzhishu;

    private String comment_id;

    private Boolean emotion1;

    private Boolean emotion2;

    private Boolean emotion3;

    private Boolean emotion4;

    private Boolean emotion5;

    private String jianjie;

    private List<Comment> comments;

    public Movie(Integer id, String movie_name, String movie_daoyan, String movie_bianju, String movie_zhuyan, String movie_leixing, String shangyingriqi, String shichang, Double pingfen, String pinglun1, String pinglun2, String pinglun3, String pinglun4, String pinglun5, String tupian_url, Integer remenzhishu, String comment_id, Boolean emotion1, Boolean emotion2, Boolean emotion3, Boolean emotion4, Boolean emotion5) {
        this.id = id;
        this.movie_name = movie_name;
        this.movie_daoyan = movie_daoyan;
        this.movie_bianju = movie_bianju;
        this.movie_zhuyan = movie_zhuyan;
        this.movie_leixing = movie_leixing;
        this.shangyingriqi = shangyingriqi;
        this.shichang = shichang;
        this.pingfen = pingfen;
        this.pinglun1 = pinglun1;
        this.pinglun2 = pinglun2;
        this.pinglun3 = pinglun3;
        this.pinglun4 = pinglun4;
        this.pinglun5 = pinglun5;
        this.tupian_url = tupian_url;
        this.remenzhishu = remenzhishu;
        this.comment_id = comment_id;
        this.emotion1 = emotion1;
        this.emotion2 = emotion2;
        this.emotion3 = emotion3;
        this.emotion4 = emotion4;
        this.emotion5 = emotion5;
    }

    public Movie(Integer id, String movie_name, String movie_daoyan, String movie_bianju, String movie_zhuyan, String movie_leixing, String shangyingriqi, String shichang, Double pingfen, String pinglun1, String pinglun2, String pinglun3, String pinglun4, String pinglun5, String tupian_url, Integer remenzhishu, String comment_id, Boolean emotion1, Boolean emotion2, Boolean emotion3, Boolean emotion4, Boolean emotion5, String jianjie) {
        this.id = id;
        this.movie_name = movie_name;
        this.movie_daoyan = movie_daoyan;
        this.movie_bianju = movie_bianju;
        this.movie_zhuyan = movie_zhuyan;
        this.movie_leixing = movie_leixing;
        this.shangyingriqi = shangyingriqi;
        this.shichang = shichang;
        this.pingfen = pingfen;
        this.pinglun1 = pinglun1;
        this.pinglun2 = pinglun2;
        this.pinglun3 = pinglun3;
        this.pinglun4 = pinglun4;
        this.pinglun5 = pinglun5;
        this.tupian_url = tupian_url;
        this.remenzhishu = remenzhishu;
        this.comment_id = comment_id;
        this.emotion1 = emotion1;
        this.emotion2 = emotion2;
        this.emotion3 = emotion3;
        this.emotion4 = emotion4;
        this.emotion5 = emotion5;
        this.jianjie = jianjie;
    }

    public Movie() {
        super();
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
        this.movie_name = movie_name == null ? null : movie_name.trim();
    }

    public String getMovie_daoyan() {
        return movie_daoyan;
    }

    public void setMovie_daoyan(String movie_daoyan) {
        this.movie_daoyan = movie_daoyan == null ? null : movie_daoyan.trim();
    }

    public String getMovie_bianju() {
        return movie_bianju;
    }

    public void setMovie_bianju(String movie_bianju) {
        this.movie_bianju = movie_bianju == null ? null : movie_bianju.trim();
    }

    public String getMovie_zhuyan() {
        return movie_zhuyan;
    }

    public void setMovie_zhuyan(String movie_zhuyan) {
        this.movie_zhuyan = movie_zhuyan == null ? null : movie_zhuyan.trim();
    }

    public String getMovie_leixing() {
        return movie_leixing;
    }

    public void setMovie_leixing(String movie_leixing) {
        this.movie_leixing = movie_leixing == null ? null : movie_leixing.trim();
    }

    public String getShangyingriqi() {
        return shangyingriqi;
    }

    public void setShangyingriqi(String shangyingriqi) {
        this.shangyingriqi = shangyingriqi == null ? null : shangyingriqi.trim();
    }

    public String getShichang() {
        return shichang;
    }

    public void setShichang(String shichang) {
        this.shichang = shichang == null ? null : shichang.trim();
    }

    public Double getPingfen() {
        return pingfen;
    }

    public void setPingfen(Double pingfen) {
        this.pingfen = pingfen;
    }

    public String getPinglun1() {
        return pinglun1;
    }

    public void setPinglun1(String pinglun1) {
        this.pinglun1 = pinglun1 == null ? null : pinglun1.trim();
    }

    public String getPinglun2() {
        return pinglun2;
    }

    public void setPinglun2(String pinglun2) {
        this.pinglun2 = pinglun2 == null ? null : pinglun2.trim();
    }

    public String getPinglun3() {
        return pinglun3;
    }

    public void setPinglun3(String pinglun3) {
        this.pinglun3 = pinglun3 == null ? null : pinglun3.trim();
    }

    public String getPinglun4() {
        return pinglun4;
    }

    public void setPinglun4(String pinglun4) {
        this.pinglun4 = pinglun4 == null ? null : pinglun4.trim();
    }

    public String getPinglun5() {
        return pinglun5;
    }

    public void setPinglun5(String pinglun5) {
        this.pinglun5 = pinglun5 == null ? null : pinglun5.trim();
    }

    public String getTupian_url() {
        return tupian_url;
    }

    public void setTupian_url(String tupian_url) {
        this.tupian_url = tupian_url == null ? null : tupian_url.trim();
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
        this.comment_id = comment_id == null ? null : comment_id.trim();
    }

    public Boolean getEmotion1() {
        return emotion1;
    }

    public void setEmotion1(Boolean emotion1) {
        this.emotion1 = emotion1;
    }

    public Boolean getEmotion2() {
        return emotion2;
    }

    public void setEmotion2(Boolean emotion2) {
        this.emotion2 = emotion2;
    }

    public Boolean getEmotion3() {
        return emotion3;
    }

    public void setEmotion3(Boolean emotion3) {
        this.emotion3 = emotion3;
    }

    public Boolean getEmotion4() {
        return emotion4;
    }

    public void setEmotion4(Boolean emotion4) {
        this.emotion4 = emotion4;
    }

    public Boolean getEmotion5() {
        return emotion5;
    }

    public void setEmotion5(Boolean emotion5) {
        this.emotion5 = emotion5;
    }

    public String getJianjie() {
        return jianjie;
    }

    public void setJianjie(String jianjie) {
        this.jianjie = jianjie == null ? null : jianjie.trim();
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}