package com.summer.model;

public class Comment {
    private Integer id;

    private String username;

    private String content;

    private Boolean emotion;

    public Comment(Integer id, String username, String content, Boolean emotion) {
        this.id = id;
        this.username = username;
        this.content = content;
        this.emotion = emotion;
    }

    public Comment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Boolean getEmotion() {
        return emotion;
    }

    public void setEmotion(Boolean emotion) {
        this.emotion = emotion;
    }
}