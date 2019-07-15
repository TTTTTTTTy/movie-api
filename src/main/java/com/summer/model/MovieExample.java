package com.summer.model;

import java.util.ArrayList;
import java.util.List;

public class MovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMovie_nameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovie_nameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_nameEqualTo(String value) {
            addCriterion("movie_name =", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLessThan(String value) {
            addCriterion("movie_name <", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameLike(String value) {
            addCriterion("movie_name like", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotLike(String value) {
            addCriterion("movie_name not like", value, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameIn(List<String> values) {
            addCriterion("movie_name in", values, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_nameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movie_name");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanIsNull() {
            addCriterion("movie_daoyan is null");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanIsNotNull() {
            addCriterion("movie_daoyan is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanEqualTo(String value) {
            addCriterion("movie_daoyan =", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanNotEqualTo(String value) {
            addCriterion("movie_daoyan <>", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanGreaterThan(String value) {
            addCriterion("movie_daoyan >", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanGreaterThanOrEqualTo(String value) {
            addCriterion("movie_daoyan >=", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanLessThan(String value) {
            addCriterion("movie_daoyan <", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanLessThanOrEqualTo(String value) {
            addCriterion("movie_daoyan <=", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanLike(String value) {
            addCriterion("movie_daoyan like", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanNotLike(String value) {
            addCriterion("movie_daoyan not like", value, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanIn(List<String> values) {
            addCriterion("movie_daoyan in", values, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanNotIn(List<String> values) {
            addCriterion("movie_daoyan not in", values, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanBetween(String value1, String value2) {
            addCriterion("movie_daoyan between", value1, value2, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_daoyanNotBetween(String value1, String value2) {
            addCriterion("movie_daoyan not between", value1, value2, "movie_daoyan");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuIsNull() {
            addCriterion("movie_bianju is null");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuIsNotNull() {
            addCriterion("movie_bianju is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuEqualTo(String value) {
            addCriterion("movie_bianju =", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuNotEqualTo(String value) {
            addCriterion("movie_bianju <>", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuGreaterThan(String value) {
            addCriterion("movie_bianju >", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuGreaterThanOrEqualTo(String value) {
            addCriterion("movie_bianju >=", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuLessThan(String value) {
            addCriterion("movie_bianju <", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuLessThanOrEqualTo(String value) {
            addCriterion("movie_bianju <=", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuLike(String value) {
            addCriterion("movie_bianju like", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuNotLike(String value) {
            addCriterion("movie_bianju not like", value, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuIn(List<String> values) {
            addCriterion("movie_bianju in", values, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuNotIn(List<String> values) {
            addCriterion("movie_bianju not in", values, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuBetween(String value1, String value2) {
            addCriterion("movie_bianju between", value1, value2, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_bianjuNotBetween(String value1, String value2) {
            addCriterion("movie_bianju not between", value1, value2, "movie_bianju");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanIsNull() {
            addCriterion("movie_zhuyan is null");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanIsNotNull() {
            addCriterion("movie_zhuyan is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanEqualTo(String value) {
            addCriterion("movie_zhuyan =", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanNotEqualTo(String value) {
            addCriterion("movie_zhuyan <>", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanGreaterThan(String value) {
            addCriterion("movie_zhuyan >", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanGreaterThanOrEqualTo(String value) {
            addCriterion("movie_zhuyan >=", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanLessThan(String value) {
            addCriterion("movie_zhuyan <", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanLessThanOrEqualTo(String value) {
            addCriterion("movie_zhuyan <=", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanLike(String value) {
            addCriterion("movie_zhuyan like", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanNotLike(String value) {
            addCriterion("movie_zhuyan not like", value, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanIn(List<String> values) {
            addCriterion("movie_zhuyan in", values, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanNotIn(List<String> values) {
            addCriterion("movie_zhuyan not in", values, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanBetween(String value1, String value2) {
            addCriterion("movie_zhuyan between", value1, value2, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_zhuyanNotBetween(String value1, String value2) {
            addCriterion("movie_zhuyan not between", value1, value2, "movie_zhuyan");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingIsNull() {
            addCriterion("movie_leixing is null");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingIsNotNull() {
            addCriterion("movie_leixing is not null");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingEqualTo(String value) {
            addCriterion("movie_leixing =", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingNotEqualTo(String value) {
            addCriterion("movie_leixing <>", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingGreaterThan(String value) {
            addCriterion("movie_leixing >", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingGreaterThanOrEqualTo(String value) {
            addCriterion("movie_leixing >=", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingLessThan(String value) {
            addCriterion("movie_leixing <", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingLessThanOrEqualTo(String value) {
            addCriterion("movie_leixing <=", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingLike(String value) {
            addCriterion("movie_leixing like", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingNotLike(String value) {
            addCriterion("movie_leixing not like", value, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingIn(List<String> values) {
            addCriterion("movie_leixing in", values, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingNotIn(List<String> values) {
            addCriterion("movie_leixing not in", values, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingBetween(String value1, String value2) {
            addCriterion("movie_leixing between", value1, value2, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andMovie_leixingNotBetween(String value1, String value2) {
            addCriterion("movie_leixing not between", value1, value2, "movie_leixing");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiIsNull() {
            addCriterion("shangyingriqi is null");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiIsNotNull() {
            addCriterion("shangyingriqi is not null");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiEqualTo(String value) {
            addCriterion("shangyingriqi =", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiNotEqualTo(String value) {
            addCriterion("shangyingriqi <>", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiGreaterThan(String value) {
            addCriterion("shangyingriqi >", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiGreaterThanOrEqualTo(String value) {
            addCriterion("shangyingriqi >=", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiLessThan(String value) {
            addCriterion("shangyingriqi <", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiLessThanOrEqualTo(String value) {
            addCriterion("shangyingriqi <=", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiLike(String value) {
            addCriterion("shangyingriqi like", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiNotLike(String value) {
            addCriterion("shangyingriqi not like", value, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiIn(List<String> values) {
            addCriterion("shangyingriqi in", values, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiNotIn(List<String> values) {
            addCriterion("shangyingriqi not in", values, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiBetween(String value1, String value2) {
            addCriterion("shangyingriqi between", value1, value2, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShangyingriqiNotBetween(String value1, String value2) {
            addCriterion("shangyingriqi not between", value1, value2, "shangyingriqi");
            return (Criteria) this;
        }

        public Criteria andShichangIsNull() {
            addCriterion("shichang is null");
            return (Criteria) this;
        }

        public Criteria andShichangIsNotNull() {
            addCriterion("shichang is not null");
            return (Criteria) this;
        }

        public Criteria andShichangEqualTo(String value) {
            addCriterion("shichang =", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotEqualTo(String value) {
            addCriterion("shichang <>", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangGreaterThan(String value) {
            addCriterion("shichang >", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangGreaterThanOrEqualTo(String value) {
            addCriterion("shichang >=", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangLessThan(String value) {
            addCriterion("shichang <", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangLessThanOrEqualTo(String value) {
            addCriterion("shichang <=", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangLike(String value) {
            addCriterion("shichang like", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotLike(String value) {
            addCriterion("shichang not like", value, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangIn(List<String> values) {
            addCriterion("shichang in", values, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotIn(List<String> values) {
            addCriterion("shichang not in", values, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangBetween(String value1, String value2) {
            addCriterion("shichang between", value1, value2, "shichang");
            return (Criteria) this;
        }

        public Criteria andShichangNotBetween(String value1, String value2) {
            addCriterion("shichang not between", value1, value2, "shichang");
            return (Criteria) this;
        }

        public Criteria andPingfenIsNull() {
            addCriterion("pingfen is null");
            return (Criteria) this;
        }

        public Criteria andPingfenIsNotNull() {
            addCriterion("pingfen is not null");
            return (Criteria) this;
        }

        public Criteria andPingfenEqualTo(Double value) {
            addCriterion("pingfen =", value, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenNotEqualTo(Double value) {
            addCriterion("pingfen <>", value, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenGreaterThan(Double value) {
            addCriterion("pingfen >", value, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenGreaterThanOrEqualTo(Double value) {
            addCriterion("pingfen >=", value, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenLessThan(Double value) {
            addCriterion("pingfen <", value, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenLessThanOrEqualTo(Double value) {
            addCriterion("pingfen <=", value, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenIn(List<Double> values) {
            addCriterion("pingfen in", values, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenNotIn(List<Double> values) {
            addCriterion("pingfen not in", values, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenBetween(Double value1, Double value2) {
            addCriterion("pingfen between", value1, value2, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPingfenNotBetween(Double value1, Double value2) {
            addCriterion("pingfen not between", value1, value2, "pingfen");
            return (Criteria) this;
        }

        public Criteria andPinglun1IsNull() {
            addCriterion("pinglun1 is null");
            return (Criteria) this;
        }

        public Criteria andPinglun1IsNotNull() {
            addCriterion("pinglun1 is not null");
            return (Criteria) this;
        }

        public Criteria andPinglun1EqualTo(String value) {
            addCriterion("pinglun1 =", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1NotEqualTo(String value) {
            addCriterion("pinglun1 <>", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1GreaterThan(String value) {
            addCriterion("pinglun1 >", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1GreaterThanOrEqualTo(String value) {
            addCriterion("pinglun1 >=", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1LessThan(String value) {
            addCriterion("pinglun1 <", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1LessThanOrEqualTo(String value) {
            addCriterion("pinglun1 <=", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1Like(String value) {
            addCriterion("pinglun1 like", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1NotLike(String value) {
            addCriterion("pinglun1 not like", value, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1In(List<String> values) {
            addCriterion("pinglun1 in", values, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1NotIn(List<String> values) {
            addCriterion("pinglun1 not in", values, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1Between(String value1, String value2) {
            addCriterion("pinglun1 between", value1, value2, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun1NotBetween(String value1, String value2) {
            addCriterion("pinglun1 not between", value1, value2, "pinglun1");
            return (Criteria) this;
        }

        public Criteria andPinglun2IsNull() {
            addCriterion("pinglun2 is null");
            return (Criteria) this;
        }

        public Criteria andPinglun2IsNotNull() {
            addCriterion("pinglun2 is not null");
            return (Criteria) this;
        }

        public Criteria andPinglun2EqualTo(String value) {
            addCriterion("pinglun2 =", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2NotEqualTo(String value) {
            addCriterion("pinglun2 <>", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2GreaterThan(String value) {
            addCriterion("pinglun2 >", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2GreaterThanOrEqualTo(String value) {
            addCriterion("pinglun2 >=", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2LessThan(String value) {
            addCriterion("pinglun2 <", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2LessThanOrEqualTo(String value) {
            addCriterion("pinglun2 <=", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2Like(String value) {
            addCriterion("pinglun2 like", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2NotLike(String value) {
            addCriterion("pinglun2 not like", value, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2In(List<String> values) {
            addCriterion("pinglun2 in", values, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2NotIn(List<String> values) {
            addCriterion("pinglun2 not in", values, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2Between(String value1, String value2) {
            addCriterion("pinglun2 between", value1, value2, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun2NotBetween(String value1, String value2) {
            addCriterion("pinglun2 not between", value1, value2, "pinglun2");
            return (Criteria) this;
        }

        public Criteria andPinglun3IsNull() {
            addCriterion("pinglun3 is null");
            return (Criteria) this;
        }

        public Criteria andPinglun3IsNotNull() {
            addCriterion("pinglun3 is not null");
            return (Criteria) this;
        }

        public Criteria andPinglun3EqualTo(String value) {
            addCriterion("pinglun3 =", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3NotEqualTo(String value) {
            addCriterion("pinglun3 <>", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3GreaterThan(String value) {
            addCriterion("pinglun3 >", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3GreaterThanOrEqualTo(String value) {
            addCriterion("pinglun3 >=", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3LessThan(String value) {
            addCriterion("pinglun3 <", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3LessThanOrEqualTo(String value) {
            addCriterion("pinglun3 <=", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3Like(String value) {
            addCriterion("pinglun3 like", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3NotLike(String value) {
            addCriterion("pinglun3 not like", value, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3In(List<String> values) {
            addCriterion("pinglun3 in", values, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3NotIn(List<String> values) {
            addCriterion("pinglun3 not in", values, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3Between(String value1, String value2) {
            addCriterion("pinglun3 between", value1, value2, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun3NotBetween(String value1, String value2) {
            addCriterion("pinglun3 not between", value1, value2, "pinglun3");
            return (Criteria) this;
        }

        public Criteria andPinglun4IsNull() {
            addCriterion("pinglun4 is null");
            return (Criteria) this;
        }

        public Criteria andPinglun4IsNotNull() {
            addCriterion("pinglun4 is not null");
            return (Criteria) this;
        }

        public Criteria andPinglun4EqualTo(String value) {
            addCriterion("pinglun4 =", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4NotEqualTo(String value) {
            addCriterion("pinglun4 <>", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4GreaterThan(String value) {
            addCriterion("pinglun4 >", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4GreaterThanOrEqualTo(String value) {
            addCriterion("pinglun4 >=", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4LessThan(String value) {
            addCriterion("pinglun4 <", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4LessThanOrEqualTo(String value) {
            addCriterion("pinglun4 <=", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4Like(String value) {
            addCriterion("pinglun4 like", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4NotLike(String value) {
            addCriterion("pinglun4 not like", value, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4In(List<String> values) {
            addCriterion("pinglun4 in", values, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4NotIn(List<String> values) {
            addCriterion("pinglun4 not in", values, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4Between(String value1, String value2) {
            addCriterion("pinglun4 between", value1, value2, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun4NotBetween(String value1, String value2) {
            addCriterion("pinglun4 not between", value1, value2, "pinglun4");
            return (Criteria) this;
        }

        public Criteria andPinglun5IsNull() {
            addCriterion("pinglun5 is null");
            return (Criteria) this;
        }

        public Criteria andPinglun5IsNotNull() {
            addCriterion("pinglun5 is not null");
            return (Criteria) this;
        }

        public Criteria andPinglun5EqualTo(String value) {
            addCriterion("pinglun5 =", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5NotEqualTo(String value) {
            addCriterion("pinglun5 <>", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5GreaterThan(String value) {
            addCriterion("pinglun5 >", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5GreaterThanOrEqualTo(String value) {
            addCriterion("pinglun5 >=", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5LessThan(String value) {
            addCriterion("pinglun5 <", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5LessThanOrEqualTo(String value) {
            addCriterion("pinglun5 <=", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5Like(String value) {
            addCriterion("pinglun5 like", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5NotLike(String value) {
            addCriterion("pinglun5 not like", value, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5In(List<String> values) {
            addCriterion("pinglun5 in", values, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5NotIn(List<String> values) {
            addCriterion("pinglun5 not in", values, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5Between(String value1, String value2) {
            addCriterion("pinglun5 between", value1, value2, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andPinglun5NotBetween(String value1, String value2) {
            addCriterion("pinglun5 not between", value1, value2, "pinglun5");
            return (Criteria) this;
        }

        public Criteria andTupian_urlIsNull() {
            addCriterion("tupian_url is null");
            return (Criteria) this;
        }

        public Criteria andTupian_urlIsNotNull() {
            addCriterion("tupian_url is not null");
            return (Criteria) this;
        }

        public Criteria andTupian_urlEqualTo(String value) {
            addCriterion("tupian_url =", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlNotEqualTo(String value) {
            addCriterion("tupian_url <>", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlGreaterThan(String value) {
            addCriterion("tupian_url >", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlGreaterThanOrEqualTo(String value) {
            addCriterion("tupian_url >=", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlLessThan(String value) {
            addCriterion("tupian_url <", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlLessThanOrEqualTo(String value) {
            addCriterion("tupian_url <=", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlLike(String value) {
            addCriterion("tupian_url like", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlNotLike(String value) {
            addCriterion("tupian_url not like", value, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlIn(List<String> values) {
            addCriterion("tupian_url in", values, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlNotIn(List<String> values) {
            addCriterion("tupian_url not in", values, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlBetween(String value1, String value2) {
            addCriterion("tupian_url between", value1, value2, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andTupian_urlNotBetween(String value1, String value2) {
            addCriterion("tupian_url not between", value1, value2, "tupian_url");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuIsNull() {
            addCriterion("remenzhishu is null");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuIsNotNull() {
            addCriterion("remenzhishu is not null");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuEqualTo(Integer value) {
            addCriterion("remenzhishu =", value, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuNotEqualTo(Integer value) {
            addCriterion("remenzhishu <>", value, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuGreaterThan(Integer value) {
            addCriterion("remenzhishu >", value, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuGreaterThanOrEqualTo(Integer value) {
            addCriterion("remenzhishu >=", value, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuLessThan(Integer value) {
            addCriterion("remenzhishu <", value, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuLessThanOrEqualTo(Integer value) {
            addCriterion("remenzhishu <=", value, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuIn(List<Integer> values) {
            addCriterion("remenzhishu in", values, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuNotIn(List<Integer> values) {
            addCriterion("remenzhishu not in", values, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuBetween(Integer value1, Integer value2) {
            addCriterion("remenzhishu between", value1, value2, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andRemenzhishuNotBetween(Integer value1, Integer value2) {
            addCriterion("remenzhishu not between", value1, value2, "remenzhishu");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNull() {
            addCriterion("comment_id is null");
            return (Criteria) this;
        }

        public Criteria andComment_idIsNotNull() {
            addCriterion("comment_id is not null");
            return (Criteria) this;
        }

        public Criteria andComment_idEqualTo(String value) {
            addCriterion("comment_id =", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotEqualTo(String value) {
            addCriterion("comment_id <>", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThan(String value) {
            addCriterion("comment_id >", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idGreaterThanOrEqualTo(String value) {
            addCriterion("comment_id >=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThan(String value) {
            addCriterion("comment_id <", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLessThanOrEqualTo(String value) {
            addCriterion("comment_id <=", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idLike(String value) {
            addCriterion("comment_id like", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotLike(String value) {
            addCriterion("comment_id not like", value, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idIn(List<String> values) {
            addCriterion("comment_id in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotIn(List<String> values) {
            addCriterion("comment_id not in", values, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idBetween(String value1, String value2) {
            addCriterion("comment_id between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andComment_idNotBetween(String value1, String value2) {
            addCriterion("comment_id not between", value1, value2, "comment_id");
            return (Criteria) this;
        }

        public Criteria andEmotion1IsNull() {
            addCriterion("emotion1 is null");
            return (Criteria) this;
        }

        public Criteria andEmotion1IsNotNull() {
            addCriterion("emotion1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmotion1EqualTo(Boolean value) {
            addCriterion("emotion1 =", value, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1NotEqualTo(Boolean value) {
            addCriterion("emotion1 <>", value, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1GreaterThan(Boolean value) {
            addCriterion("emotion1 >", value, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1GreaterThanOrEqualTo(Boolean value) {
            addCriterion("emotion1 >=", value, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1LessThan(Boolean value) {
            addCriterion("emotion1 <", value, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1LessThanOrEqualTo(Boolean value) {
            addCriterion("emotion1 <=", value, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1In(List<Boolean> values) {
            addCriterion("emotion1 in", values, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1NotIn(List<Boolean> values) {
            addCriterion("emotion1 not in", values, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1Between(Boolean value1, Boolean value2) {
            addCriterion("emotion1 between", value1, value2, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion1NotBetween(Boolean value1, Boolean value2) {
            addCriterion("emotion1 not between", value1, value2, "emotion1");
            return (Criteria) this;
        }

        public Criteria andEmotion2IsNull() {
            addCriterion("emotion2 is null");
            return (Criteria) this;
        }

        public Criteria andEmotion2IsNotNull() {
            addCriterion("emotion2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmotion2EqualTo(Boolean value) {
            addCriterion("emotion2 =", value, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2NotEqualTo(Boolean value) {
            addCriterion("emotion2 <>", value, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2GreaterThan(Boolean value) {
            addCriterion("emotion2 >", value, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2GreaterThanOrEqualTo(Boolean value) {
            addCriterion("emotion2 >=", value, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2LessThan(Boolean value) {
            addCriterion("emotion2 <", value, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2LessThanOrEqualTo(Boolean value) {
            addCriterion("emotion2 <=", value, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2In(List<Boolean> values) {
            addCriterion("emotion2 in", values, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2NotIn(List<Boolean> values) {
            addCriterion("emotion2 not in", values, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2Between(Boolean value1, Boolean value2) {
            addCriterion("emotion2 between", value1, value2, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion2NotBetween(Boolean value1, Boolean value2) {
            addCriterion("emotion2 not between", value1, value2, "emotion2");
            return (Criteria) this;
        }

        public Criteria andEmotion3IsNull() {
            addCriterion("emotion3 is null");
            return (Criteria) this;
        }

        public Criteria andEmotion3IsNotNull() {
            addCriterion("emotion3 is not null");
            return (Criteria) this;
        }

        public Criteria andEmotion3EqualTo(Boolean value) {
            addCriterion("emotion3 =", value, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3NotEqualTo(Boolean value) {
            addCriterion("emotion3 <>", value, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3GreaterThan(Boolean value) {
            addCriterion("emotion3 >", value, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3GreaterThanOrEqualTo(Boolean value) {
            addCriterion("emotion3 >=", value, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3LessThan(Boolean value) {
            addCriterion("emotion3 <", value, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3LessThanOrEqualTo(Boolean value) {
            addCriterion("emotion3 <=", value, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3In(List<Boolean> values) {
            addCriterion("emotion3 in", values, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3NotIn(List<Boolean> values) {
            addCriterion("emotion3 not in", values, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3Between(Boolean value1, Boolean value2) {
            addCriterion("emotion3 between", value1, value2, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion3NotBetween(Boolean value1, Boolean value2) {
            addCriterion("emotion3 not between", value1, value2, "emotion3");
            return (Criteria) this;
        }

        public Criteria andEmotion4IsNull() {
            addCriterion("emotion4 is null");
            return (Criteria) this;
        }

        public Criteria andEmotion4IsNotNull() {
            addCriterion("emotion4 is not null");
            return (Criteria) this;
        }

        public Criteria andEmotion4EqualTo(Boolean value) {
            addCriterion("emotion4 =", value, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4NotEqualTo(Boolean value) {
            addCriterion("emotion4 <>", value, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4GreaterThan(Boolean value) {
            addCriterion("emotion4 >", value, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4GreaterThanOrEqualTo(Boolean value) {
            addCriterion("emotion4 >=", value, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4LessThan(Boolean value) {
            addCriterion("emotion4 <", value, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4LessThanOrEqualTo(Boolean value) {
            addCriterion("emotion4 <=", value, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4In(List<Boolean> values) {
            addCriterion("emotion4 in", values, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4NotIn(List<Boolean> values) {
            addCriterion("emotion4 not in", values, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4Between(Boolean value1, Boolean value2) {
            addCriterion("emotion4 between", value1, value2, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion4NotBetween(Boolean value1, Boolean value2) {
            addCriterion("emotion4 not between", value1, value2, "emotion4");
            return (Criteria) this;
        }

        public Criteria andEmotion5IsNull() {
            addCriterion("emotion5 is null");
            return (Criteria) this;
        }

        public Criteria andEmotion5IsNotNull() {
            addCriterion("emotion5 is not null");
            return (Criteria) this;
        }

        public Criteria andEmotion5EqualTo(Boolean value) {
            addCriterion("emotion5 =", value, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5NotEqualTo(Boolean value) {
            addCriterion("emotion5 <>", value, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5GreaterThan(Boolean value) {
            addCriterion("emotion5 >", value, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5GreaterThanOrEqualTo(Boolean value) {
            addCriterion("emotion5 >=", value, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5LessThan(Boolean value) {
            addCriterion("emotion5 <", value, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5LessThanOrEqualTo(Boolean value) {
            addCriterion("emotion5 <=", value, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5In(List<Boolean> values) {
            addCriterion("emotion5 in", values, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5NotIn(List<Boolean> values) {
            addCriterion("emotion5 not in", values, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5Between(Boolean value1, Boolean value2) {
            addCriterion("emotion5 between", value1, value2, "emotion5");
            return (Criteria) this;
        }

        public Criteria andEmotion5NotBetween(Boolean value1, Boolean value2) {
            addCriterion("emotion5 not between", value1, value2, "emotion5");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}