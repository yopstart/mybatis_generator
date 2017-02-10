package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmCustomerGroup implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 所属机构ID
     */
    @Column(name = "organizations_id")
    private Long organizationsId;

    /**
     * 班组编号
     */
    @Column(name = "group_no")
    private String groupNo;

    /**
     * 班组学生数量
     */
    @Column(name = "group_student_no")
    private String groupStudentNo;

    /**
     * 校区学习顾问(包含主管)的ID
     */
    @Column(name = "user_id")
    private String userId;

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
     * 获取所属机构ID
     *
     * @return organizations_id - 所属机构ID
     */
    public Long getOrganizationsId() {
        return organizationsId;
    }

    /**
     * 设置所属机构ID
     *
     * @param organizationsId 所属机构ID
     */
    public void setOrganizationsId(Long organizationsId) {
        this.organizationsId = organizationsId;
    }

    /**
     * 获取班组编号
     *
     * @return group_no - 班组编号
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * 设置班组编号
     *
     * @param groupNo 班组编号
     */
    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo == null ? null : groupNo.trim();
    }

    /**
     * 获取班组学生数量
     *
     * @return group_student_no - 班组学生数量
     */
    public String getGroupStudentNo() {
        return groupStudentNo;
    }

    /**
     * 设置班组学生数量
     *
     * @param groupStudentNo 班组学生数量
     */
    public void setGroupStudentNo(String groupStudentNo) {
        this.groupStudentNo = groupStudentNo == null ? null : groupStudentNo.trim();
    }

    /**
     * 获取校区学习顾问(包含主管)的ID
     *
     * @return user_id - 校区学习顾问(包含主管)的ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置校区学习顾问(包含主管)的ID
     *
     * @param userId 校区学习顾问(包含主管)的ID
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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
        sb.append(", organizationsId=").append(organizationsId);
        sb.append(", groupNo=").append(groupNo);
        sb.append(", groupStudentNo=").append(groupStudentNo);
        sb.append(", userId=").append(userId);
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