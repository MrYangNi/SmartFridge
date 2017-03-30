package com.jayce.food.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FoodTrackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FoodTrackExample() {
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

        public Criteria andTrackIdIsNull() {
            addCriterion("track_id is null");
            return (Criteria) this;
        }

        public Criteria andTrackIdIsNotNull() {
            addCriterion("track_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrackIdEqualTo(Long value) {
            addCriterion("track_id =", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotEqualTo(Long value) {
            addCriterion("track_id <>", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdGreaterThan(Long value) {
            addCriterion("track_id >", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdGreaterThanOrEqualTo(Long value) {
            addCriterion("track_id >=", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdLessThan(Long value) {
            addCriterion("track_id <", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdLessThanOrEqualTo(Long value) {
            addCriterion("track_id <=", value, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdIn(List<Long> values) {
            addCriterion("track_id in", values, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotIn(List<Long> values) {
            addCriterion("track_id not in", values, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdBetween(Long value1, Long value2) {
            addCriterion("track_id between", value1, value2, "trackId");
            return (Criteria) this;
        }

        public Criteria andTrackIdNotBetween(Long value1, Long value2) {
            addCriterion("track_id not between", value1, value2, "trackId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNull() {
            addCriterion("food_id is null");
            return (Criteria) this;
        }

        public Criteria andFoodIdIsNotNull() {
            addCriterion("food_id is not null");
            return (Criteria) this;
        }

        public Criteria andFoodIdEqualTo(Long value) {
            addCriterion("food_id =", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotEqualTo(Long value) {
            addCriterion("food_id <>", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThan(Long value) {
            addCriterion("food_id >", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("food_id >=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThan(Long value) {
            addCriterion("food_id <", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdLessThanOrEqualTo(Long value) {
            addCriterion("food_id <=", value, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdIn(List<Long> values) {
            addCriterion("food_id in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotIn(List<Long> values) {
            addCriterion("food_id not in", values, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdBetween(Long value1, Long value2) {
            addCriterion("food_id between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andFoodIdNotBetween(Long value1, Long value2) {
            addCriterion("food_id not between", value1, value2, "foodId");
            return (Criteria) this;
        }

        public Criteria andProcessMethodIsNull() {
            addCriterion("process_method is null");
            return (Criteria) this;
        }

        public Criteria andProcessMethodIsNotNull() {
            addCriterion("process_method is not null");
            return (Criteria) this;
        }

        public Criteria andProcessMethodEqualTo(Long value) {
            addCriterion("process_method =", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotEqualTo(Long value) {
            addCriterion("process_method <>", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodGreaterThan(Long value) {
            addCriterion("process_method >", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodGreaterThanOrEqualTo(Long value) {
            addCriterion("process_method >=", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodLessThan(Long value) {
            addCriterion("process_method <", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodLessThanOrEqualTo(Long value) {
            addCriterion("process_method <=", value, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodIn(List<Long> values) {
            addCriterion("process_method in", values, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotIn(List<Long> values) {
            addCriterion("process_method not in", values, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodBetween(Long value1, Long value2) {
            addCriterion("process_method between", value1, value2, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessMethodNotBetween(Long value1, Long value2) {
            addCriterion("process_method not between", value1, value2, "processMethod");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNull() {
            addCriterion("process_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIsNotNull() {
            addCriterion("process_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTimeEqualTo(Date value) {
            addCriterion("process_time =", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotEqualTo(Date value) {
            addCriterion("process_time <>", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThan(Date value) {
            addCriterion("process_time >", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("process_time >=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThan(Date value) {
            addCriterion("process_time <", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeLessThanOrEqualTo(Date value) {
            addCriterion("process_time <=", value, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeIn(List<Date> values) {
            addCriterion("process_time in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotIn(List<Date> values) {
            addCriterion("process_time not in", values, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeBetween(Date value1, Date value2) {
            addCriterion("process_time between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessTimeNotBetween(Date value1, Date value2) {
            addCriterion("process_time not between", value1, value2, "processTime");
            return (Criteria) this;
        }

        public Criteria andProcessUnitIsNull() {
            addCriterion("process_unit is null");
            return (Criteria) this;
        }

        public Criteria andProcessUnitIsNotNull() {
            addCriterion("process_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProcessUnitEqualTo(String value) {
            addCriterion("process_unit =", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitNotEqualTo(String value) {
            addCriterion("process_unit <>", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitGreaterThan(String value) {
            addCriterion("process_unit >", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitGreaterThanOrEqualTo(String value) {
            addCriterion("process_unit >=", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitLessThan(String value) {
            addCriterion("process_unit <", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitLessThanOrEqualTo(String value) {
            addCriterion("process_unit <=", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitLike(String value) {
            addCriterion("process_unit like", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitNotLike(String value) {
            addCriterion("process_unit not like", value, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitIn(List<String> values) {
            addCriterion("process_unit in", values, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitNotIn(List<String> values) {
            addCriterion("process_unit not in", values, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitBetween(String value1, String value2) {
            addCriterion("process_unit between", value1, value2, "processUnit");
            return (Criteria) this;
        }

        public Criteria andProcessUnitNotBetween(String value1, String value2) {
            addCriterion("process_unit not between", value1, value2, "processUnit");
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