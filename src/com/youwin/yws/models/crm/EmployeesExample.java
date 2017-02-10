package com.youwin.yws.models.crm;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeesExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNull() {
            addCriterion("position_id is null");
            return (Criteria) this;
        }

        public Criteria andPositionIdIsNotNull() {
            addCriterion("position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPositionIdEqualTo(Long value) {
            addCriterion("position_id =", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotEqualTo(Long value) {
            addCriterion("position_id <>", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThan(Long value) {
            addCriterion("position_id >", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("position_id >=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThan(Long value) {
            addCriterion("position_id <", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdLessThanOrEqualTo(Long value) {
            addCriterion("position_id <=", value, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdIn(List<Long> values) {
            addCriterion("position_id in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotIn(List<Long> values) {
            addCriterion("position_id not in", values, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdBetween(Long value1, Long value2) {
            addCriterion("position_id between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andPositionIdNotBetween(Long value1, Long value2) {
            addCriterion("position_id not between", value1, value2, "positionId");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNull() {
            addCriterion("id_number is null");
            return (Criteria) this;
        }

        public Criteria andIdNumberIsNotNull() {
            addCriterion("id_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdNumberEqualTo(String value) {
            addCriterion("id_number =", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotEqualTo(String value) {
            addCriterion("id_number <>", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThan(String value) {
            addCriterion("id_number >", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberGreaterThanOrEqualTo(String value) {
            addCriterion("id_number >=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThan(String value) {
            addCriterion("id_number <", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLessThanOrEqualTo(String value) {
            addCriterion("id_number <=", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberLike(String value) {
            addCriterion("id_number like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotLike(String value) {
            addCriterion("id_number not like", value, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberIn(List<String> values) {
            addCriterion("id_number in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotIn(List<String> values) {
            addCriterion("id_number not in", values, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberBetween(String value1, String value2) {
            addCriterion("id_number between", value1, value2, "idNumber");
            return (Criteria) this;
        }

        public Criteria andIdNumberNotBetween(String value1, String value2) {
            addCriterion("id_number not between", value1, value2, "idNumber");
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

        public Criteria andAgeEqualTo(Long value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Long value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Long value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Long value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Long value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Long value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Long> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Long> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Long value1, Long value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Long value1, Long value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEthnicIsNull() {
            addCriterion("ethnic is null");
            return (Criteria) this;
        }

        public Criteria andEthnicIsNotNull() {
            addCriterion("ethnic is not null");
            return (Criteria) this;
        }

        public Criteria andEthnicEqualTo(String value) {
            addCriterion("ethnic =", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicNotEqualTo(String value) {
            addCriterion("ethnic <>", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicGreaterThan(String value) {
            addCriterion("ethnic >", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicGreaterThanOrEqualTo(String value) {
            addCriterion("ethnic >=", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicLessThan(String value) {
            addCriterion("ethnic <", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicLessThanOrEqualTo(String value) {
            addCriterion("ethnic <=", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicLike(String value) {
            addCriterion("ethnic like", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicNotLike(String value) {
            addCriterion("ethnic not like", value, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicIn(List<String> values) {
            addCriterion("ethnic in", values, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicNotIn(List<String> values) {
            addCriterion("ethnic not in", values, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicBetween(String value1, String value2) {
            addCriterion("ethnic between", value1, value2, "ethnic");
            return (Criteria) this;
        }

        public Criteria andEthnicNotBetween(String value1, String value2) {
            addCriterion("ethnic not between", value1, value2, "ethnic");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(Integer value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(Integer value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(Integer value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(Integer value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(Integer value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<Integer> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<Integer> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(Integer value1, Integer value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("birth_date is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("birth_date is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(Date value) {
            addCriterion("birth_date =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(Date value) {
            addCriterion("birth_date <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(Date value) {
            addCriterion("birth_date >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(Date value) {
            addCriterion("birth_date >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(Date value) {
            addCriterion("birth_date <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(Date value) {
            addCriterion("birth_date <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<Date> values) {
            addCriterion("birth_date in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<Date> values) {
            addCriterion("birth_date not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(Date value1, Date value2) {
            addCriterion("birth_date between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(Date value1, Date value2) {
            addCriterion("birth_date not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteIsNull() {
            addCriterion("highest_education_institute is null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteIsNotNull() {
            addCriterion("highest_education_institute is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteEqualTo(String value) {
            addCriterion("highest_education_institute =", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteNotEqualTo(String value) {
            addCriterion("highest_education_institute <>", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteGreaterThan(String value) {
            addCriterion("highest_education_institute >", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteGreaterThanOrEqualTo(String value) {
            addCriterion("highest_education_institute >=", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteLessThan(String value) {
            addCriterion("highest_education_institute <", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteLessThanOrEqualTo(String value) {
            addCriterion("highest_education_institute <=", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteLike(String value) {
            addCriterion("highest_education_institute like", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteNotLike(String value) {
            addCriterion("highest_education_institute not like", value, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteIn(List<String> values) {
            addCriterion("highest_education_institute in", values, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteNotIn(List<String> values) {
            addCriterion("highest_education_institute not in", values, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteBetween(String value1, String value2) {
            addCriterion("highest_education_institute between", value1, value2, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andHighestEducationInstituteNotBetween(String value1, String value2) {
            addCriterion("highest_education_institute not between", value1, value2, "highestEducationInstitute");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIsNull() {
            addCriterion("graduation_date is null");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIsNotNull() {
            addCriterion("graduation_date is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationDateEqualTo(Date value) {
            addCriterion("graduation_date =", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotEqualTo(Date value) {
            addCriterion("graduation_date <>", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateGreaterThan(Date value) {
            addCriterion("graduation_date >", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateGreaterThanOrEqualTo(Date value) {
            addCriterion("graduation_date >=", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateLessThan(Date value) {
            addCriterion("graduation_date <", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateLessThanOrEqualTo(Date value) {
            addCriterion("graduation_date <=", value, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateIn(List<Date> values) {
            addCriterion("graduation_date in", values, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotIn(List<Date> values) {
            addCriterion("graduation_date not in", values, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateBetween(Date value1, Date value2) {
            addCriterion("graduation_date between", value1, value2, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andGraduationDateNotBetween(Date value1, Date value2) {
            addCriterion("graduation_date not between", value1, value2, "graduationDate");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNull() {
            addCriterion("education_degree is null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIsNotNull() {
            addCriterion("education_degree is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeEqualTo(Integer value) {
            addCriterion("education_degree =", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotEqualTo(Integer value) {
            addCriterion("education_degree <>", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThan(Integer value) {
            addCriterion("education_degree >", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_degree >=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThan(Integer value) {
            addCriterion("education_degree <", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeLessThanOrEqualTo(Integer value) {
            addCriterion("education_degree <=", value, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeIn(List<Integer> values) {
            addCriterion("education_degree in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotIn(List<Integer> values) {
            addCriterion("education_degree not in", values, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeBetween(Integer value1, Integer value2) {
            addCriterion("education_degree between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeNotBetween(Integer value1, Integer value2) {
            addCriterion("education_degree not between", value1, value2, "educationDegree");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeIsNull() {
            addCriterion("education_degree_type is null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeIsNotNull() {
            addCriterion("education_degree_type is not null");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeEqualTo(Integer value) {
            addCriterion("education_degree_type =", value, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeNotEqualTo(Integer value) {
            addCriterion("education_degree_type <>", value, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeGreaterThan(Integer value) {
            addCriterion("education_degree_type >", value, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("education_degree_type >=", value, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeLessThan(Integer value) {
            addCriterion("education_degree_type <", value, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("education_degree_type <=", value, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeIn(List<Integer> values) {
            addCriterion("education_degree_type in", values, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeNotIn(List<Integer> values) {
            addCriterion("education_degree_type not in", values, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeBetween(Integer value1, Integer value2) {
            addCriterion("education_degree_type between", value1, value2, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andEducationDegreeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("education_degree_type not between", value1, value2, "educationDegreeType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceIsNull() {
            addCriterion("registered_residence is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceIsNotNull() {
            addCriterion("registered_residence is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceEqualTo(String value) {
            addCriterion("registered_residence =", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotEqualTo(String value) {
            addCriterion("registered_residence <>", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceGreaterThan(String value) {
            addCriterion("registered_residence >", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceGreaterThanOrEqualTo(String value) {
            addCriterion("registered_residence >=", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceLessThan(String value) {
            addCriterion("registered_residence <", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceLessThanOrEqualTo(String value) {
            addCriterion("registered_residence <=", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceLike(String value) {
            addCriterion("registered_residence like", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotLike(String value) {
            addCriterion("registered_residence not like", value, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceIn(List<String> values) {
            addCriterion("registered_residence in", values, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotIn(List<String> values) {
            addCriterion("registered_residence not in", values, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceBetween(String value1, String value2) {
            addCriterion("registered_residence between", value1, value2, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceNotBetween(String value1, String value2) {
            addCriterion("registered_residence not between", value1, value2, "registeredResidence");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeIsNull() {
            addCriterion("registered_residence_type is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeIsNotNull() {
            addCriterion("registered_residence_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeEqualTo(Integer value) {
            addCriterion("registered_residence_type =", value, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeNotEqualTo(Integer value) {
            addCriterion("registered_residence_type <>", value, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeGreaterThan(Integer value) {
            addCriterion("registered_residence_type >", value, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("registered_residence_type >=", value, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeLessThan(Integer value) {
            addCriterion("registered_residence_type <", value, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("registered_residence_type <=", value, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeIn(List<Integer> values) {
            addCriterion("registered_residence_type in", values, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeNotIn(List<Integer> values) {
            addCriterion("registered_residence_type not in", values, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeBetween(Integer value1, Integer value2) {
            addCriterion("registered_residence_type between", value1, value2, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andRegisteredResidenceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("registered_residence_type not between", value1, value2, "registeredResidenceType");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameIsNull() {
            addCriterion("emergency_contact_name is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameIsNotNull() {
            addCriterion("emergency_contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameEqualTo(String value) {
            addCriterion("emergency_contact_name =", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotEqualTo(String value) {
            addCriterion("emergency_contact_name <>", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameGreaterThan(String value) {
            addCriterion("emergency_contact_name >", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_name >=", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameLessThan(String value) {
            addCriterion("emergency_contact_name <", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_name <=", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameLike(String value) {
            addCriterion("emergency_contact_name like", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotLike(String value) {
            addCriterion("emergency_contact_name not like", value, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameIn(List<String> values) {
            addCriterion("emergency_contact_name in", values, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotIn(List<String> values) {
            addCriterion("emergency_contact_name not in", values, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameBetween(String value1, String value2) {
            addCriterion("emergency_contact_name between", value1, value2, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNameNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_name not between", value1, value2, "emergencyContactName");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipIsNull() {
            addCriterion("emergency_contact_relationship is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipIsNotNull() {
            addCriterion("emergency_contact_relationship is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipEqualTo(Integer value) {
            addCriterion("emergency_contact_relationship =", value, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipNotEqualTo(Integer value) {
            addCriterion("emergency_contact_relationship <>", value, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipGreaterThan(Integer value) {
            addCriterion("emergency_contact_relationship >", value, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipGreaterThanOrEqualTo(Integer value) {
            addCriterion("emergency_contact_relationship >=", value, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipLessThan(Integer value) {
            addCriterion("emergency_contact_relationship <", value, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipLessThanOrEqualTo(Integer value) {
            addCriterion("emergency_contact_relationship <=", value, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipIn(List<Integer> values) {
            addCriterion("emergency_contact_relationship in", values, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipNotIn(List<Integer> values) {
            addCriterion("emergency_contact_relationship not in", values, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipBetween(Integer value1, Integer value2) {
            addCriterion("emergency_contact_relationship between", value1, value2, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactRelationshipNotBetween(Integer value1, Integer value2) {
            addCriterion("emergency_contact_relationship not between", value1, value2, "emergencyContactRelationship");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberIsNull() {
            addCriterion("emergency_contact_number is null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberIsNotNull() {
            addCriterion("emergency_contact_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberEqualTo(String value) {
            addCriterion("emergency_contact_number =", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberNotEqualTo(String value) {
            addCriterion("emergency_contact_number <>", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberGreaterThan(String value) {
            addCriterion("emergency_contact_number >", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberGreaterThanOrEqualTo(String value) {
            addCriterion("emergency_contact_number >=", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberLessThan(String value) {
            addCriterion("emergency_contact_number <", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberLessThanOrEqualTo(String value) {
            addCriterion("emergency_contact_number <=", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberLike(String value) {
            addCriterion("emergency_contact_number like", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberNotLike(String value) {
            addCriterion("emergency_contact_number not like", value, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberIn(List<String> values) {
            addCriterion("emergency_contact_number in", values, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberNotIn(List<String> values) {
            addCriterion("emergency_contact_number not in", values, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberBetween(String value1, String value2) {
            addCriterion("emergency_contact_number between", value1, value2, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andEmergencyContactNumberNotBetween(String value1, String value2) {
            addCriterion("emergency_contact_number not between", value1, value2, "emergencyContactNumber");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusIsNull() {
            addCriterion("employment_status is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusIsNotNull() {
            addCriterion("employment_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusEqualTo(Integer value) {
            addCriterion("employment_status =", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusNotEqualTo(Integer value) {
            addCriterion("employment_status <>", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusGreaterThan(Integer value) {
            addCriterion("employment_status >", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("employment_status >=", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusLessThan(Integer value) {
            addCriterion("employment_status <", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("employment_status <=", value, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusIn(List<Integer> values) {
            addCriterion("employment_status in", values, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusNotIn(List<Integer> values) {
            addCriterion("employment_status not in", values, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusBetween(Integer value1, Integer value2) {
            addCriterion("employment_status between", value1, value2, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("employment_status not between", value1, value2, "employmentStatus");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeIsNull() {
            addCriterion("employment_type is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeIsNotNull() {
            addCriterion("employment_type is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeEqualTo(Integer value) {
            addCriterion("employment_type =", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeNotEqualTo(Integer value) {
            addCriterion("employment_type <>", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeGreaterThan(Integer value) {
            addCriterion("employment_type >", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("employment_type >=", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeLessThan(Integer value) {
            addCriterion("employment_type <", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("employment_type <=", value, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeIn(List<Integer> values) {
            addCriterion("employment_type in", values, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeNotIn(List<Integer> values) {
            addCriterion("employment_type not in", values, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("employment_type between", value1, value2, "employmentType");
            return (Criteria) this;
        }

        public Criteria andEmploymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("employment_type not between", value1, value2, "employmentType");
            return (Criteria) this;
        }

        public Criteria andHiringDateIsNull() {
            addCriterion("hiring_date is null");
            return (Criteria) this;
        }

        public Criteria andHiringDateIsNotNull() {
            addCriterion("hiring_date is not null");
            return (Criteria) this;
        }

        public Criteria andHiringDateEqualTo(Date value) {
            addCriterion("hiring_date =", value, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateNotEqualTo(Date value) {
            addCriterion("hiring_date <>", value, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateGreaterThan(Date value) {
            addCriterion("hiring_date >", value, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateGreaterThanOrEqualTo(Date value) {
            addCriterion("hiring_date >=", value, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateLessThan(Date value) {
            addCriterion("hiring_date <", value, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateLessThanOrEqualTo(Date value) {
            addCriterion("hiring_date <=", value, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateIn(List<Date> values) {
            addCriterion("hiring_date in", values, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateNotIn(List<Date> values) {
            addCriterion("hiring_date not in", values, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateBetween(Date value1, Date value2) {
            addCriterion("hiring_date between", value1, value2, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andHiringDateNotBetween(Date value1, Date value2) {
            addCriterion("hiring_date not between", value1, value2, "hiringDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateIsNull() {
            addCriterion("trial_end_date is null");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateIsNotNull() {
            addCriterion("trial_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateEqualTo(Date value) {
            addCriterion("trial_end_date =", value, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateNotEqualTo(Date value) {
            addCriterion("trial_end_date <>", value, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateGreaterThan(Date value) {
            addCriterion("trial_end_date >", value, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("trial_end_date >=", value, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateLessThan(Date value) {
            addCriterion("trial_end_date <", value, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateLessThanOrEqualTo(Date value) {
            addCriterion("trial_end_date <=", value, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateIn(List<Date> values) {
            addCriterion("trial_end_date in", values, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateNotIn(List<Date> values) {
            addCriterion("trial_end_date not in", values, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateBetween(Date value1, Date value2) {
            addCriterion("trial_end_date between", value1, value2, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andTrialEndDateNotBetween(Date value1, Date value2) {
            addCriterion("trial_end_date not between", value1, value2, "trialEndDate");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelIsNull() {
            addCriterion("employment_level is null");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelIsNotNull() {
            addCriterion("employment_level is not null");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelEqualTo(Integer value) {
            addCriterion("employment_level =", value, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelNotEqualTo(Integer value) {
            addCriterion("employment_level <>", value, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelGreaterThan(Integer value) {
            addCriterion("employment_level >", value, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("employment_level >=", value, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelLessThan(Integer value) {
            addCriterion("employment_level <", value, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelLessThanOrEqualTo(Integer value) {
            addCriterion("employment_level <=", value, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelIn(List<Integer> values) {
            addCriterion("employment_level in", values, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelNotIn(List<Integer> values) {
            addCriterion("employment_level not in", values, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelBetween(Integer value1, Integer value2) {
            addCriterion("employment_level between", value1, value2, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andEmploymentLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("employment_level not between", value1, value2, "employmentLevel");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNull() {
            addCriterion("supervisor is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIsNotNull() {
            addCriterion("supervisor is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorEqualTo(Long value) {
            addCriterion("supervisor =", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotEqualTo(Long value) {
            addCriterion("supervisor <>", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThan(Long value) {
            addCriterion("supervisor >", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorGreaterThanOrEqualTo(Long value) {
            addCriterion("supervisor >=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThan(Long value) {
            addCriterion("supervisor <", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorLessThanOrEqualTo(Long value) {
            addCriterion("supervisor <=", value, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorIn(List<Long> values) {
            addCriterion("supervisor in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotIn(List<Long> values) {
            addCriterion("supervisor not in", values, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorBetween(Long value1, Long value2) {
            addCriterion("supervisor between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSupervisorNotBetween(Long value1, Long value2) {
            addCriterion("supervisor not between", value1, value2, "supervisor");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("star_level is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("star_level is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(String value) {
            addCriterion("star_level =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(String value) {
            addCriterion("star_level <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(String value) {
            addCriterion("star_level >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("star_level >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(String value) {
            addCriterion("star_level <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(String value) {
            addCriterion("star_level <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(String value) {
            addCriterion("star_level like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(String value) {
            addCriterion("star_level not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<String> values) {
            addCriterion("star_level in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<String> values) {
            addCriterion("star_level not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(String value1, String value2) {
            addCriterion("star_level between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(String value1, String value2) {
            addCriterion("star_level not between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNull() {
            addCriterion("working_years is null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIsNotNull() {
            addCriterion("working_years is not null");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsEqualTo(Integer value) {
            addCriterion("working_years =", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotEqualTo(Integer value) {
            addCriterion("working_years <>", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThan(Integer value) {
            addCriterion("working_years >", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsGreaterThanOrEqualTo(Integer value) {
            addCriterion("working_years >=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThan(Integer value) {
            addCriterion("working_years <", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsLessThanOrEqualTo(Integer value) {
            addCriterion("working_years <=", value, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsIn(List<Integer> values) {
            addCriterion("working_years in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotIn(List<Integer> values) {
            addCriterion("working_years not in", values, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsBetween(Integer value1, Integer value2) {
            addCriterion("working_years between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andWorkingYearsNotBetween(Integer value1, Integer value2) {
            addCriterion("working_years not between", value1, value2, "workingYears");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceIsNull() {
            addCriterion("latest_working_experience is null");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceIsNotNull() {
            addCriterion("latest_working_experience is not null");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceEqualTo(String value) {
            addCriterion("latest_working_experience =", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceNotEqualTo(String value) {
            addCriterion("latest_working_experience <>", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceGreaterThan(String value) {
            addCriterion("latest_working_experience >", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("latest_working_experience >=", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceLessThan(String value) {
            addCriterion("latest_working_experience <", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceLessThanOrEqualTo(String value) {
            addCriterion("latest_working_experience <=", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceLike(String value) {
            addCriterion("latest_working_experience like", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceNotLike(String value) {
            addCriterion("latest_working_experience not like", value, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceIn(List<String> values) {
            addCriterion("latest_working_experience in", values, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceNotIn(List<String> values) {
            addCriterion("latest_working_experience not in", values, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceBetween(String value1, String value2) {
            addCriterion("latest_working_experience between", value1, value2, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestWorkingExperienceNotBetween(String value1, String value2) {
            addCriterion("latest_working_experience not between", value1, value2, "latestWorkingExperience");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionIsNull() {
            addCriterion("latest_company_position is null");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionIsNotNull() {
            addCriterion("latest_company_position is not null");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionEqualTo(String value) {
            addCriterion("latest_company_position =", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionNotEqualTo(String value) {
            addCriterion("latest_company_position <>", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionGreaterThan(String value) {
            addCriterion("latest_company_position >", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionGreaterThanOrEqualTo(String value) {
            addCriterion("latest_company_position >=", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionLessThan(String value) {
            addCriterion("latest_company_position <", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionLessThanOrEqualTo(String value) {
            addCriterion("latest_company_position <=", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionLike(String value) {
            addCriterion("latest_company_position like", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionNotLike(String value) {
            addCriterion("latest_company_position not like", value, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionIn(List<String> values) {
            addCriterion("latest_company_position in", values, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionNotIn(List<String> values) {
            addCriterion("latest_company_position not in", values, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionBetween(String value1, String value2) {
            addCriterion("latest_company_position between", value1, value2, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestCompanyPositionNotBetween(String value1, String value2) {
            addCriterion("latest_company_position not between", value1, value2, "latestCompanyPosition");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateIsNull() {
            addCriterion("latest_education_start_date is null");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateIsNotNull() {
            addCriterion("latest_education_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_start_date =", value, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_start_date <>", value, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("latest_education_start_date >", value, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_start_date >=", value, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateLessThan(Date value) {
            addCriterionForJDBCDate("latest_education_start_date <", value, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_start_date <=", value, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("latest_education_start_date in", values, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("latest_education_start_date not in", values, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latest_education_start_date between", value1, value2, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latest_education_start_date not between", value1, value2, "latestEducationStartDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateIsNull() {
            addCriterion("latest_education_end_date is null");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateIsNotNull() {
            addCriterion("latest_education_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_end_date =", value, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_end_date <>", value, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("latest_education_end_date >", value, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_end_date >=", value, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateLessThan(Date value) {
            addCriterionForJDBCDate("latest_education_end_date <", value, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("latest_education_end_date <=", value, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("latest_education_end_date in", values, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("latest_education_end_date not in", values, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latest_education_end_date between", value1, value2, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andLatestEducationEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("latest_education_end_date not between", value1, value2, "latestEducationEndDate");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesIsNull() {
            addCriterion("recruitment_sources is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesIsNotNull() {
            addCriterion("recruitment_sources is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesEqualTo(String value) {
            addCriterion("recruitment_sources =", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesNotEqualTo(String value) {
            addCriterion("recruitment_sources <>", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesGreaterThan(String value) {
            addCriterion("recruitment_sources >", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesGreaterThanOrEqualTo(String value) {
            addCriterion("recruitment_sources >=", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesLessThan(String value) {
            addCriterion("recruitment_sources <", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesLessThanOrEqualTo(String value) {
            addCriterion("recruitment_sources <=", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesLike(String value) {
            addCriterion("recruitment_sources like", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesNotLike(String value) {
            addCriterion("recruitment_sources not like", value, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesIn(List<String> values) {
            addCriterion("recruitment_sources in", values, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesNotIn(List<String> values) {
            addCriterion("recruitment_sources not in", values, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesBetween(String value1, String value2) {
            addCriterion("recruitment_sources between", value1, value2, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andRecruitmentSourcesNotBetween(String value1, String value2) {
            addCriterion("recruitment_sources not between", value1, value2, "recruitmentSources");
            return (Criteria) this;
        }

        public Criteria andReferenceNameIsNull() {
            addCriterion("reference_name is null");
            return (Criteria) this;
        }

        public Criteria andReferenceNameIsNotNull() {
            addCriterion("reference_name is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceNameEqualTo(String value) {
            addCriterion("reference_name =", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotEqualTo(String value) {
            addCriterion("reference_name <>", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameGreaterThan(String value) {
            addCriterion("reference_name >", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameGreaterThanOrEqualTo(String value) {
            addCriterion("reference_name >=", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameLessThan(String value) {
            addCriterion("reference_name <", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameLessThanOrEqualTo(String value) {
            addCriterion("reference_name <=", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameLike(String value) {
            addCriterion("reference_name like", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotLike(String value) {
            addCriterion("reference_name not like", value, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameIn(List<String> values) {
            addCriterion("reference_name in", values, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotIn(List<String> values) {
            addCriterion("reference_name not in", values, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameBetween(String value1, String value2) {
            addCriterion("reference_name between", value1, value2, "referenceName");
            return (Criteria) this;
        }

        public Criteria andReferenceNameNotBetween(String value1, String value2) {
            addCriterion("reference_name not between", value1, value2, "referenceName");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateIsNull() {
            addCriterion("payment_start_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateIsNotNull() {
            addCriterion("payment_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateEqualTo(Date value) {
            addCriterion("payment_start_date =", value, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateNotEqualTo(Date value) {
            addCriterion("payment_start_date <>", value, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateGreaterThan(Date value) {
            addCriterion("payment_start_date >", value, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_start_date >=", value, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateLessThan(Date value) {
            addCriterion("payment_start_date <", value, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_start_date <=", value, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateIn(List<Date> values) {
            addCriterion("payment_start_date in", values, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateNotIn(List<Date> values) {
            addCriterion("payment_start_date not in", values, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateBetween(Date value1, Date value2) {
            addCriterion("payment_start_date between", value1, value2, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andPaymentStartDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_start_date not between", value1, value2, "paymentStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateIsNull() {
            addCriterion("contract_start_date is null");
            return (Criteria) this;
        }

        public Criteria andContractStartDateIsNotNull() {
            addCriterion("contract_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractStartDateEqualTo(Date value) {
            addCriterion("contract_start_date =", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotEqualTo(Date value) {
            addCriterion("contract_start_date <>", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateGreaterThan(Date value) {
            addCriterion("contract_start_date >", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_start_date >=", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateLessThan(Date value) {
            addCriterion("contract_start_date <", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateLessThanOrEqualTo(Date value) {
            addCriterion("contract_start_date <=", value, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateIn(List<Date> values) {
            addCriterion("contract_start_date in", values, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotIn(List<Date> values) {
            addCriterion("contract_start_date not in", values, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateBetween(Date value1, Date value2) {
            addCriterion("contract_start_date between", value1, value2, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractStartDateNotBetween(Date value1, Date value2) {
            addCriterion("contract_start_date not between", value1, value2, "contractStartDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNull() {
            addCriterion("contract_end_date is null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIsNotNull() {
            addCriterion("contract_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andContractEndDateEqualTo(Date value) {
            addCriterion("contract_end_date =", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotEqualTo(Date value) {
            addCriterion("contract_end_date <>", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThan(Date value) {
            addCriterion("contract_end_date >", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_end_date >=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThan(Date value) {
            addCriterion("contract_end_date <", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateLessThanOrEqualTo(Date value) {
            addCriterion("contract_end_date <=", value, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateIn(List<Date> values) {
            addCriterion("contract_end_date in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotIn(List<Date> values) {
            addCriterion("contract_end_date not in", values, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateBetween(Date value1, Date value2) {
            addCriterion("contract_end_date between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractEndDateNotBetween(Date value1, Date value2) {
            addCriterion("contract_end_date not between", value1, value2, "contractEndDate");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNull() {
            addCriterion("contract_type is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("contract_type is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(Integer value) {
            addCriterion("contract_type =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(Integer value) {
            addCriterion("contract_type <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(Integer value) {
            addCriterion("contract_type >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("contract_type >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(Integer value) {
            addCriterion("contract_type <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(Integer value) {
            addCriterion("contract_type <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<Integer> values) {
            addCriterion("contract_type in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<Integer> values) {
            addCriterion("contract_type not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(Integer value1, Integer value2) {
            addCriterion("contract_type between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("contract_type not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andEmployerIsNull() {
            addCriterion("employer is null");
            return (Criteria) this;
        }

        public Criteria andEmployerIsNotNull() {
            addCriterion("employer is not null");
            return (Criteria) this;
        }

        public Criteria andEmployerEqualTo(String value) {
            addCriterion("employer =", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotEqualTo(String value) {
            addCriterion("employer <>", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerGreaterThan(String value) {
            addCriterion("employer >", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerGreaterThanOrEqualTo(String value) {
            addCriterion("employer >=", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLessThan(String value) {
            addCriterion("employer <", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLessThanOrEqualTo(String value) {
            addCriterion("employer <=", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerLike(String value) {
            addCriterion("employer like", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotLike(String value) {
            addCriterion("employer not like", value, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerIn(List<String> values) {
            addCriterion("employer in", values, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotIn(List<String> values) {
            addCriterion("employer not in", values, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerBetween(String value1, String value2) {
            addCriterion("employer between", value1, value2, "employer");
            return (Criteria) this;
        }

        public Criteria andEmployerNotBetween(String value1, String value2) {
            addCriterion("employer not between", value1, value2, "employer");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryIsNull() {
            addCriterion("trial_salary is null");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryIsNotNull() {
            addCriterion("trial_salary is not null");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryEqualTo(Double value) {
            addCriterion("trial_salary =", value, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryNotEqualTo(Double value) {
            addCriterion("trial_salary <>", value, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryGreaterThan(Double value) {
            addCriterion("trial_salary >", value, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("trial_salary >=", value, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryLessThan(Double value) {
            addCriterion("trial_salary <", value, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryLessThanOrEqualTo(Double value) {
            addCriterion("trial_salary <=", value, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryIn(List<Double> values) {
            addCriterion("trial_salary in", values, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryNotIn(List<Double> values) {
            addCriterion("trial_salary not in", values, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryBetween(Double value1, Double value2) {
            addCriterion("trial_salary between", value1, value2, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andTrialSalaryNotBetween(Double value1, Double value2) {
            addCriterion("trial_salary not between", value1, value2, "trialSalary");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Double value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Double value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Double value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Double value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Double value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Double value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Double> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Double> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Double value1, Double value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Double value1, Double value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseIsNull() {
            addCriterion("performance_base is null");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseIsNotNull() {
            addCriterion("performance_base is not null");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseEqualTo(Double value) {
            addCriterion("performance_base =", value, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseNotEqualTo(Double value) {
            addCriterion("performance_base <>", value, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseGreaterThan(Double value) {
            addCriterion("performance_base >", value, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseGreaterThanOrEqualTo(Double value) {
            addCriterion("performance_base >=", value, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseLessThan(Double value) {
            addCriterion("performance_base <", value, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseLessThanOrEqualTo(Double value) {
            addCriterion("performance_base <=", value, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseIn(List<Double> values) {
            addCriterion("performance_base in", values, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseNotIn(List<Double> values) {
            addCriterion("performance_base not in", values, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseBetween(Double value1, Double value2) {
            addCriterion("performance_base between", value1, value2, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andPerformanceBaseNotBetween(Double value1, Double value2) {
            addCriterion("performance_base not between", value1, value2, "performanceBase");
            return (Criteria) this;
        }

        public Criteria andRoyaltyIsNull() {
            addCriterion("royalty is null");
            return (Criteria) this;
        }

        public Criteria andRoyaltyIsNotNull() {
            addCriterion("royalty is not null");
            return (Criteria) this;
        }

        public Criteria andRoyaltyEqualTo(Double value) {
            addCriterion("royalty =", value, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyNotEqualTo(Double value) {
            addCriterion("royalty <>", value, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyGreaterThan(Double value) {
            addCriterion("royalty >", value, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyGreaterThanOrEqualTo(Double value) {
            addCriterion("royalty >=", value, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyLessThan(Double value) {
            addCriterion("royalty <", value, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyLessThanOrEqualTo(Double value) {
            addCriterion("royalty <=", value, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyIn(List<Double> values) {
            addCriterion("royalty in", values, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyNotIn(List<Double> values) {
            addCriterion("royalty not in", values, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyBetween(Double value1, Double value2) {
            addCriterion("royalty between", value1, value2, "royalty");
            return (Criteria) this;
        }

        public Criteria andRoyaltyNotBetween(Double value1, Double value2) {
            addCriterion("royalty not between", value1, value2, "royalty");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusIsNull() {
            addCriterion("social_security_status is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusIsNotNull() {
            addCriterion("social_security_status is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusEqualTo(Integer value) {
            addCriterion("social_security_status =", value, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusNotEqualTo(Integer value) {
            addCriterion("social_security_status <>", value, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusGreaterThan(Integer value) {
            addCriterion("social_security_status >", value, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("social_security_status >=", value, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusLessThan(Integer value) {
            addCriterion("social_security_status <", value, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusLessThanOrEqualTo(Integer value) {
            addCriterion("social_security_status <=", value, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusIn(List<Integer> values) {
            addCriterion("social_security_status in", values, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusNotIn(List<Integer> values) {
            addCriterion("social_security_status not in", values, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusBetween(Integer value1, Integer value2) {
            addCriterion("social_security_status between", value1, value2, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("social_security_status not between", value1, value2, "socialSecurityStatus");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseIsNull() {
            addCriterion("social_security_base is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseIsNotNull() {
            addCriterion("social_security_base is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseEqualTo(Double value) {
            addCriterion("social_security_base =", value, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseNotEqualTo(Double value) {
            addCriterion("social_security_base <>", value, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseGreaterThan(Double value) {
            addCriterion("social_security_base >", value, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseGreaterThanOrEqualTo(Double value) {
            addCriterion("social_security_base >=", value, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseLessThan(Double value) {
            addCriterion("social_security_base <", value, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseLessThanOrEqualTo(Double value) {
            addCriterion("social_security_base <=", value, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseIn(List<Double> values) {
            addCriterion("social_security_base in", values, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseNotIn(List<Double> values) {
            addCriterion("social_security_base not in", values, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseBetween(Double value1, Double value2) {
            addCriterion("social_security_base between", value1, value2, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityBaseNotBetween(Double value1, Double value2) {
            addCriterion("social_security_base not between", value1, value2, "socialSecurityBase");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountIsNull() {
            addCriterion("social_security_self_amount is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountIsNotNull() {
            addCriterion("social_security_self_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountEqualTo(Double value) {
            addCriterion("social_security_self_amount =", value, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountNotEqualTo(Double value) {
            addCriterion("social_security_self_amount <>", value, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountGreaterThan(Double value) {
            addCriterion("social_security_self_amount >", value, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("social_security_self_amount >=", value, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountLessThan(Double value) {
            addCriterion("social_security_self_amount <", value, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountLessThanOrEqualTo(Double value) {
            addCriterion("social_security_self_amount <=", value, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountIn(List<Double> values) {
            addCriterion("social_security_self_amount in", values, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountNotIn(List<Double> values) {
            addCriterion("social_security_self_amount not in", values, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountBetween(Double value1, Double value2) {
            addCriterion("social_security_self_amount between", value1, value2, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecuritySelfAmountNotBetween(Double value1, Double value2) {
            addCriterion("social_security_self_amount not between", value1, value2, "socialSecuritySelfAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountIsNull() {
            addCriterion("social_security_employer_amount is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountIsNotNull() {
            addCriterion("social_security_employer_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountEqualTo(Double value) {
            addCriterion("social_security_employer_amount =", value, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountNotEqualTo(Double value) {
            addCriterion("social_security_employer_amount <>", value, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountGreaterThan(Double value) {
            addCriterion("social_security_employer_amount >", value, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("social_security_employer_amount >=", value, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountLessThan(Double value) {
            addCriterion("social_security_employer_amount <", value, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountLessThanOrEqualTo(Double value) {
            addCriterion("social_security_employer_amount <=", value, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountIn(List<Double> values) {
            addCriterion("social_security_employer_amount in", values, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountNotIn(List<Double> values) {
            addCriterion("social_security_employer_amount not in", values, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountBetween(Double value1, Double value2) {
            addCriterion("social_security_employer_amount between", value1, value2, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityEmployerAmountNotBetween(Double value1, Double value2) {
            addCriterion("social_security_employer_amount not between", value1, value2, "socialSecurityEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressIsNull() {
            addCriterion("social_security_address is null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressIsNotNull() {
            addCriterion("social_security_address is not null");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressEqualTo(String value) {
            addCriterion("social_security_address =", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressNotEqualTo(String value) {
            addCriterion("social_security_address <>", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressGreaterThan(String value) {
            addCriterion("social_security_address >", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressGreaterThanOrEqualTo(String value) {
            addCriterion("social_security_address >=", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressLessThan(String value) {
            addCriterion("social_security_address <", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressLessThanOrEqualTo(String value) {
            addCriterion("social_security_address <=", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressLike(String value) {
            addCriterion("social_security_address like", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressNotLike(String value) {
            addCriterion("social_security_address not like", value, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressIn(List<String> values) {
            addCriterion("social_security_address in", values, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressNotIn(List<String> values) {
            addCriterion("social_security_address not in", values, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressBetween(String value1, String value2) {
            addCriterion("social_security_address between", value1, value2, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andSocialSecurityAddressNotBetween(String value1, String value2) {
            addCriterion("social_security_address not between", value1, value2, "socialSecurityAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusIsNull() {
            addCriterion("housing_fund_status is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusIsNotNull() {
            addCriterion("housing_fund_status is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusEqualTo(Integer value) {
            addCriterion("housing_fund_status =", value, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusNotEqualTo(Integer value) {
            addCriterion("housing_fund_status <>", value, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusGreaterThan(Integer value) {
            addCriterion("housing_fund_status >", value, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("housing_fund_status >=", value, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusLessThan(Integer value) {
            addCriterion("housing_fund_status <", value, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusLessThanOrEqualTo(Integer value) {
            addCriterion("housing_fund_status <=", value, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusIn(List<Integer> values) {
            addCriterion("housing_fund_status in", values, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusNotIn(List<Integer> values) {
            addCriterion("housing_fund_status not in", values, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusBetween(Integer value1, Integer value2) {
            addCriterion("housing_fund_status between", value1, value2, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("housing_fund_status not between", value1, value2, "housingFundStatus");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseIsNull() {
            addCriterion("housing_fund_base is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseIsNotNull() {
            addCriterion("housing_fund_base is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseEqualTo(Double value) {
            addCriterion("housing_fund_base =", value, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseNotEqualTo(Double value) {
            addCriterion("housing_fund_base <>", value, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseGreaterThan(Double value) {
            addCriterion("housing_fund_base >", value, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseGreaterThanOrEqualTo(Double value) {
            addCriterion("housing_fund_base >=", value, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseLessThan(Double value) {
            addCriterion("housing_fund_base <", value, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseLessThanOrEqualTo(Double value) {
            addCriterion("housing_fund_base <=", value, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseIn(List<Double> values) {
            addCriterion("housing_fund_base in", values, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseNotIn(List<Double> values) {
            addCriterion("housing_fund_base not in", values, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseBetween(Double value1, Double value2) {
            addCriterion("housing_fund_base between", value1, value2, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundBaseNotBetween(Double value1, Double value2) {
            addCriterion("housing_fund_base not between", value1, value2, "housingFundBase");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountIsNull() {
            addCriterion("housing_fund_self_amount is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountIsNotNull() {
            addCriterion("housing_fund_self_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountEqualTo(Double value) {
            addCriterion("housing_fund_self_amount =", value, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountNotEqualTo(Double value) {
            addCriterion("housing_fund_self_amount <>", value, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountGreaterThan(Double value) {
            addCriterion("housing_fund_self_amount >", value, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("housing_fund_self_amount >=", value, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountLessThan(Double value) {
            addCriterion("housing_fund_self_amount <", value, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountLessThanOrEqualTo(Double value) {
            addCriterion("housing_fund_self_amount <=", value, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountIn(List<Double> values) {
            addCriterion("housing_fund_self_amount in", values, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountNotIn(List<Double> values) {
            addCriterion("housing_fund_self_amount not in", values, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountBetween(Double value1, Double value2) {
            addCriterion("housing_fund_self_amount between", value1, value2, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundSelfAmountNotBetween(Double value1, Double value2) {
            addCriterion("housing_fund_self_amount not between", value1, value2, "housingFundSelfAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountIsNull() {
            addCriterion("housing_fund_employer_amount is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountIsNotNull() {
            addCriterion("housing_fund_employer_amount is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountEqualTo(Double value) {
            addCriterion("housing_fund_employer_amount =", value, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountNotEqualTo(Double value) {
            addCriterion("housing_fund_employer_amount <>", value, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountGreaterThan(Double value) {
            addCriterion("housing_fund_employer_amount >", value, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("housing_fund_employer_amount >=", value, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountLessThan(Double value) {
            addCriterion("housing_fund_employer_amount <", value, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountLessThanOrEqualTo(Double value) {
            addCriterion("housing_fund_employer_amount <=", value, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountIn(List<Double> values) {
            addCriterion("housing_fund_employer_amount in", values, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountNotIn(List<Double> values) {
            addCriterion("housing_fund_employer_amount not in", values, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountBetween(Double value1, Double value2) {
            addCriterion("housing_fund_employer_amount between", value1, value2, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundEmployerAmountNotBetween(Double value1, Double value2) {
            addCriterion("housing_fund_employer_amount not between", value1, value2, "housingFundEmployerAmount");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressIsNull() {
            addCriterion("housing_fund_address is null");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressIsNotNull() {
            addCriterion("housing_fund_address is not null");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressEqualTo(String value) {
            addCriterion("housing_fund_address =", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressNotEqualTo(String value) {
            addCriterion("housing_fund_address <>", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressGreaterThan(String value) {
            addCriterion("housing_fund_address >", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressGreaterThanOrEqualTo(String value) {
            addCriterion("housing_fund_address >=", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressLessThan(String value) {
            addCriterion("housing_fund_address <", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressLessThanOrEqualTo(String value) {
            addCriterion("housing_fund_address <=", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressLike(String value) {
            addCriterion("housing_fund_address like", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressNotLike(String value) {
            addCriterion("housing_fund_address not like", value, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressIn(List<String> values) {
            addCriterion("housing_fund_address in", values, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressNotIn(List<String> values) {
            addCriterion("housing_fund_address not in", values, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressBetween(String value1, String value2) {
            addCriterion("housing_fund_address between", value1, value2, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andHousingFundAddressNotBetween(String value1, String value2) {
            addCriterion("housing_fund_address not between", value1, value2, "housingFundAddress");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Long value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Long value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Long value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Long value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Long value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Long> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Long> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Long value1, Long value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Long value1, Long value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Long value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Long value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Long value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Long value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Long value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Long value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Long> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Long> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Long value1, Long value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Long value1, Long value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
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