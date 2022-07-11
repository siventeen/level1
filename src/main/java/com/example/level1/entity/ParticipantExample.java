package com.example.level1.entity;

import java.util.ArrayList;
import java.util.List;

public class ParticipantExample {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public ParticipantExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
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
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
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

        public Criteria andStaff_idIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaff_idIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaff_idEqualTo(String value) {
            addCriterion("staff_id =", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idGreaterThan(String value) {
            addCriterion("staff_id >", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLessThan(String value) {
            addCriterion("staff_id <", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLike(String value) {
            addCriterion("staff_id like", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotLike(String value) {
            addCriterion("staff_id not like", value, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idIn(List<String> values) {
            addCriterion("staff_id in", values, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staff_id");
            return (Criteria) this;
        }

        public Criteria andStaff_idNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staff_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeeting_idIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeeting_idEqualTo(String value) {
            addCriterion("meeting_id =", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idNotEqualTo(String value) {
            addCriterion("meeting_id <>", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idGreaterThan(String value) {
            addCriterion("meeting_id >", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_id >=", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idLessThan(String value) {
            addCriterion("meeting_id <", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idLessThanOrEqualTo(String value) {
            addCriterion("meeting_id <=", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idLike(String value) {
            addCriterion("meeting_id like", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idNotLike(String value) {
            addCriterion("meeting_id not like", value, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idIn(List<String> values) {
            addCriterion("meeting_id in", values, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idNotIn(List<String> values) {
            addCriterion("meeting_id not in", values, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idBetween(String value1, String value2) {
            addCriterion("meeting_id between", value1, value2, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idNotBetween(String value1, String value2) {
            addCriterion("meeting_id not between", value1, value2, "meeting_id");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(id) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andStaff_idLikeInsensitive(String value) {
            addCriterion("upper(staff_id) like", value.toUpperCase(), "staff_id");
            return (Criteria) this;
        }

        public Criteria andMeeting_idLikeInsensitive(String value) {
            addCriterion("upper(meeting_id) like", value.toUpperCase(), "meeting_id");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 11 20:27:28 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:28 CST 2022
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