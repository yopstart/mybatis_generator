package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmOrderStudentCourseDonate implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 机构ID
     */
    @Column(name = "organization_id")
    private String organizationId;

    /**
     * 合同编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 赠课课时
     */
    @Column(name = "course_num")
    private Integer courseNum;

    /**
     * 实际单价
     */
    @Column(name = "actual_price")
    private BigDecimal actualPrice;

    /**
     * 实际总价
     */
    @Column(name = "actual_amount")
    private BigDecimal actualAmount;

    /**
     * 优惠金额
     */
    @Column(name = "privilege_amount")
    private BigDecimal privilegeAmount;

    /**
     * 实付金额
     */
    @Column(name = "actual_pay_amount")
    private BigDecimal actualPayAmount;

    /**
     * 尾款金额
     */
    @Column(name = "due_amount")
    private BigDecimal dueAmount;

    /**
     * 创建时间
     */
    @Column(name = "create_at")
    private Date createAt;

    /**
     * 创建人ID
     */
    @Column(name = "create_by")
    private Long createBy;

    /**
     * 更新时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 更新人ID
     */
    @Column(name = "update_by")
    private Long updateBy;

    /**
     * 是否删除 0:否 1:是
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * 扩展字段
     */
    private String ext;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取机构ID
     *
     * @return organization_id - 机构ID
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置机构ID
     *
     * @param organizationId 机构ID
     */
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId == null ? null : organizationId.trim();
    }

    /**
     * 获取合同编号
     *
     * @return order_no - 合同编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置合同编号
     *
     * @param orderNo 合同编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取赠课课时
     *
     * @return course_num - 赠课课时
     */
    public Integer getCourseNum() {
        return courseNum;
    }

    /**
     * 设置赠课课时
     *
     * @param courseNum 赠课课时
     */
    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * 获取实际单价
     *
     * @return actual_price - 实际单价
     */
    public BigDecimal getActualPrice() {
        return actualPrice;
    }

    /**
     * 设置实际单价
     *
     * @param actualPrice 实际单价
     */
    public void setActualPrice(BigDecimal actualPrice) {
        this.actualPrice = actualPrice;
    }

    /**
     * 获取实际总价
     *
     * @return actual_amount - 实际总价
     */
    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    /**
     * 设置实际总价
     *
     * @param actualAmount 实际总价
     */
    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    /**
     * 获取优惠金额
     *
     * @return privilege_amount - 优惠金额
     */
    public BigDecimal getPrivilegeAmount() {
        return privilegeAmount;
    }

    /**
     * 设置优惠金额
     *
     * @param privilegeAmount 优惠金额
     */
    public void setPrivilegeAmount(BigDecimal privilegeAmount) {
        this.privilegeAmount = privilegeAmount;
    }

    /**
     * 获取实付金额
     *
     * @return actual_pay_amount - 实付金额
     */
    public BigDecimal getActualPayAmount() {
        return actualPayAmount;
    }

    /**
     * 设置实付金额
     *
     * @param actualPayAmount 实付金额
     */
    public void setActualPayAmount(BigDecimal actualPayAmount) {
        this.actualPayAmount = actualPayAmount;
    }

    /**
     * 获取尾款金额
     *
     * @return due_amount - 尾款金额
     */
    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    /**
     * 设置尾款金额
     *
     * @param dueAmount 尾款金额
     */
    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    /**
     * 获取创建时间
     *
     * @return create_at - 创建时间
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * 设置创建时间
     *
     * @param createAt 创建时间
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * 获取创建人ID
     *
     * @return create_by - 创建人ID
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * 设置创建人ID
     *
     * @param createBy 创建人ID
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * 获取更新时间
     *
     * @return update_at - 更新时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置更新时间
     *
     * @param updateAt 更新时间
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * 获取更新人ID
     *
     * @return update_by - 更新人ID
     */
    public Long getUpdateBy() {
        return updateBy;
    }

    /**
     * 设置更新人ID
     *
     * @param updateBy 更新人ID
     */
    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * 获取是否删除 0:否 1:是
     *
     * @return is_deleted - 是否删除 0:否 1:是
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 0:否 1:是
     *
     * @param isDeleted 是否删除 0:否 1:是
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取扩展字段
     *
     * @return ext - 扩展字段
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展字段
     *
     * @param ext 扩展字段
     */
    public void setExt(String ext) {
        this.ext = ext == null ? null : ext.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", courseNum=").append(courseNum);
        sb.append(", actualPrice=").append(actualPrice);
        sb.append(", actualAmount=").append(actualAmount);
        sb.append(", privilegeAmount=").append(privilegeAmount);
        sb.append(", actualPayAmount=").append(actualPayAmount);
        sb.append(", dueAmount=").append(dueAmount);
        sb.append(", createAt=").append(createAt);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", ext=").append(ext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}