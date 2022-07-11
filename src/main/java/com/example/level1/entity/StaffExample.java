package com.example.level1.entity;

import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public StaffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
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
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
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

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCloud_accountIsNull() {
            addCriterion("cloud_account is null");
            return (Criteria) this;
        }

        public Criteria andCloud_accountIsNotNull() {
            addCriterion("cloud_account is not null");
            return (Criteria) this;
        }

        public Criteria andCloud_accountEqualTo(String value) {
            addCriterion("cloud_account =", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountNotEqualTo(String value) {
            addCriterion("cloud_account <>", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountGreaterThan(String value) {
            addCriterion("cloud_account >", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountGreaterThanOrEqualTo(String value) {
            addCriterion("cloud_account >=", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountLessThan(String value) {
            addCriterion("cloud_account <", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountLessThanOrEqualTo(String value) {
            addCriterion("cloud_account <=", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountLike(String value) {
            addCriterion("cloud_account like", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountNotLike(String value) {
            addCriterion("cloud_account not like", value, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountIn(List<String> values) {
            addCriterion("cloud_account in", values, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountNotIn(List<String> values) {
            addCriterion("cloud_account not in", values, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountBetween(String value1, String value2) {
            addCriterion("cloud_account between", value1, value2, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_accountNotBetween(String value1, String value2) {
            addCriterion("cloud_account not between", value1, value2, "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordIsNull() {
            addCriterion("cloud_password is null");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordIsNotNull() {
            addCriterion("cloud_password is not null");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordEqualTo(String value) {
            addCriterion("cloud_password =", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordNotEqualTo(String value) {
            addCriterion("cloud_password <>", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordGreaterThan(String value) {
            addCriterion("cloud_password >", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordGreaterThanOrEqualTo(String value) {
            addCriterion("cloud_password >=", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordLessThan(String value) {
            addCriterion("cloud_password <", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordLessThanOrEqualTo(String value) {
            addCriterion("cloud_password <=", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordLike(String value) {
            addCriterion("cloud_password like", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordNotLike(String value) {
            addCriterion("cloud_password not like", value, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordIn(List<String> values) {
            addCriterion("cloud_password in", values, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordNotIn(List<String> values) {
            addCriterion("cloud_password not in", values, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordBetween(String value1, String value2) {
            addCriterion("cloud_password between", value1, value2, "cloud_password");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordNotBetween(String value1, String value2) {
            addCriterion("cloud_password not between", value1, value2, "cloud_password");
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

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(sex) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(phone) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andCloud_accountLikeInsensitive(String value) {
            addCriterion("upper(cloud_account) like", value.toUpperCase(), "cloud_account");
            return (Criteria) this;
        }

        public Criteria andCloud_passwordLikeInsensitive(String value) {
            addCriterion("upper(cloud_password) like", value.toUpperCase(), "cloud_password");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 11 20:27:33 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:33 CST 2022
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