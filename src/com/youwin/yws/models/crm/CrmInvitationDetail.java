package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmInvitationDetail implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 被邀请的用户ID 如果person_state=2则为leads_main主表ID；否则根据person_type查询具体客户表
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
     * 指派的邀约人ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 机构ID
     */
    @Column(name = "organization_id")
    private Long organizationId;

    /**
     * 邀约时间
     */
    @Column(name = "invitate_time")
    private Date invitateTime;

    /**
     * 预约到访时间
     */
    @Column(name = "receive_time")
    private Date receiveTime;

    /**
     * 邀约内容
     */
    @Column(name = "invitation_content")
    private String invitationContent;

    /**
     * 到访状态 1:已到访 2:未到访
     */
    private Byte state;

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
     * 获取被邀请的用户ID 如果person_state=2则为leads_main主表ID；否则根据person_type查询具体客户表
     *
     * @return person_id - 被邀请的用户ID 如果person_state=2则为leads_main主表ID；否则根据person_type查询具体客户表
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * 设置被邀请的用户ID 如果person_state=2则为leads_main主表ID；否则根据person_type查询具体客户表
     *
     * @param personId 被邀请的用户ID 如果person_state=2则为leads_main主表ID；否则根据person_type查询具体客户表
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
     * 获取指派的邀约人ID
     *
     * @return user_id - 指派的邀约人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置指派的邀约人ID
     *
     * @param userId 指派的邀约人ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
     * 获取邀约时间
     *
     * @return invitate_time - 邀约时间
     */
    public Date getInvitateTime() {
        return invitateTime;
    }

    /**
     * 设置邀约时间
     *
     * @param invitateTime 邀约时间
     */
    public void setInvitateTime(Date invitateTime) {
        this.invitateTime = invitateTime;
    }

    /**
     * 获取预约到访时间
     *
     * @return receive_time - 预约到访时间
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * 设置预约到访时间
     *
     * @param receiveTime 预约到访时间
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * 获取邀约内容
     *
     * @return invitation_content - 邀约内容
     */
    public String getInvitationContent() {
        return invitationContent;
    }

    /**
     * 设置邀约内容
     *
     * @param invitationContent 邀约内容
     */
    public void setInvitationContent(String invitationContent) {
        this.invitationContent = invitationContent == null ? null : invitationContent.trim();
    }

    /**
     * 获取到访状态 1:已到访 2:未到访
     *
     * @return state - 到访状态 1:已到访 2:未到访
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置到访状态 1:已到访 2:未到访
     *
     * @param state 到访状态 1:已到访 2:未到访
     */
    public void setState(Byte state) {
        this.state = state;
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
        sb.append(", userId=").append(userId);
        sb.append(", organizationId=").append(organizationId);
        sb.append(", invitateTime=").append(invitateTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", invitationContent=").append(invitationContent);
        sb.append(", state=").append(state);
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