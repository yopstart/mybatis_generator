package com.youwin.yws.models.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmDataStudentDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmDataStudentDetailExample() {
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

        public Criteria andCustomerStudentIdIsNull() {
            addCriterion("customer_student_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdIsNotNull() {
            addCriterion("customer_student_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdEqualTo(Long value) {
            addCriterion("customer_student_id =", value, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdNotEqualTo(Long value) {
            addCriterion("customer_student_id <>", value, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdGreaterThan(Long value) {
            addCriterion("customer_student_id >", value, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("customer_student_id >=", value, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdLessThan(Long value) {
            addCriterion("customer_student_id <", value, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdLessThanOrEqualTo(Long value) {
            addCriterion("customer_student_id <=", value, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdIn(List<Long> values) {
            addCriterion("customer_student_id in", values, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdNotIn(List<Long> values) {
            addCriterion("customer_student_id not in", values, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdBetween(Long value1, Long value2) {
            addCriterion("customer_student_id between", value1, value2, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andCustomerStudentIdNotBetween(Long value1, Long value2) {
            addCriterion("customer_student_id not between", value1, value2, "customerStudentId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Integer value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Integer value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Integer value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Integer value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Integer> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Integer> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Integer value1, Integer value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNull() {
            addCriterion("grade_id is null");
            return (Criteria) this;
        }

        public Criteria andGradeIdIsNotNull() {
            addCriterion("grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andGradeIdEqualTo(Integer value) {
            addCriterion("grade_id =", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotEqualTo(Integer value) {
            addCriterion("grade_id <>", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThan(Integer value) {
            addCriterion("grade_id >", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_id >=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThan(Integer value) {
            addCriterion("grade_id <", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdLessThanOrEqualTo(Integer value) {
            addCriterion("grade_id <=", value, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdIn(List<Integer> values) {
            addCriterion("grade_id in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotIn(List<Integer> values) {
            addCriterion("grade_id not in", values, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdBetween(Integer value1, Integer value2) {
            addCriterion("grade_id between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andGradeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_id not between", value1, value2, "gradeId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdIsNull() {
            addCriterion("belong_school_id is null");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdIsNotNull() {
            addCriterion("belong_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdEqualTo(Long value) {
            addCriterion("belong_school_id =", value, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdNotEqualTo(Long value) {
            addCriterion("belong_school_id <>", value, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdGreaterThan(Long value) {
            addCriterion("belong_school_id >", value, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("belong_school_id >=", value, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdLessThan(Long value) {
            addCriterion("belong_school_id <", value, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdLessThanOrEqualTo(Long value) {
            addCriterion("belong_school_id <=", value, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdIn(List<Long> values) {
            addCriterion("belong_school_id in", values, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdNotIn(List<Long> values) {
            addCriterion("belong_school_id not in", values, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdBetween(Long value1, Long value2) {
            addCriterion("belong_school_id between", value1, value2, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andBelongSchoolIdNotBetween(Long value1, Long value2) {
            addCriterion("belong_school_id not between", value1, value2, "belongSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andMotherNameIsNull() {
            addCriterion("mother_name is null");
            return (Criteria) this;
        }

        public Criteria andMotherNameIsNotNull() {
            addCriterion("mother_name is not null");
            return (Criteria) this;
        }

        public Criteria andMotherNameEqualTo(String value) {
            addCriterion("mother_name =", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotEqualTo(String value) {
            addCriterion("mother_name <>", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThan(String value) {
            addCriterion("mother_name >", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameGreaterThanOrEqualTo(String value) {
            addCriterion("mother_name >=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThan(String value) {
            addCriterion("mother_name <", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLessThanOrEqualTo(String value) {
            addCriterion("mother_name <=", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameLike(String value) {
            addCriterion("mother_name like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotLike(String value) {
            addCriterion("mother_name not like", value, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameIn(List<String> values) {
            addCriterion("mother_name in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotIn(List<String> values) {
            addCriterion("mother_name not in", values, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameBetween(String value1, String value2) {
            addCriterion("mother_name between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherNameNotBetween(String value1, String value2) {
            addCriterion("mother_name not between", value1, value2, "motherName");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneIsNull() {
            addCriterion("mother_phone is null");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneIsNotNull() {
            addCriterion("mother_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneEqualTo(String value) {
            addCriterion("mother_phone =", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneNotEqualTo(String value) {
            addCriterion("mother_phone <>", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneGreaterThan(String value) {
            addCriterion("mother_phone >", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mother_phone >=", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneLessThan(String value) {
            addCriterion("mother_phone <", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneLessThanOrEqualTo(String value) {
            addCriterion("mother_phone <=", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneLike(String value) {
            addCriterion("mother_phone like", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneNotLike(String value) {
            addCriterion("mother_phone not like", value, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneIn(List<String> values) {
            addCriterion("mother_phone in", values, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneNotIn(List<String> values) {
            addCriterion("mother_phone not in", values, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneBetween(String value1, String value2) {
            addCriterion("mother_phone between", value1, value2, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andMotherPhoneNotBetween(String value1, String value2) {
            addCriterion("mother_phone not between", value1, value2, "motherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNull() {
            addCriterion("father_name is null");
            return (Criteria) this;
        }

        public Criteria andFatherNameIsNotNull() {
            addCriterion("father_name is not null");
            return (Criteria) this;
        }

        public Criteria andFatherNameEqualTo(String value) {
            addCriterion("father_name =", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotEqualTo(String value) {
            addCriterion("father_name <>", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThan(String value) {
            addCriterion("father_name >", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameGreaterThanOrEqualTo(String value) {
            addCriterion("father_name >=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThan(String value) {
            addCriterion("father_name <", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLessThanOrEqualTo(String value) {
            addCriterion("father_name <=", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameLike(String value) {
            addCriterion("father_name like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotLike(String value) {
            addCriterion("father_name not like", value, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameIn(List<String> values) {
            addCriterion("father_name in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotIn(List<String> values) {
            addCriterion("father_name not in", values, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameBetween(String value1, String value2) {
            addCriterion("father_name between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherNameNotBetween(String value1, String value2) {
            addCriterion("father_name not between", value1, value2, "fatherName");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneIsNull() {
            addCriterion("father_phone is null");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneIsNotNull() {
            addCriterion("father_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneEqualTo(String value) {
            addCriterion("father_phone =", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneNotEqualTo(String value) {
            addCriterion("father_phone <>", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneGreaterThan(String value) {
            addCriterion("father_phone >", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("father_phone >=", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneLessThan(String value) {
            addCriterion("father_phone <", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneLessThanOrEqualTo(String value) {
            addCriterion("father_phone <=", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneLike(String value) {
            addCriterion("father_phone like", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneNotLike(String value) {
            addCriterion("father_phone not like", value, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneIn(List<String> values) {
            addCriterion("father_phone in", values, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneNotIn(List<String> values) {
            addCriterion("father_phone not in", values, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneBetween(String value1, String value2) {
            addCriterion("father_phone between", value1, value2, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andFatherPhoneNotBetween(String value1, String value2) {
            addCriterion("father_phone not between", value1, value2, "fatherPhone");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNull() {
            addCriterion("school_name is null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIsNotNull() {
            addCriterion("school_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolNameEqualTo(String value) {
            addCriterion("school_name =", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotEqualTo(String value) {
            addCriterion("school_name <>", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThan(String value) {
            addCriterion("school_name >", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameGreaterThanOrEqualTo(String value) {
            addCriterion("school_name >=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThan(String value) {
            addCriterion("school_name <", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLessThanOrEqualTo(String value) {
            addCriterion("school_name <=", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameLike(String value) {
            addCriterion("school_name like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotLike(String value) {
            addCriterion("school_name not like", value, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameIn(List<String> values) {
            addCriterion("school_name in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotIn(List<String> values) {
            addCriterion("school_name not in", values, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameBetween(String value1, String value2) {
            addCriterion("school_name between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andSchoolNameNotBetween(String value1, String value2) {
            addCriterion("school_name not between", value1, value2, "schoolName");
            return (Criteria) this;
        }

        public Criteria andMediaChannelIsNull() {
            addCriterion("media_channel is null");
            return (Criteria) this;
        }

        public Criteria andMediaChannelIsNotNull() {
            addCriterion("media_channel is not null");
            return (Criteria) this;
        }

        public Criteria andMediaChannelEqualTo(Byte value) {
            addCriterion("media_channel =", value, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelNotEqualTo(Byte value) {
            addCriterion("media_channel <>", value, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelGreaterThan(Byte value) {
            addCriterion("media_channel >", value, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("media_channel >=", value, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelLessThan(Byte value) {
            addCriterion("media_channel <", value, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelLessThanOrEqualTo(Byte value) {
            addCriterion("media_channel <=", value, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelIn(List<Byte> values) {
            addCriterion("media_channel in", values, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelNotIn(List<Byte> values) {
            addCriterion("media_channel not in", values, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelBetween(Byte value1, Byte value2) {
            addCriterion("media_channel between", value1, value2, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("media_channel not between", value1, value2, "mediaChannel");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailIsNull() {
            addCriterion("media_channel_detail is null");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailIsNotNull() {
            addCriterion("media_channel_detail is not null");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailEqualTo(Byte value) {
            addCriterion("media_channel_detail =", value, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailNotEqualTo(Byte value) {
            addCriterion("media_channel_detail <>", value, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailGreaterThan(Byte value) {
            addCriterion("media_channel_detail >", value, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailGreaterThanOrEqualTo(Byte value) {
            addCriterion("media_channel_detail >=", value, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailLessThan(Byte value) {
            addCriterion("media_channel_detail <", value, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailLessThanOrEqualTo(Byte value) {
            addCriterion("media_channel_detail <=", value, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailIn(List<Byte> values) {
            addCriterion("media_channel_detail in", values, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailNotIn(List<Byte> values) {
            addCriterion("media_channel_detail not in", values, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailBetween(Byte value1, Byte value2) {
            addCriterion("media_channel_detail between", value1, value2, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andMediaChannelDetailNotBetween(Byte value1, Byte value2) {
            addCriterion("media_channel_detail not between", value1, value2, "mediaChannelDetail");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(Integer value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(Integer value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(Integer value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(Integer value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(Integer value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<Integer> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<Integer> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(Integer value1, Integer value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Byte value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Byte value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Byte value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Byte value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Byte value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Byte value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Byte> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Byte> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Byte value1, Byte value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Byte value1, Byte value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementIsNull() {
            addCriterion("customer_requirement is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementIsNotNull() {
            addCriterion("customer_requirement is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementEqualTo(String value) {
            addCriterion("customer_requirement =", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementNotEqualTo(String value) {
            addCriterion("customer_requirement <>", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementGreaterThan(String value) {
            addCriterion("customer_requirement >", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("customer_requirement >=", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementLessThan(String value) {
            addCriterion("customer_requirement <", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementLessThanOrEqualTo(String value) {
            addCriterion("customer_requirement <=", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementLike(String value) {
            addCriterion("customer_requirement like", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementNotLike(String value) {
            addCriterion("customer_requirement not like", value, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementIn(List<String> values) {
            addCriterion("customer_requirement in", values, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementNotIn(List<String> values) {
            addCriterion("customer_requirement not in", values, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementBetween(String value1, String value2) {
            addCriterion("customer_requirement between", value1, value2, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andCustomerRequirementNotBetween(String value1, String value2) {
            addCriterion("customer_requirement not between", value1, value2, "customerRequirement");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Boolean value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Boolean value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Boolean value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Boolean value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Boolean> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Boolean> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
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