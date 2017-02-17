package com.cn.ts.business.model;

import java.util.ArrayList;
import java.util.List;

public class DatademoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatademoExample() {
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

        public Criteria andData1IsNull() {
            addCriterion("DATA1 is null");
            return (Criteria) this;
        }

        public Criteria andData1IsNotNull() {
            addCriterion("DATA1 is not null");
            return (Criteria) this;
        }

        public Criteria andData1EqualTo(String value) {
            addCriterion("DATA1 =", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotEqualTo(String value) {
            addCriterion("DATA1 <>", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1GreaterThan(String value) {
            addCriterion("DATA1 >", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1GreaterThanOrEqualTo(String value) {
            addCriterion("DATA1 >=", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1LessThan(String value) {
            addCriterion("DATA1 <", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1LessThanOrEqualTo(String value) {
            addCriterion("DATA1 <=", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1Like(String value) {
            addCriterion("DATA1 like", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotLike(String value) {
            addCriterion("DATA1 not like", value, "data1");
            return (Criteria) this;
        }

        public Criteria andData1In(List<String> values) {
            addCriterion("DATA1 in", values, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotIn(List<String> values) {
            addCriterion("DATA1 not in", values, "data1");
            return (Criteria) this;
        }

        public Criteria andData1Between(String value1, String value2) {
            addCriterion("DATA1 between", value1, value2, "data1");
            return (Criteria) this;
        }

        public Criteria andData1NotBetween(String value1, String value2) {
            addCriterion("DATA1 not between", value1, value2, "data1");
            return (Criteria) this;
        }

        public Criteria andData2IsNull() {
            addCriterion("DATA2 is null");
            return (Criteria) this;
        }

        public Criteria andData2IsNotNull() {
            addCriterion("DATA2 is not null");
            return (Criteria) this;
        }

        public Criteria andData2EqualTo(String value) {
            addCriterion("DATA2 =", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotEqualTo(String value) {
            addCriterion("DATA2 <>", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2GreaterThan(String value) {
            addCriterion("DATA2 >", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2GreaterThanOrEqualTo(String value) {
            addCriterion("DATA2 >=", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2LessThan(String value) {
            addCriterion("DATA2 <", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2LessThanOrEqualTo(String value) {
            addCriterion("DATA2 <=", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2Like(String value) {
            addCriterion("DATA2 like", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotLike(String value) {
            addCriterion("DATA2 not like", value, "data2");
            return (Criteria) this;
        }

        public Criteria andData2In(List<String> values) {
            addCriterion("DATA2 in", values, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotIn(List<String> values) {
            addCriterion("DATA2 not in", values, "data2");
            return (Criteria) this;
        }

        public Criteria andData2Between(String value1, String value2) {
            addCriterion("DATA2 between", value1, value2, "data2");
            return (Criteria) this;
        }

        public Criteria andData2NotBetween(String value1, String value2) {
            addCriterion("DATA2 not between", value1, value2, "data2");
            return (Criteria) this;
        }

        public Criteria andData3IsNull() {
            addCriterion("DATA3 is null");
            return (Criteria) this;
        }

        public Criteria andData3IsNotNull() {
            addCriterion("DATA3 is not null");
            return (Criteria) this;
        }

        public Criteria andData3EqualTo(String value) {
            addCriterion("DATA3 =", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotEqualTo(String value) {
            addCriterion("DATA3 <>", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3GreaterThan(String value) {
            addCriterion("DATA3 >", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3GreaterThanOrEqualTo(String value) {
            addCriterion("DATA3 >=", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3LessThan(String value) {
            addCriterion("DATA3 <", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3LessThanOrEqualTo(String value) {
            addCriterion("DATA3 <=", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3Like(String value) {
            addCriterion("DATA3 like", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotLike(String value) {
            addCriterion("DATA3 not like", value, "data3");
            return (Criteria) this;
        }

        public Criteria andData3In(List<String> values) {
            addCriterion("DATA3 in", values, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotIn(List<String> values) {
            addCriterion("DATA3 not in", values, "data3");
            return (Criteria) this;
        }

        public Criteria andData3Between(String value1, String value2) {
            addCriterion("DATA3 between", value1, value2, "data3");
            return (Criteria) this;
        }

        public Criteria andData3NotBetween(String value1, String value2) {
            addCriterion("DATA3 not between", value1, value2, "data3");
            return (Criteria) this;
        }

        public Criteria andData4IsNull() {
            addCriterion("DATA4 is null");
            return (Criteria) this;
        }

        public Criteria andData4IsNotNull() {
            addCriterion("DATA4 is not null");
            return (Criteria) this;
        }

        public Criteria andData4EqualTo(String value) {
            addCriterion("DATA4 =", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotEqualTo(String value) {
            addCriterion("DATA4 <>", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4GreaterThan(String value) {
            addCriterion("DATA4 >", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4GreaterThanOrEqualTo(String value) {
            addCriterion("DATA4 >=", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4LessThan(String value) {
            addCriterion("DATA4 <", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4LessThanOrEqualTo(String value) {
            addCriterion("DATA4 <=", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4Like(String value) {
            addCriterion("DATA4 like", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotLike(String value) {
            addCriterion("DATA4 not like", value, "data4");
            return (Criteria) this;
        }

        public Criteria andData4In(List<String> values) {
            addCriterion("DATA4 in", values, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotIn(List<String> values) {
            addCriterion("DATA4 not in", values, "data4");
            return (Criteria) this;
        }

        public Criteria andData4Between(String value1, String value2) {
            addCriterion("DATA4 between", value1, value2, "data4");
            return (Criteria) this;
        }

        public Criteria andData4NotBetween(String value1, String value2) {
            addCriterion("DATA4 not between", value1, value2, "data4");
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