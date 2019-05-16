package com.demo.bean;

import java.util.ArrayList;
import java.util.List;

public class CourseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public CourseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
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

        public Criteria andCourIdIsNull() {
            addCriterion("cour_id is null");
            return (Criteria) this;
        }

        public Criteria andCourIdIsNotNull() {
            addCriterion("cour_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourIdEqualTo(String value) {
            addCriterion("cour_id =", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotEqualTo(String value) {
            addCriterion("cour_id <>", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdGreaterThan(String value) {
            addCriterion("cour_id >", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdGreaterThanOrEqualTo(String value) {
            addCriterion("cour_id >=", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLessThan(String value) {
            addCriterion("cour_id <", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLessThanOrEqualTo(String value) {
            addCriterion("cour_id <=", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLike(String value) {
            addCriterion("cour_id like", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotLike(String value) {
            addCriterion("cour_id not like", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdIn(List<String> values) {
            addCriterion("cour_id in", values, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotIn(List<String> values) {
            addCriterion("cour_id not in", values, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdBetween(String value1, String value2) {
            addCriterion("cour_id between", value1, value2, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotBetween(String value1, String value2) {
            addCriterion("cour_id not between", value1, value2, "courId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNull() {
            addCriterion("cour_name is null");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNotNull() {
            addCriterion("cour_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourNameEqualTo(String value) {
            addCriterion("cour_name =", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotEqualTo(String value) {
            addCriterion("cour_name <>", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThan(String value) {
            addCriterion("cour_name >", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThanOrEqualTo(String value) {
            addCriterion("cour_name >=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThan(String value) {
            addCriterion("cour_name <", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThanOrEqualTo(String value) {
            addCriterion("cour_name <=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLike(String value) {
            addCriterion("cour_name like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotLike(String value) {
            addCriterion("cour_name not like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameIn(List<String> values) {
            addCriterion("cour_name in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotIn(List<String> values) {
            addCriterion("cour_name not in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameBetween(String value1, String value2) {
            addCriterion("cour_name between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotBetween(String value1, String value2) {
            addCriterion("cour_name not between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCourDescIsNull() {
            addCriterion("cour_desc is null");
            return (Criteria) this;
        }

        public Criteria andCourDescIsNotNull() {
            addCriterion("cour_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCourDescEqualTo(String value) {
            addCriterion("cour_desc =", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescNotEqualTo(String value) {
            addCriterion("cour_desc <>", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescGreaterThan(String value) {
            addCriterion("cour_desc >", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescGreaterThanOrEqualTo(String value) {
            addCriterion("cour_desc >=", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescLessThan(String value) {
            addCriterion("cour_desc <", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescLessThanOrEqualTo(String value) {
            addCriterion("cour_desc <=", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescLike(String value) {
            addCriterion("cour_desc like", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescNotLike(String value) {
            addCriterion("cour_desc not like", value, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescIn(List<String> values) {
            addCriterion("cour_desc in", values, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescNotIn(List<String> values) {
            addCriterion("cour_desc not in", values, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescBetween(String value1, String value2) {
            addCriterion("cour_desc between", value1, value2, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourDescNotBetween(String value1, String value2) {
            addCriterion("cour_desc not between", value1, value2, "courDesc");
            return (Criteria) this;
        }

        public Criteria andCourFileIsNull() {
            addCriterion("cour_file is null");
            return (Criteria) this;
        }

        public Criteria andCourFileIsNotNull() {
            addCriterion("cour_file is not null");
            return (Criteria) this;
        }

        public Criteria andCourFileEqualTo(String value) {
            addCriterion("cour_file =", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileNotEqualTo(String value) {
            addCriterion("cour_file <>", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileGreaterThan(String value) {
            addCriterion("cour_file >", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileGreaterThanOrEqualTo(String value) {
            addCriterion("cour_file >=", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileLessThan(String value) {
            addCriterion("cour_file <", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileLessThanOrEqualTo(String value) {
            addCriterion("cour_file <=", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileLike(String value) {
            addCriterion("cour_file like", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileNotLike(String value) {
            addCriterion("cour_file not like", value, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileIn(List<String> values) {
            addCriterion("cour_file in", values, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileNotIn(List<String> values) {
            addCriterion("cour_file not in", values, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileBetween(String value1, String value2) {
            addCriterion("cour_file between", value1, value2, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileNotBetween(String value1, String value2) {
            addCriterion("cour_file not between", value1, value2, "courFile");
            return (Criteria) this;
        }

        public Criteria andCourFileNameIsNull() {
            addCriterion("cour_file_name is null");
            return (Criteria) this;
        }

        public Criteria andCourFileNameIsNotNull() {
            addCriterion("cour_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourFileNameEqualTo(String value) {
            addCriterion("cour_file_name =", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameNotEqualTo(String value) {
            addCriterion("cour_file_name <>", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameGreaterThan(String value) {
            addCriterion("cour_file_name >", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("cour_file_name >=", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameLessThan(String value) {
            addCriterion("cour_file_name <", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameLessThanOrEqualTo(String value) {
            addCriterion("cour_file_name <=", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameLike(String value) {
            addCriterion("cour_file_name like", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameNotLike(String value) {
            addCriterion("cour_file_name not like", value, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameIn(List<String> values) {
            addCriterion("cour_file_name in", values, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameNotIn(List<String> values) {
            addCriterion("cour_file_name not in", values, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameBetween(String value1, String value2) {
            addCriterion("cour_file_name between", value1, value2, "courFileName");
            return (Criteria) this;
        }

        public Criteria andCourFileNameNotBetween(String value1, String value2) {
            addCriterion("cour_file_name not between", value1, value2, "courFileName");
            return (Criteria) this;
        }

        public Criteria andStaTimeIsNull() {
            addCriterion("sta_time is null");
            return (Criteria) this;
        }

        public Criteria andStaTimeIsNotNull() {
            addCriterion("sta_time is not null");
            return (Criteria) this;
        }

        public Criteria andStaTimeEqualTo(String value) {
            addCriterion("sta_time =", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotEqualTo(String value) {
            addCriterion("sta_time <>", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeGreaterThan(String value) {
            addCriterion("sta_time >", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeGreaterThanOrEqualTo(String value) {
            addCriterion("sta_time >=", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeLessThan(String value) {
            addCriterion("sta_time <", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeLessThanOrEqualTo(String value) {
            addCriterion("sta_time <=", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeLike(String value) {
            addCriterion("sta_time like", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotLike(String value) {
            addCriterion("sta_time not like", value, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeIn(List<String> values) {
            addCriterion("sta_time in", values, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotIn(List<String> values) {
            addCriterion("sta_time not in", values, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeBetween(String value1, String value2) {
            addCriterion("sta_time between", value1, value2, "staTime");
            return (Criteria) this;
        }

        public Criteria andStaTimeNotBetween(String value1, String value2) {
            addCriterion("sta_time not between", value1, value2, "staTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(String value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(String value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(String value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(String value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(String value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLike(String value) {
            addCriterion("end_time like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotLike(String value) {
            addCriterion("end_time not like", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<String> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<String> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(String value1, String value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(String value1, String value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andFullScoreIsNull() {
            addCriterion("full_score is null");
            return (Criteria) this;
        }

        public Criteria andFullScoreIsNotNull() {
            addCriterion("full_score is not null");
            return (Criteria) this;
        }

        public Criteria andFullScoreEqualTo(Integer value) {
            addCriterion("full_score =", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotEqualTo(Integer value) {
            addCriterion("full_score <>", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreGreaterThan(Integer value) {
            addCriterion("full_score >", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("full_score >=", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreLessThan(Integer value) {
            addCriterion("full_score <", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreLessThanOrEqualTo(Integer value) {
            addCriterion("full_score <=", value, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreIn(List<Integer> values) {
            addCriterion("full_score in", values, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotIn(List<Integer> values) {
            addCriterion("full_score not in", values, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreBetween(Integer value1, Integer value2) {
            addCriterion("full_score between", value1, value2, "fullScore");
            return (Criteria) this;
        }

        public Criteria andFullScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("full_score not between", value1, value2, "fullScore");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCourDirIdIsNull() {
            addCriterion("cour_dir_id is null");
            return (Criteria) this;
        }

        public Criteria andCourDirIdIsNotNull() {
            addCriterion("cour_dir_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourDirIdEqualTo(String value) {
            addCriterion("cour_dir_id =", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdNotEqualTo(String value) {
            addCriterion("cour_dir_id <>", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdGreaterThan(String value) {
            addCriterion("cour_dir_id >", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdGreaterThanOrEqualTo(String value) {
            addCriterion("cour_dir_id >=", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdLessThan(String value) {
            addCriterion("cour_dir_id <", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdLessThanOrEqualTo(String value) {
            addCriterion("cour_dir_id <=", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdLike(String value) {
            addCriterion("cour_dir_id like", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdNotLike(String value) {
            addCriterion("cour_dir_id not like", value, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdIn(List<String> values) {
            addCriterion("cour_dir_id in", values, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdNotIn(List<String> values) {
            addCriterion("cour_dir_id not in", values, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdBetween(String value1, String value2) {
            addCriterion("cour_dir_id between", value1, value2, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourDirIdNotBetween(String value1, String value2) {
            addCriterion("cour_dir_id not between", value1, value2, "courDirId");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeIsNull() {
            addCriterion("cour_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeIsNotNull() {
            addCriterion("cour_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeEqualTo(String value) {
            addCriterion("cour_create_time =", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeNotEqualTo(String value) {
            addCriterion("cour_create_time <>", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeGreaterThan(String value) {
            addCriterion("cour_create_time >", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("cour_create_time >=", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeLessThan(String value) {
            addCriterion("cour_create_time <", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("cour_create_time <=", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeLike(String value) {
            addCriterion("cour_create_time like", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeNotLike(String value) {
            addCriterion("cour_create_time not like", value, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeIn(List<String> values) {
            addCriterion("cour_create_time in", values, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeNotIn(List<String> values) {
            addCriterion("cour_create_time not in", values, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeBetween(String value1, String value2) {
            addCriterion("cour_create_time between", value1, value2, "courCreateTime");
            return (Criteria) this;
        }

        public Criteria andCourCreateTimeNotBetween(String value1, String value2) {
            addCriterion("cour_create_time not between", value1, value2, "courCreateTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 12 21:16:36 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table course
     *
     * @mbggenerated Fri Apr 12 21:16:36 CST 2019
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