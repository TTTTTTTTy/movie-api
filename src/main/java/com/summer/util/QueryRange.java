package com.summer.util;

import sun.awt.SunHints;

import java.util.List;

/**
 * @author Administrator
 * @since 2019/7/12 12:14
 */
public class QueryRange {

    private String field;

    private List<KeyValue> option;

    public QueryRange() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public List<KeyValue> getOption() {
        return option;
    }

    public void setOption(List<KeyValue> option) {
        this.option = option;
    }

    public String GetQuery(){
        String s = "\"query\": {\"range\": {\"" + field + "\":{";
        for(KeyValue keyValue : option){
            s += "\"" + keyValue.getKey() + "\" : " + keyValue.getValue() + ",";
        }
        s = s.substring(0, s.length() - 1);
        s += "}}},";
        return s;
    }
}
