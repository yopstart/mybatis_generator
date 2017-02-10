package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CrmDataStudentDetail implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 线索学生用户主表ID
     */
    @Column(name = "leads_student_id")
    private Long leadsStudentId;

    /**
     * 学生客户表ID
     */
    @Column(name = "customer_student_id")
    private Long customerStudentId;

    /**
     * 咨询科目ID
     */
    @Column(name = "subject_id")
    private Integer subjectId;

    /**
     * 年级ID
     */
    @Column(name = "grade_id")
    private Integer gradeId;

    /**
     * 根据所在地区进行校区ID筛选
     */
    @Column(name = "belong_school_id")
    private Long belongSchoolId;

    /**
     * 客户编号
     */
    private String number;

    /**
     * 姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    /**
     * 母亲姓名
     */
    @Column(name = "mother_name")
    private String motherName;

    /**
     * 母亲电话
     */
    @Column(name = "mother_phone")
    private String motherPhone;

    /**
     * 父亲姓名
     */
    @Column(name = "father_name")
    private String fatherName;

    /**
     * 父亲电话
     */
    @Column(name = "father_phone")
    private String fatherPhone;

    /**
     * 学生当前学校名称
     */
    @Column(name = "school_name")
    private String schoolName;

    /**
     * 媒体渠道
     */
    @Column(name = "media_channel")
    private Byte mediaChannel;

    /**
     * 渠道详情
     */
    @Column(name = "media_channel_detail")
    private Byte mediaChannelDetail;

    /**
     * 所在地区编号
     */
    @Column(name = "area_code")
    private Integer areaCode;

    /**
     * 性别 0:女；1男
     */
    private Boolean gender;

    /**
     * 年龄
     */
    private Byte age;

    /**
     * 客户需求
     */
    @Column(name = "customer_requirement")
    private String customerRequirement;

    /**
     * 客户类型 1:正式客户 0:线索用户(leads)
     */
    private Boolean type;

    /**
     * 客户状态 1:未联系 2:已联系 3:已邀约 4:已到访 5:已签约 6:已续约
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
     * 获取线索学生用户主表ID
     *
     * @return leads_student_id - 线索学生用户主表ID
     */
    public Long getLeadsStudentId() {
        return leadsStudentId;
    }

    /**
     * 设置线索学生用户主表ID
     *
     * @param leadsStudentId 线索学生用户主表ID
     */
    public void setLeadsStudentId(Long leadsStudentId) {
        this.leadsStudentId = leadsStudentId;
    }

    /**
     * 获取学生客户表ID
     *
     * @return customer_student_id - 学生客户表ID
     */
    public Long getCustomerStudentId() {
        return customerStudentId;
    }

    /**
     * 设置学生客户表ID
     *
     * @param customerStudentId 学生客户表ID
     */
    public void setCustomerStudentId(Long customerStudentId) {
        this.customerStudentId = customerStudentId;
    }

    /**
     * 获取咨询科目ID
     *
     * @return subject_id - 咨询科目ID
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * 设置咨询科目ID
     *
     * @param subjectId 咨询科目ID
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
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
     * 获取根据所在地区进行校区ID筛选
     *
     * @return belong_school_id - 根据所在地区进行校区ID筛选
     */
    public Long getBelongSchoolId() {
        return belongSchoolId;
    }

    /**
     * 设置根据所在地区进行校区ID筛选
     *
     * @param belongSchoolId 根据所在地区进行校区ID筛选
     */
    public void setBelongSchoolId(Long belongSchoolId) {
        this.belongSchoolId = belongSchoolId;
    }

    /**
     * 获取客户编号
     *
     * @return number - 客户编号
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置客户编号
     *
     * @param number 客户编号
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取母亲姓名
     *
     * @return mother_name - 母亲姓名
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * 设置母亲姓名
     *
     * @param motherName 母亲姓名
     */
    public void setMotherName(String motherName) {
        this.motherName = motherName == null ? null : motherName.trim();
    }

    /**
     * 获取母亲电话
     *
     * @return mother_phone - 母亲电话
     */
    public String getMotherPhone() {
        return motherPhone;
    }

    /**
     * 设置母亲电话
     *
     * @param motherPhone 母亲电话
     */
    public void setMotherPhone(String motherPhone) {
        this.motherPhone = motherPhone == null ? null : motherPhone.trim();
    }

    /**
     * 获取父亲姓名
     *
     * @return father_name - 父亲姓名
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * 设置父亲姓名
     *
     * @param fatherName 父亲姓名
     */
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName == null ? null : fatherName.trim();
    }

    /**
     * 获取父亲电话
     *
     * @return father_phone - 父亲电话
     */
    public String getFatherPhone() {
        return fatherPhone;
    }

    /**
     * 设置父亲电话
     *
     * @param fatherPhone 父亲电话
     */
    public void setFatherPhone(String fatherPhone) {
        this.fatherPhone = fatherPhone == null ? null : fatherPhone.trim();
    }

    /**
     * 获取学生当前学校名称
     *
     * @return school_name - 学生当前学校名称
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * 设置学生当前学校名称
     *
     * @param schoolName 学生当前学校名称
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName == null ? null : schoolName.trim();
    }

    /**
     * 获取媒体渠道
     *
     * @return media_channel - 媒体渠道
     */
    public Byte getMediaChannel() {
        return mediaChannel;
    }

    /**
     * 设置媒体渠道
     *
     * @param mediaChannel 媒体渠道
     */
    public void setMediaChannel(Byte mediaChannel) {
        this.mediaChannel = mediaChannel;
    }

    /**
     * 获取渠道详情
     *
     * @return media_channel_detail - 渠道详情
     */
    public Byte getMediaChannelDetail() {
        return mediaChannelDetail;
    }

    /**
     * 设置渠道详情
     *
     * @param mediaChannelDetail 渠道详情
     */
    public void setMediaChannelDetail(Byte mediaChannelDetail) {
        this.mediaChannelDetail = mediaChannelDetail;
    }

    /**
     * 获取所在地区编号
     *
     * @return area_code - 所在地区编号
     */
    public Integer getAreaCode() {
        return areaCode;
    }

    /**
     * 设置所在地区编号
     *
     * @param areaCode 所在地区编号
     */
    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    /**
     * 获取性别 0:女；1男
     *
     * @return gender - 性别 0:女；1男
     */
    public Boolean getGender() {
        return gender;
    }

    /**
     * 设置性别 0:女；1男
     *
     * @param gender 性别 0:女；1男
     */
    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Byte getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * 获取客户需求
     *
     * @return customer_requirement - 客户需求
     */
    public String getCustomerRequirement() {
        return customerRequirement;
    }

    /**
     * 设置客户需求
     *
     * @param customerRequirement 客户需求
     */
    public void setCustomerRequirement(String customerRequirement) {
        this.customerRequirement = customerRequirement == null ? null : customerRequirement.trim();
    }

    /**
     * 获取客户类型 1:正式客户 0:线索用户(leads)
     *
     * @return type - 客户类型 1:正式客户 0:线索用户(leads)
     */
    public Boolean getType() {
        return type;
    }

    /**
     * 设置客户类型 1:正式客户 0:线索用户(leads)
     *
     * @param type 客户类型 1:正式客户 0:线索用户(leads)
     */
    public void setType(Boolean type) {
        this.type = type;
    }

    /**
     * 获取客户状态 1:未联系 2:已联系 3:已邀约 4:已到访 5:已签约 6:已续约
     *
     * @return state - 客户状态 1:未联系 2:已联系 3:已邀约 4:已到访 5:已签约 6:已续约
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置客户状态 1:未联系 2:已联系 3:已邀约 4:已到访 5:已签约 6:已续约
     *
     * @param state 客户状态 1:未联系 2:已联系 3:已邀约 4:已到访 5:已签约 6:已续约
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
        sb.append(", leadsStudentId=").append(leadsStudentId);
        sb.append(", customerStudentId=").append(customerStudentId);
        sb.append(", subjectId=").append(subjectId);
        sb.append(", gradeId=").append(gradeId);
        sb.append(", belongSchoolId=").append(belongSchoolId);
        sb.append(", number=").append(number);
        sb.append(", name=").append(name);
        sb.append(", phone=").append(phone);
        sb.append(", motherName=").append(motherName);
        sb.append(", motherPhone=").append(motherPhone);
        sb.append(", fatherName=").append(fatherName);
        sb.append(", fatherPhone=").append(fatherPhone);
        sb.append(", schoolName=").append(schoolName);
        sb.append(", mediaChannel=").append(mediaChannel);
        sb.append(", mediaChannelDetail=").append(mediaChannelDetail);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", gender=").append(gender);
        sb.append(", age=").append(age);
        sb.append(", customerRequirement=").append(customerRequirement);
        sb.append(", type=").append(type);
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