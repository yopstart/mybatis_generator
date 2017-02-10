package com.youwin.yws.models.crm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmOrderStudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmOrderStudentExample() {
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

        public Criteria andOrganizationIdIsNull() {
            addCriterion("organization_id is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIsNotNull() {
            addCriterion("organization_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdEqualTo(Long value) {
            addCriterion("organization_id =", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotEqualTo(Long value) {
            addCriterion("organization_id <>", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThan(Long value) {
            addCriterion("organization_id >", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("organization_id >=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThan(Long value) {
            addCriterion("organization_id <", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdLessThanOrEqualTo(Long value) {
            addCriterion("organization_id <=", value, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdIn(List<Long> values) {
            addCriterion("organization_id in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotIn(List<Long> values) {
            addCriterion("organization_id not in", values, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdBetween(Long value1, Long value2) {
            addCriterion("organization_id between", value1, value2, "organizationId");
            return (Criteria) this;
        }

        public Criteria andOrganizationIdNotBetween(Long value1, Long value2) {
            addCriterion("organization_id not between", value1, value2, "organizationId");
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

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Integer value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Integer value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Integer value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Integer value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Integer value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Integer> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Integer> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Integer value1, Integer value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceIsNull() {
            addCriterion("real_standard_price is null");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceIsNotNull() {
            addCriterion("real_standard_price is not null");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceEqualTo(BigDecimal value) {
            addCriterion("real_standard_price =", value, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceNotEqualTo(BigDecimal value) {
            addCriterion("real_standard_price <>", value, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceGreaterThan(BigDecimal value) {
            addCriterion("real_standard_price >", value, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_standard_price >=", value, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceLessThan(BigDecimal value) {
            addCriterion("real_standard_price <", value, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_standard_price <=", value, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceIn(List<BigDecimal> values) {
            addCriterion("real_standard_price in", values, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceNotIn(List<BigDecimal> values) {
            addCriterion("real_standard_price not in", values, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_standard_price between", value1, value2, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealStandardPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_standard_price not between", value1, value2, "realStandardPrice");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountIsNull() {
            addCriterion("real_total_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountIsNotNull() {
            addCriterion("real_total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountEqualTo(BigDecimal value) {
            addCriterion("real_total_amount =", value, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_total_amount <>", value, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("real_total_amount >", value, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_total_amount >=", value, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountLessThan(BigDecimal value) {
            addCriterion("real_total_amount <", value, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_total_amount <=", value, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountIn(List<BigDecimal> values) {
            addCriterion("real_total_amount in", values, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_total_amount not in", values, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_total_amount between", value1, value2, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andRealTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_total_amount not between", value1, value2, "realTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountIsNull() {
            addCriterion("privilege_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountIsNotNull() {
            addCriterion("privilege_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountEqualTo(BigDecimal value) {
            addCriterion("privilege_amount =", value, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountNotEqualTo(BigDecimal value) {
            addCriterion("privilege_amount <>", value, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountGreaterThan(BigDecimal value) {
            addCriterion("privilege_amount >", value, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("privilege_amount >=", value, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountLessThan(BigDecimal value) {
            addCriterion("privilege_amount <", value, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("privilege_amount <=", value, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountIn(List<BigDecimal> values) {
            addCriterion("privilege_amount in", values, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountNotIn(List<BigDecimal> values) {
            addCriterion("privilege_amount not in", values, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("privilege_amount between", value1, value2, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andPrivilegeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("privilege_amount not between", value1, value2, "privilegeAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIsNull() {
            addCriterion("real_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIsNotNull() {
            addCriterion("real_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount =", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount <>", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountGreaterThan(BigDecimal value) {
            addCriterion("real_pay_amount >", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount >=", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountLessThan(BigDecimal value) {
            addCriterion("real_pay_amount <", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_pay_amount <=", value, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountIn(List<BigDecimal> values) {
            addCriterion("real_pay_amount in", values, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("real_pay_amount not in", values, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_pay_amount between", value1, value2, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andRealPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_pay_amount not between", value1, value2, "realPayAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountIsNull() {
            addCriterion("pay_due_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountIsNotNull() {
            addCriterion("pay_due_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountEqualTo(BigDecimal value) {
            addCriterion("pay_due_amount =", value, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountNotEqualTo(BigDecimal value) {
            addCriterion("pay_due_amount <>", value, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountGreaterThan(BigDecimal value) {
            addCriterion("pay_due_amount >", value, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_due_amount >=", value, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountLessThan(BigDecimal value) {
            addCriterion("pay_due_amount <", value, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_due_amount <=", value, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountIn(List<BigDecimal> values) {
            addCriterion("pay_due_amount in", values, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountNotIn(List<BigDecimal> values) {
            addCriterion("pay_due_amount not in", values, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_due_amount between", value1, value2, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andPayDueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_due_amount not between", value1, value2, "payDueAmount");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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