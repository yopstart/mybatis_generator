package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmInvitationRemind implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 被提醒的用户ID 根据person_state和person_type查询具体客户表
     */
    @Column(name = "person_id")
    private Long personId;

    /**
     * 被提醒的用户类型 1:学生 2:商户机构
     */
    @Column(name = "person_type")
    private Byte personType;

    /**
     * 被提醒的用户状态 1:正式客户 2:未签约leads
     */
    @Column(name = "person_state")
    private Byte personState;

    /**
     * 机构ID
     */
    @Column(name = "organization_id")
    private Long organizationId;

    /**
     * 提醒时间
     */
    @Column(name = "remind_time")
    private Date remindTime;

    /**
     * 提醒内容
     */
    @Column(name = "remind_content")
    private String remindContent;

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
     * 更改时间
     */
    @Column(name = "update_at")
    private Date updateAt;

    /**
     * 更新人ID
     */
    @Column(name = "update_by")
    private Long updateBy;

    /**
     * 是否删除 0:否 1：是
     */
    @Column(name = "is_deleted")
    private Boolean isDeleted;

    /**
     * 扩展备用字段
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
     * 获取被提醒的用户ID 根据person_state和person_type查询具体客户表
     *
     * @return person_id - 被提醒的用户ID 根据person_state和person_type查询具体客户表
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * 设置被提醒的用户ID 根据person_state和person_type查询具体客户表
     *
     * @param personId 被提醒的用户ID 根据person_state和person_type查询具体客户表
     */
    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    /**
     * 获取被提醒的用户类型 1:学生 2:商户机构
     *
     * @return person_type - 被提醒的用户类型 1:学生 2:商户机构
     */
    public Byte getPersonType() {
        return personType;
    }

    /**
     * 设置被提醒的用户类型 1:学生 2:商户机构
     *
     * @param personType 被提醒的用户类型 1:学生 2:商户机构
     */
    public void setPersonType(Byte personType) {
        this.personType = personType;
    }

    /**
     * 获取被提醒的用户状态 1:正式客户 2:未签约leads
     *
     * @return person_state - 被提醒的用户状态 1:正式客户 2:未签约leads
     */
    public Byte getPersonState() {
        return personState;
    }

    /**
     * 设置被提醒的用户状态 1:正式客户 2:未签约leads
     *
     * @param personState 被提醒的用户状态 1:正式客户 2:未签约leads
     */
    public void setPersonState(Byte personState) {
        this.personState = personState;
    }

    /**
     * 获取机构ID
     *
     * @return organization_id - 机构ID
     */
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * 设置机构ID
     *
     * @param organizationId 机构ID
     */
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    /**
     * 获取提醒时间
     *
     * @return remind_time - 提醒时间
     */
    public Date getRemindTime() {
        return remindTime;
    }

    /**
     * 设置提醒时间
     *
     * @param remindTime 提醒时间
     */
    public void setRemindTime(Date remindTime) {
        this.remindTime = remindTime;
    }

    /**
     * 获取提醒内容
     *
     * @return remind_content - 提醒内容
     */
    public String getRemindContent() {
        return remindContent;
    }

    /**
     * 设置提醒内容
     *
     * @param remindContent 提醒内容
     */
    public void setRemindContent(String remindContent) {
        this.remindContent = remindContent == null ? null : remindContent.trim();
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
     * 获取更改时间
     *
     * @return update_at - 更改时间
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * 设置更改时间
     *
     * @param updateAt 更改时间
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
     * 获取是否删除 0:否 1：是
     *
     * @return is_deleted - 是否删除 0:否 1：是
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除 0:否 1：是
     *
     * @param isDeleted 是否删除 0:否 1：是
     */
    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取扩展备用字段
     *
     * @return ext - 扩展备用字段
     */
    public String getExt() {
        return ext;
    }

    /**
     * 设置扩展备用字段
     *
     * @param ext 扩展备用字段
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
        sb.append(", personId=").append(personId);
        sb.append(", personType=").append(personType);
        sb.append(", personState=").append(personState);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", remindTime=").append(remindTime);
        sb.append(", remindContent=").append(remindContent);
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