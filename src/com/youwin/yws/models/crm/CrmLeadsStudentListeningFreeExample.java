package com.youwin.yws.models.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmLeadsStudentListeningFreeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmLeadsStudentListeningFreeExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdIsNull() {
            addCriterion("organizations_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdIsNotNull() {
            addCriterion("organizations_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdEqualTo(Long value) {
            addCriterion("organizations_id =", value, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdNotEqualTo(Long value) {
            addCriterion("organizations_id <>", value, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdGreaterThan(Long value) {
            addCriterion("organizations_id >", value, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("organizations_id >=", value, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdLessThan(Long value) {
            addCriterion("organizations_id <", value, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdLessThanOrEqualTo(Long value) {
            addCriterion("organizations_id <=", value, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdIn(List<Long> values) {
            addCriterion("organizations_id in", values, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdNotIn(List<Long> values) {
            addCriterion("organizations_id not in", values, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdBetween(Long value1, Long value2) {
            addCriterion("organizations_id between", value1, value2, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andOrganizationsIdNotBetween(Long value1, Long value2) {
            addCriterion("organizations_id not between", value1, value2, "organizationsId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdIsNull() {
            addCriterion("leads_student_id is null");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdIsNotNull() {
            addCriterion("leads_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdEqualTo(Long value) {
            addCriterion("leads_student_id =", value, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdNotEqualTo(Long value) {
            addCriterion("leads_student_id <>", value, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdGreaterThan(Long value) {
            addCriterion("leads_student_id >", value, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("leads_student_id >=", value, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdLessThan(Long value) {
            addCriterion("leads_student_id <", value, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdLessThanOrEqualTo(Long value) {
            addCriterion("leads_student_id <=", value, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdIn(List<Long> values) {
            addCriterion("leads_student_id in", values, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdNotIn(List<Long> values) {
            addCriterion("leads_student_id not in", values, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdBetween(Long value1, Long value2) {
            addCriterion("leads_student_id between", value1, value2, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andLeadsStudentIdNotBetween(Long value1, Long value2) {
            addCriterion("leads_student_id not between", value1, value2, "leadsStudentId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdIsNull() {
            addCriterion("teaching_course_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdIsNotNull() {
            addCriterion("teaching_course_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdEqualTo(Long value) {
            addCriterion("teaching_course_id =", value, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdNotEqualTo(Long value) {
            addCriterion("teaching_course_id <>", value, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdGreaterThan(Long value) {
            addCriterion("teaching_course_id >", value, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teaching_course_id >=", value, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdLessThan(Long value) {
            addCriterion("teaching_course_id <", value, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdLessThanOrEqualTo(Long value) {
            addCriterion("teaching_course_id <=", value, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdIn(List<Long> values) {
            addCriterion("teaching_course_id in", values, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdNotIn(List<Long> values) {
            addCriterion("teaching_course_id not in", values, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdBetween(Long value1, Long value2) {
            addCriterion("teaching_course_id between", value1, value2, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andTeachingCourseIdNotBetween(Long value1, Long value2) {
            addCriterion("teaching_course_id not between", value1, value2, "teachingCourseId");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseIsNull() {
            addCriterion("listening_test_hourse is null");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseIsNotNull() {
            addCriterion("listening_test_hourse is not null");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseEqualTo(Long value) {
            addCriterion("listening_test_hourse =", value, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseNotEqualTo(Long value) {
            addCriterion("listening_test_hourse <>", value, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseGreaterThan(Long value) {
            addCriterion("listening_test_hourse >", value, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseGreaterThanOrEqualTo(Long value) {
            addCriterion("listening_test_hourse >=", value, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseLessThan(Long value) {
            addCriterion("listening_test_hourse <", value, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseLessThanOrEqualTo(Long value) {
            addCriterion("listening_test_hourse <=", value, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseIn(List<Long> values) {
            addCriterion("listening_test_hourse in", values, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseNotIn(List<Long> values) {
            addCriterion("listening_test_hourse not in", values, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseBetween(Long value1, Long value2) {
            addCriterion("listening_test_hourse between", value1, value2, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningTestHourseNotBetween(Long value1, Long value2) {
            addCriterion("listening_test_hourse not between", value1, value2, "listeningTestHourse");
            return (Criteria) this;
        }

        public Criteria andListeningDateIsNull() {
            addCriterion("listening_date is null");
            return (Criteria) this;
        }

        public Criteria andListeningDateIsNotNull() {
            addCriterion("listening_date is not null");
            return (Criteria) this;
        }

        public Criteria andListeningDateEqualTo(Date value) {
            addCriterion("listening_date =", value, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateNotEqualTo(Date value) {
            addCriterion("listening_date <>", value, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateGreaterThan(Date value) {
            addCriterion("listening_date >", value, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateGreaterThanOrEqualTo(Date value) {
            addCriterion("listening_date >=", value, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateLessThan(Date value) {
            addCriterion("listening_date <", value, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateLessThanOrEqualTo(Date value) {
            addCriterion("listening_date <=", value, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateIn(List<Date> values) {
            addCriterion("listening_date in", values, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateNotIn(List<Date> values) {
            addCriterion("listening_date not in", values, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateBetween(Date value1, Date value2) {
            addCriterion("listening_date between", value1, value2, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningDateNotBetween(Date value1, Date value2) {
            addCriterion("listening_date not between", value1, value2, "listeningDate");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeIsNull() {
            addCriterion("listening_start_time is null");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeIsNotNull() {
            addCriterion("listening_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeEqualTo(Long value) {
            addCriterion("listening_start_time =", value, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeNotEqualTo(Long value) {
            addCriterion("listening_start_time <>", value, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeGreaterThan(Long value) {
            addCriterion("listening_start_time >", value, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("listening_start_time >=", value, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeLessThan(Long value) {
            addCriterion("listening_start_time <", value, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("listening_start_time <=", value, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeIn(List<Long> values) {
            addCriterion("listening_start_time in", values, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeNotIn(List<Long> values) {
            addCriterion("listening_start_time not in", values, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeBetween(Long value1, Long value2) {
            addCriterion("listening_start_time between", value1, value2, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("listening_start_time not between", value1, value2, "listeningStartTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeIsNull() {
            addCriterion("listening_end_time is null");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeIsNotNull() {
            addCriterion("listening_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeEqualTo(Long value) {
            addCriterion("listening_end_time =", value, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeNotEqualTo(Long value) {
            addCriterion("listening_end_time <>", value, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeGreaterThan(Long value) {
            addCriterion("listening_end_time >", value, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("listening_end_time >=", value, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeLessThan(Long value) {
            addCriterion("listening_end_time <", value, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("listening_end_time <=", value, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeIn(List<Long> values) {
            addCriterion("listening_end_time in", values, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeNotIn(List<Long> values) {
            addCriterion("listening_end_time not in", values, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeBetween(Long value1, Long value2) {
            addCriterion("listening_end_time between", value1, value2, "listeningEndTime");
            return (Criteria) this;
        }

        public Criteria andListeningEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("listening_end_time not between", value1, value2, "listeningEndTime");
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

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Long value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Long value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Long value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Long value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Long value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Long> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Long> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Long value1, Long value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Long value1, Long value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Long value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Long value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Long value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Long value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Long value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Long> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Long> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Long value1, Long value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Long value1, Long value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Boolean value) {
            addCriterion("is_deleted =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Boolean value) {
            addCriterion("is_deleted <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Boolean value) {
            addCriterion("is_deleted >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Boolean value) {
            addCriterion("is_deleted <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_deleted <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Boolean> values) {
            addCriterion("is_deleted in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Boolean> values) {
            addCriterion("is_deleted not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_deleted not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andExtIsNull() {
            addCriterion("ext is null");
            return (Criteria) this;
        }

        public Criteria andExtIsNotNull() {
            addCriterion("ext is not null");
            return (Criteria) this;
        }

        public Criteria andExtEqualTo(String value) {
            addCriterion("ext =", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotEqualTo(String value) {
            addCriterion("ext <>", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThan(String value) {
            addCriterion("ext >", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtGreaterThanOrEqualTo(String value) {
            addCriterion("ext >=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThan(String value) {
            addCriterion("ext <", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLessThanOrEqualTo(String value) {
            addCriterion("ext <=", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtLike(String value) {
            addCriterion("ext like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotLike(String value) {
            addCriterion("ext not like", value, "ext");
            return (Criteria) this;
        }

        public Criteria andExtIn(List<String> values) {
            addCriterion("ext in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotIn(List<String> values) {
            addCriterion("ext not in", values, "ext");
            return (Criteria) this;
        }

        public Criteria andExtBetween(String value1, String value2) {
            addCriterion("ext between", value1, value2, "ext");
            return (Criteria) this;
        }

        public Criteria andExtNotBetween(String value1, String value2) {
            addCriterion("ext not between", value1, value2, "ext");
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