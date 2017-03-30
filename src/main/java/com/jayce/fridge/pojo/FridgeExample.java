package com.jayce.fridge.pojo;

import java.util.ArrayList;
import java.util.List;

public class FridgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FridgeExample() {
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

        public Criteria andFridgeIdIsNull() {
            addCriterion("fridge_id is null");
            return (Criteria) this;
        }

        public Criteria andFridgeIdIsNotNull() {
            addCriterion("fridge_id is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeIdEqualTo(Long value) {
            addCriterion("fridge_id =", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotEqualTo(Long value) {
            addCriterion("fridge_id <>", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdGreaterThan(Long value) {
            addCriterion("fridge_id >", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("fridge_id >=", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdLessThan(Long value) {
            addCriterion("fridge_id <", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdLessThanOrEqualTo(Long value) {
            addCriterion("fridge_id <=", value, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdIn(List<Long> values) {
            addCriterion("fridge_id in", values, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotIn(List<Long> values) {
            addCriterion("fridge_id not in", values, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdBetween(Long value1, Long value2) {
            addCriterion("fridge_id between", value1, value2, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFridgeIdNotBetween(Long value1, Long value2) {
            addCriterion("fridge_id not between", value1, value2, "fridgeId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNull() {
            addCriterion("family_id is null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIsNotNull() {
            addCriterion("family_id is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyIdEqualTo(Long value) {
            addCriterion("family_id =", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotEqualTo(Long value) {
            addCriterion("family_id <>", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThan(Long value) {
            addCriterion("family_id >", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("family_id >=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThan(Long value) {
            addCriterion("family_id <", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdLessThanOrEqualTo(Long value) {
            addCriterion("family_id <=", value, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdIn(List<Long> values) {
            addCriterion("family_id in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotIn(List<Long> values) {
            addCriterion("family_id not in", values, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdBetween(Long value1, Long value2) {
            addCriterion("family_id between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFamilyIdNotBetween(Long value1, Long value2) {
            addCriterion("family_id not between", value1, value2, "familyId");
            return (Criteria) this;
        }

        public Criteria andFridgeNameIsNull() {
            addCriterion("fridge_name is null");
            return (Criteria) this;
        }

        public Criteria andFridgeNameIsNotNull() {
            addCriterion("fridge_name is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeNameEqualTo(String value) {
            addCriterion("fridge_name =", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameNotEqualTo(String value) {
            addCriterion("fridge_name <>", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameGreaterThan(String value) {
            addCriterion("fridge_name >", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameGreaterThanOrEqualTo(String value) {
            addCriterion("fridge_name >=", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameLessThan(String value) {
            addCriterion("fridge_name <", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameLessThanOrEqualTo(String value) {
            addCriterion("fridge_name <=", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameLike(String value) {
            addCriterion("fridge_name like", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameNotLike(String value) {
            addCriterion("fridge_name not like", value, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameIn(List<String> values) {
            addCriterion("fridge_name in", values, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameNotIn(List<String> values) {
            addCriterion("fridge_name not in", values, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameBetween(String value1, String value2) {
            addCriterion("fridge_name between", value1, value2, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeNameNotBetween(String value1, String value2) {
            addCriterion("fridge_name not between", value1, value2, "fridgeName");
            return (Criteria) this;
        }

        public Criteria andFridgeSnIsNull() {
            addCriterion("fridge_sn is null");
            return (Criteria) this;
        }

        public Criteria andFridgeSnIsNotNull() {
            addCriterion("fridge_sn is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeSnEqualTo(String value) {
            addCriterion("fridge_sn =", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnNotEqualTo(String value) {
            addCriterion("fridge_sn <>", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnGreaterThan(String value) {
            addCriterion("fridge_sn >", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnGreaterThanOrEqualTo(String value) {
            addCriterion("fridge_sn >=", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnLessThan(String value) {
            addCriterion("fridge_sn <", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnLessThanOrEqualTo(String value) {
            addCriterion("fridge_sn <=", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnLike(String value) {
            addCriterion("fridge_sn like", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnNotLike(String value) {
            addCriterion("fridge_sn not like", value, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnIn(List<String> values) {
            addCriterion("fridge_sn in", values, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnNotIn(List<String> values) {
            addCriterion("fridge_sn not in", values, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnBetween(String value1, String value2) {
            addCriterion("fridge_sn between", value1, value2, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSnNotBetween(String value1, String value2) {
            addCriterion("fridge_sn not between", value1, value2, "fridgeSn");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecIsNull() {
            addCriterion("fridge_spec is null");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecIsNotNull() {
            addCriterion("fridge_spec is not null");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecEqualTo(String value) {
            addCriterion("fridge_spec =", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecNotEqualTo(String value) {
            addCriterion("fridge_spec <>", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecGreaterThan(String value) {
            addCriterion("fridge_spec >", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecGreaterThanOrEqualTo(String value) {
            addCriterion("fridge_spec >=", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecLessThan(String value) {
            addCriterion("fridge_spec <", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecLessThanOrEqualTo(String value) {
            addCriterion("fridge_spec <=", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecLike(String value) {
            addCriterion("fridge_spec like", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecNotLike(String value) {
            addCriterion("fridge_spec not like", value, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecIn(List<String> values) {
            addCriterion("fridge_spec in", values, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecNotIn(List<String> values) {
            addCriterion("fridge_spec not in", values, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecBetween(String value1, String value2) {
            addCriterion("fridge_spec between", value1, value2, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andFridgeSpecNotBetween(String value1, String value2) {
            addCriterion("fridge_spec not between", value1, value2, "fridgeSpec");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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