package com.summer.util;

import org.springframework.data.elasticsearch.core.query.GetQuery;

/**
 * @author Administrator
 * @since 2019/7/12 10:11
 */
public class QueryMatch {

    private String key;

    private String value;

    private Analyzer analyzer;

    private Integer minimumShouldMatch;

    public QueryMatch(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public QueryMatch(String key, String value, Analyzer analyzer, int minimumShouldMatch) {
        this.key = key;
        this.value = value;
        this.analyzer = analyzer;
        this.minimumShouldMatch = minimumShouldMatch;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Analyzer getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(Analyzer analyzer) {
        this.analyzer = analyzer;
    }

    public Integer getMinimumShouldMatch() {
        return minimumShouldMatch;
    }

    public void setMinimumShouldMatch(Integer minimumShouldMatch) {
        this.minimumShouldMatch = minimumShouldMatch;
    }

    public String GetQuery(){
        String s = "\"query\": {\"match\": {\"" + key + "\":{\"query\": \"" + value + "\"";
        if(analyzer != null){
            s += ",\"analyzer\": \"" + analyzer.getName() + "\"";
        }
        if(minimumShouldMatch != null){
            s += ",\"minimum_should_match\": \"" + minimumShouldMatch + "%\"";
        }
        s += "}}},";
        return s;
    }
}
