package com.example.level1.entity;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public DepartmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idIsNull() {
            addCriterion("higher_dep_id is null");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idIsNotNull() {
            addCriterion("higher_dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idEqualTo(String value) {
            addCriterion("higher_dep_id =", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idNotEqualTo(String value) {
            addCriterion("higher_dep_id <>", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idGreaterThan(String value) {
            addCriterion("higher_dep_id >", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idGreaterThanOrEqualTo(String value) {
            addCriterion("higher_dep_id >=", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idLessThan(String value) {
            addCriterion("higher_dep_id <", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idLessThanOrEqualTo(String value) {
            addCriterion("higher_dep_id <=", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idLike(String value) {
            addCriterion("higher_dep_id like", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idNotLike(String value) {
            addCriterion("higher_dep_id not like", value, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idIn(List<String> values) {
            addCriterion("higher_dep_id in", values, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idNotIn(List<String> values) {
            addCriterion("higher_dep_id not in", values, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idBetween(String value1, String value2) {
            addCriterion("higher_dep_id between", value1, value2, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idNotBetween(String value1, String value2) {
            addCriterion("higher_dep_id not between", value1, value2, "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompany_idIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_idEqualTo(String value) {
            addCriterion("company_id =", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotEqualTo(String value) {
            addCriterion("company_id <>", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idGreaterThan(String value) {
            addCriterion("company_id >", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idLessThan(String value) {
            addCriterion("company_id <", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idLike(String value) {
            addCriterion("company_id like", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotLike(String value) {
            addCriterion("company_id not like", value, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idIn(List<String> values) {
            addCriterion("company_id in", values, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotIn(List<String> values) {
            addCriterion("company_id not in", values, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "company_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "company_id");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(`name`) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andHigher_dep_idLikeInsensitive(String value) {
            addCriterion("upper(higher_dep_id) like", value.toUpperCase(), "higher_dep_id");
            return (Criteria) this;
        }

        public Criteria andCompany_idLikeInsensitive(String value) {
            addCriterion("upper(company_id) like", value.toUpperCase(), "company_id");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 11 20:27:20 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:20 CST 2022
     */
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