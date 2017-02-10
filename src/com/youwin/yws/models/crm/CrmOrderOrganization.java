package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmOrderOrganization implements Serializable {
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
     * 商户机构leads主表ID
     */
    @Column(name = "leads_organization_id")
    private Long leadsOrganizationId;

    /**
     * 订单创建人ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 合同编号
     */
    @Column(name = "order_no")
    private String orderNo;

    /**
     * 订单类型[]
     */
    @Column(name = "order_type")
    private Integer orderType;

    /**
     * 订单状态[1，已录入订单2，已支付定金 3，已审核通过 4，已生成合同5，已退单]
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 签约时间
     */
    @Column(name = "contract_start_date")
    private Date contractStartDate;

    /**
     * 到期时间
     */
    @Column(name = "contract_end_date")
    private Date contractEndDate;

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
     * 获取商户机构leads主表ID
     *
     * @return leads_organization_id - 商户机构leads主表ID
     */
    public Long getLeadsOrganizationId() {
        return leadsOrganizationId;
    }

    /**
     * 设置商户机构leads主表ID
     *
     * @param leadsOrganizationId 商户机构leads主表ID
     */
    public void setLeadsOrganizationId(Long leadsOrganizationId) {
        this.leadsOrganizationId = leadsOrganizationId;
    }

    /**
     * 获取订单创建人ID
     *
     * @return user_id - 订单创建人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置订单创建人ID
     *
     * @param userId 订单创建人ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 获取订单类型[]
     *
     * @return order_type - 订单类型[]
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型[]
     *
     * @param orderType 订单类型[]
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取订单状态[1，已录入订单2，已支付定金 3，已审核通过 4，已生成合同5，已退单]
     *
     * @return order_status - 订单状态[1，已录入订单2，已支付定金 3，已审核通过 4，已生成合同5，已退单]
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态[1，已录入订单2，已支付定金 3，已审核通过 4，已生成合同5，已退单]
     *
     * @param orderStatus 订单状态[1，已录入订单2，已支付定金 3，已审核通过 4，已生成合同5，已退单]
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取签约时间
     *
     * @return contract_start_date - 签约时间
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    /**
     * 设置签约时间
     *
     * @param contractStartDate 签约时间
     */
    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * 获取到期时间
     *
     * @return contract_end_date - 到期时间
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * 设置到期时间
     *
     * @param contractEndDate 到期时间
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
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
        sb.append(", leadsOrganizationId=").append(leadsOrganizationId);
        sb.append(", userId=").append(userId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", contractStartDate=").append(contractStartDate);
        sb.append(", contractEndDate=").append(contractEndDate);
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