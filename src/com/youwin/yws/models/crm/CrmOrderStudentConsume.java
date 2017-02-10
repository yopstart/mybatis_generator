package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmOrderStudentConsume implements Serializable {
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
     * 教师ID即员工ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 年级ID
     */
    @Column(name = "grade_id")
    private Integer gradeId;

    /**
     * 科目ID
     */
    @Column(name = "subject_id")
    private Integer subjectId;

    /**
     * 课程类型
     */
    @Column(name = "teaching_course_type_id")
    private Integer teachingCourseTypeId;

    /**
     * 消课课时数量[2.0]
     */
    @Column(name = "course_num")
    private BigDecimal courseNum;

    /**
     * 星期一
     */
    @Column(name = "week_day")
    private String weekDay;

    /**
     * 时间段[8:00~10:00]
     */
    @Column(name = "consume_time")
    private String consumeTime;

    /**
     * 日期[天]
     */
    @Column(name = "consume_date")
    private Date consumeDate;

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
     * 获取教师ID即员工ID
     *
     * @return user_id - 教师ID即员工ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置教师ID即员工ID
     *
     * @param userId 教师ID即员工ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取年级ID
     *
     * @return grade_id - 年级ID
     */
    public Integer getGradeId() {
        return gradeId;
    }

    /**
     * 设置年级ID
     *
     * @param gradeId 年级ID
     */
    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    /**
     * 获取科目ID
     *
     * @return subject_id - 科目ID
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * 设置科目ID
     *
     * @param subjectId 科目ID
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * 获取课程类型
     *
     * @return teaching_course_type_id - 课程类型
     */
    public Integer getTeachingCourseTypeId() {
        return teachingCourseTypeId;
    }

    /**
     * 设置课程类型
     *
     * @param teachingCourseTypeId 课程类型
     */
    public void setTeachingCourseTypeId(Integer teachingCourseTypeId) {
        this.teachingCourseTypeId = teachingCourseTypeId;
    }

    /**
     * 获取消课课时数量[2.0]
     *
     * @return course_num - 消课课时数量[2.0]
     */
    public BigDecimal getCourseNum() {
        return courseNum;
    }

    /**
     * 设置消课课时数量[2.0]
     *
     * @param courseNum 消课课时数量[2.0]
     */
    public void setCourseNum(BigDecimal courseNum) {
        this.courseNum = courseNum;
    }

    /**
     * 获取星期一
     *
     * @return week_day - 星期一
     */
    public String getWeekDay() {
        return weekDay;
    }

    /**
     * 设置星期一
     *
     * @param weekDay 星期一
     */
    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay == null ? null : weekDay.trim();
    }

    /**
     * 获取时间段[8:00~10:00]
     *
     * @return consume_time - 时间段[8:00~10:00]
     */
    public String getConsumeTime() {
        return consumeTime;
    }

    /**
     * 设置时间段[8:00~10:00]
     *
     * @param consumeTime 时间段[8:00~10:00]
     */
    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime == null ? null : consumeTime.trim();
    }

    /**
     * 获取日期[天]
     *
     * @return consume_date - 日期[天]
     */
    public Date getConsumeDate() {
        return consumeDate;
    }

    /**
     * 设置日期[天]
     *
     * @param consumeDate 日期[天]
     */
    public void setConsumeDate(Date consumeDate) {
        this.consumeDate = consumeDate;
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
        sb.append(", userId=").append(userId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", teachingCourseTypeId=").append(teachingCourseTypeId);
        sb.append(", courseNum=").append(courseNum);
        sb.append(", weekDay=").append(weekDay);
        sb.append(", consumeTime=").append(consumeTime);
        sb.append(", consumeDate=").append(consumeDate);
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