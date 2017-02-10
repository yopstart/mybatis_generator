package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmOrderStudentTransfer implements Serializable {
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
     * 合同编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 协议编号
     */
    @Column(name = "agreement_no")
    private Long agreementNo;

    /**
     * 受让学员姓名
     */
    @Column(name = "transfer_name")
    private String transferName;

    /**
     * 生效时间
     */
    @Column(name = "start_date")
    private Date startDate;

    /**
     * 终止时间
     */
    @Column(name = "end_date")
    private Date endDate;

    /**
     * 授课形式[1:一对一]
     */
    @Column(name = "lecture_type")
    private Integer lectureType;

    /**
     * 转让课时数量
     */
    @Column(name = "course_num")
    private Integer courseNum;

    /**
     * 审核状态[1:未审核,2:审核通过,3:审核未通过]
     */
    @Column(name = "transfer_status")
    private Integer transferStatus;

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
     * 获取协议编号
     *
     * @return agreement_no - 协议编号
     */
    public Long getAgreementNo() {
        return agreementNo;
    }

    /**
     * 设置协议编号
     *
     * @param agreementNo 协议编号
     */
    public void setAgreementNo(Long agreementNo) {
        this.agreementNo = agreementNo;
    }

    /**
     * 获取受让学员姓名
     *
     * @return transfer_name - 受让学员姓名
     */
    public String getTransferName() {
        return transferName;
    }

    /**
     * 设置受让学员姓名
     *
     * @param transferName 受让学员姓名
     */
    public void setTransferName(String transferName) {
        this.transferName = transferName == null ? null : transferName.trim();
    }

    /**
     * 获取生效时间
     *
     * @return start_date - 生效时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置生效时间
     *
     * @param startDate 生效时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取终止时间
     *
     * @return end_date - 终止时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置终止时间
     *
     * @param endDate 终止时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取授课形式[1:一对一]
     *
     * @return lecture_type - 授课形式[1:一对一]
     */
    public Integer getLectureType() {
        return lectureType;
    }

    /**
     * 设置授课形式[1:一对一]
     *
     * @param lectureType 授课形式[1:一对一]
     */
    public void setLectureType(Integer lectureType) {
        this.lectureType = lectureType;
    }

    /**
     * 获取转让课时数量
     *
     * @return course_num - 转让课时数量
     */
    public Integer getCourseNum() {
        return courseNum;
    }

    /**
     * 设置转让课时数量
     *
     * @param courseNum 转让课时数量
     */
    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * 获取审核状态[1:未审核,2:审核通过,3:审核未通过]
     *
     * @return transfer_status - 审核状态[1:未审核,2:审核通过,3:审核未通过]
     */
    public Integer getTransferStatus() {
        return transferStatus;
    }

    /**
     * 设置审核状态[1:未审核,2:审核通过,3:审核未通过]
     *
     * @param transferStatus 审核状态[1:未审核,2:审核通过,3:审核未通过]
     */
    public void setTransferStatus(Integer transferStatus) {
        this.transferStatus = transferStatus;
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
        sb.append(", orderNo=").append(orderNo);
        sb.append(", agreementNo=").append(agreementNo);
        sb.append(", transferName=").append(transferName);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", lectureType=").append(lectureType);
        sb.append(", courseNum=").append(courseNum);
        sb.append(", transferStatus=").append(transferStatus);
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