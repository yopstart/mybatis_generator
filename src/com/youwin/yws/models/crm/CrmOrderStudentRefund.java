package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmOrderStudentRefund implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 所属机构ID
     */
    @Column(name = "organization_id")
    private Long organizationId;

    /**
     * 学生leads主表ID
     */
    @Column(name = "leads_student_id")
    private Long leadsStudentId;

    /**
     * 原始合同编号
     */
    @Column(name = "origin_order_no")
    private String originOrderNo;

    /**
     * 退费编号
     */
    @Column(name = "refund_no")
    private String refundNo;

    /**
     * 退费类型[现金 转账 支票]
     */
    @Column(name = "refund_type")
    private Integer refundType;

    /**
     * 退费日期
     */
    @Column(name = "refund_date")
    private Date refundDate;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 创建人ID
     */
    @Column(name = "created_by")
    private Long createdBy;

    /**
     * 更新时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 更新人ID
     */
    @Column(name = "updated_by")
    private Long updatedBy;

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
     * 获取所属机构ID
     *
     * @return organization_id - 所属机构ID
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置所属机构ID
     *
     * @param organizationId 所属机构ID
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 获取学生leads主表ID
     *
     * @return leads_student_id - 学生leads主表ID
     */
    public Long getLeadsStudentId() {
        return leadsStudentId;
    }

    /**
     * 设置学生leads主表ID
     *
     * @param leadsStudentId 学生leads主表ID
     */
    public void setLeadsStudentId(Long leadsStudentId) {
        this.leadsStudentId = leadsStudentId;
    }

    /**
     * 获取原始合同编号
     *
     * @return origin_order_no - 原始合同编号
     */
    public String getOriginOrderNo() {
        return originOrderNo;
    }

    /**
     * 设置原始合同编号
     *
     * @param originOrderNo 原始合同编号
     */
    public void setOriginOrderNo(String originOrderNo) {
        this.originOrderNo = originOrderNo == null ? null : originOrderNo.trim();
    }

    /**
     * 获取退费编号
     *
     * @return refund_no - 退费编号
     */
    public String getRefundNo() {
        return refundNo;
    }

    /**
     * 设置退费编号
     *
     * @param refundNo 退费编号
     */
    public void setRefundNo(String refundNo) {
        this.refundNo = refundNo == null ? null : refundNo.trim();
    }

    /**
     * 获取退费类型[现金 转账 支票]
     *
     * @return refund_type - 退费类型[现金 转账 支票]
     */
    public Integer getRefundType() {
        return refundType;
    }

    /**
     * 设置退费类型[现金 转账 支票]
     *
     * @param refundType 退费类型[现金 转账 支票]
     */
    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    /**
     * 获取退费日期
     *
     * @return refund_date - 退费日期
     */
    public Date getRefundDate() {
        return refundDate;
    }

    /**
     * 设置退费日期
     *
     * @param refundDate 退费日期
     */
    public void setRefundDate(Date refundDate) {
        this.refundDate = refundDate;
    }

    /**
     * 获取创建时间
     *
     * @return created_at - 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 设置创建时间
     *
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 获取创建人ID
     *
     * @return created_by - 创建人ID
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人ID
     *
     * @param createdBy 创建人ID
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新时间
     *
     * @return updated_at - 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 设置更新时间
     *
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * 获取更新人ID
     *
     * @return updated_by - 更新人ID
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人ID
     *
     * @param updatedBy 更新人ID
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
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
        sb.append(", leadsStudentId=").append(leadsStudentId);
        sb.append(", originOrderNo=").append(originOrderNo);
        sb.append(", refundNo=").append(refundNo);
        sb.append(", refundType=").append(refundType);
        sb.append(", refundDate=").append(refundDate);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", ext=").append(ext);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}