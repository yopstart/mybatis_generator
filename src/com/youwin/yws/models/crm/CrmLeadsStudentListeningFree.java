package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmLeadsStudentListeningFree implements Serializable {
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
     * 试听leadsID
     */
    @Column(name = "leads_student_id")
    private Long leadsStudentId;

    /**
     * 试听课程ID
     */
    @Column(name = "teaching_course_id")
    private Long teachingCourseId;

    /**
     * 试听课程时长
     */
    @Column(name = "listening_test_hourse")
    private Long listeningTestHourse;

    /**
     * 上课日期
     */
    @Column(name = "listening_date")
    private Date listeningDate;

    /**
     * 上课开始时间
     */
    @Column(name = "listening_start_time")
    private Long listeningStartTime;

    /**
     * 上课结束时间
     */
    @Column(name = "listening_end_time")
    private Long listeningEndTime;

    /**
     * 授课教师ID
     */
    @Column(name = "user_id")
    private Long userId;

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
     * 获取试听leadsID
     *
     * @return leads_student_id - 试听leadsID
     */
    public Long getLeadsStudentId() {
        return leadsStudentId;
    }

    /**
     * 设置试听leadsID
     *
     * @param leadsStudentId 试听leadsID
     */
    public void setLeadsStudentId(Long leadsStudentId) {
        this.leadsStudentId = leadsStudentId;
    }

    /**
     * 获取试听课程ID
     *
     * @return teaching_course_id - 试听课程ID
     */
    public Long getTeachingCourseId() {
        return teachingCourseId;
    }

    /**
     * 设置试听课程ID
     *
     * @param teachingCourseId 试听课程ID
     */
    public void setTeachingCourseId(Long teachingCourseId) {
        this.teachingCourseId = teachingCourseId;
    }

    /**
     * 获取试听课程时长
     *
     * @return listening_test_hourse - 试听课程时长
     */
    public Long getListeningTestHourse() {
        return listeningTestHourse;
    }

    /**
     * 设置试听课程时长
     *
     * @param listeningTestHourse 试听课程时长
     */
    public void setListeningTestHourse(Long listeningTestHourse) {
        this.listeningTestHourse = listeningTestHourse;
    }

    /**
     * 获取上课日期
     *
     * @return listening_date - 上课日期
     */
    public Date getListeningDate() {
        return listeningDate;
    }

    /**
     * 设置上课日期
     *
     * @param listeningDate 上课日期
     */
    public void setListeningDate(Date listeningDate) {
        this.listeningDate = listeningDate;
    }

    /**
     * 获取上课开始时间
     *
     * @return listening_start_time - 上课开始时间
     */
    public Long getListeningStartTime() {
        return listeningStartTime;
    }

    /**
     * 设置上课开始时间
     *
     * @param listeningStartTime 上课开始时间
     */
    public void setListeningStartTime(Long listeningStartTime) {
        this.listeningStartTime = listeningStartTime;
    }

    /**
     * 获取上课结束时间
     *
     * @return listening_end_time - 上课结束时间
     */
    public Long getListeningEndTime() {
        return listeningEndTime;
    }

    /**
     * 设置上课结束时间
     *
     * @param listeningEndTime 上课结束时间
     */
    public void setListeningEndTime(Long listeningEndTime) {
        this.listeningEndTime = listeningEndTime;
    }

    /**
     * 获取授课教师ID
     *
     * @return user_id - 授课教师ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置授课教师ID
     *
     * @param userId 授课教师ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
        sb.append(", leadsStudentId=").append(leadsStudentId);
        sb.append(", teachingCourseId=").append(teachingCourseId);
        sb.append(", listeningTestHourse=").append(listeningTestHourse);
        sb.append(", listeningDate=").append(listeningDate);
        sb.append(", listeningStartTime=").append(listeningStartTime);
        sb.append(", listeningEndTime=").append(listeningEndTime);
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