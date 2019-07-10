package com.summer.model;

import io.searchbox.annotations.JestId;

/**
 * @author Administrator
 * @since 2019/7/10 15:13
 */
public class EsBlog {
    @JestId  // 主键
    private String id;
    private Long blogId;
    private String title;
    private String summary;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
