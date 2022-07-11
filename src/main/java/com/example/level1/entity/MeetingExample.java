package com.example.level1.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeetingExample {
    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    protected String orderByClause;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    protected boolean distinct;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public MeetingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
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
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
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

        public Criteria andStart_timeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStart_timeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStart_timeEqualTo(Date value) {
            addCriterion("start_time =", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThan(Date value) {
            addCriterion("start_time >", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThan(Date value) {
            addCriterion("start_time <", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeIn(List<Date> values) {
            addCriterion("start_time in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andStart_timeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "start_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andIs_periodIsNull() {
            addCriterion("is_period is null");
            return (Criteria) this;
        }

        public Criteria andIs_periodIsNotNull() {
            addCriterion("is_period is not null");
            return (Criteria) this;
        }

        public Criteria andIs_periodEqualTo(Boolean value) {
            addCriterion("is_period =", value, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodNotEqualTo(Boolean value) {
            addCriterion("is_period <>", value, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodGreaterThan(Boolean value) {
            addCriterion("is_period >", value, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_period >=", value, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodLessThan(Boolean value) {
            addCriterion("is_period <", value, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodLessThanOrEqualTo(Boolean value) {
            addCriterion("is_period <=", value, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodIn(List<Boolean> values) {
            addCriterion("is_period in", values, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodNotIn(List<Boolean> values) {
            addCriterion("is_period not in", values, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodBetween(Boolean value1, Boolean value2) {
            addCriterion("is_period between", value1, value2, "is_period");
            return (Criteria) this;
        }

        public Criteria andIs_periodNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_period not between", value1, value2, "is_period");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRoom_idIsNull() {
            addCriterion("room_id is null");
            return (Criteria) this;
        }

        public Criteria andRoom_idIsNotNull() {
            addCriterion("room_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoom_idEqualTo(String value) {
            addCriterion("room_id =", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotEqualTo(String value) {
            addCriterion("room_id <>", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idGreaterThan(String value) {
            addCriterion("room_id >", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idGreaterThanOrEqualTo(String value) {
            addCriterion("room_id >=", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idLessThan(String value) {
            addCriterion("room_id <", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idLessThanOrEqualTo(String value) {
            addCriterion("room_id <=", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idLike(String value) {
            addCriterion("room_id like", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotLike(String value) {
            addCriterion("room_id not like", value, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idIn(List<String> values) {
            addCriterion("room_id in", values, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotIn(List<String> values) {
            addCriterion("room_id not in", values, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idBetween(String value1, String value2) {
            addCriterion("room_id between", value1, value2, "room_id");
            return (Criteria) this;
        }

        public Criteria andRoom_idNotBetween(String value1, String value2) {
            addCriterion("room_id not between", value1, value2, "room_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idIsNull() {
            addCriterion("reserve_person_id is null");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idIsNotNull() {
            addCriterion("reserve_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idEqualTo(String value) {
            addCriterion("reserve_person_id =", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idNotEqualTo(String value) {
            addCriterion("reserve_person_id <>", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idGreaterThan(String value) {
            addCriterion("reserve_person_id >", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idGreaterThanOrEqualTo(String value) {
            addCriterion("reserve_person_id >=", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idLessThan(String value) {
            addCriterion("reserve_person_id <", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idLessThanOrEqualTo(String value) {
            addCriterion("reserve_person_id <=", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idLike(String value) {
            addCriterion("reserve_person_id like", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idNotLike(String value) {
            addCriterion("reserve_person_id not like", value, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idIn(List<String> values) {
            addCriterion("reserve_person_id in", values, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idNotIn(List<String> values) {
            addCriterion("reserve_person_id not in", values, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idBetween(String value1, String value2) {
            addCriterion("reserve_person_id between", value1, value2, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idNotBetween(String value1, String value2) {
            addCriterion("reserve_person_id not between", value1, value2, "reserve_person_id");
            return (Criteria) this;
        }

        public Criteria andIs_videoIsNull() {
            addCriterion("is_video is null");
            return (Criteria) this;
        }

        public Criteria andIs_videoIsNotNull() {
            addCriterion("is_video is not null");
            return (Criteria) this;
        }

        public Criteria andIs_videoEqualTo(Boolean value) {
            addCriterion("is_video =", value, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoNotEqualTo(Boolean value) {
            addCriterion("is_video <>", value, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoGreaterThan(Boolean value) {
            addCriterion("is_video >", value, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_video >=", value, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoLessThan(Boolean value) {
            addCriterion("is_video <", value, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoLessThanOrEqualTo(Boolean value) {
            addCriterion("is_video <=", value, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoIn(List<Boolean> values) {
            addCriterion("is_video in", values, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoNotIn(List<Boolean> values) {
            addCriterion("is_video not in", values, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoBetween(Boolean value1, Boolean value2) {
            addCriterion("is_video between", value1, value2, "is_video");
            return (Criteria) this;
        }

        public Criteria andIs_videoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_video not between", value1, value2, "is_video");
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

        public Criteria andRoom_idLikeInsensitive(String value) {
            addCriterion("upper(room_id) like", value.toUpperCase(), "room_id");
            return (Criteria) this;
        }

        public Criteria andReserve_person_idLikeInsensitive(String value) {
            addCriterion("upper(reserve_person_id) like", value.toUpperCase(), "reserve_person_id");
            return (Criteria) this;
        }
    }

    /**
     *
     * @mbg.generated do_not_delete_during_merge Mon Jul 11 20:27:25 CST 2022
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     *
     * @mbg.generated Mon Jul 11 20:27:25 CST 2022
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