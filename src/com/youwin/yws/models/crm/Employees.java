package com.youwin.yws.models.crm;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Employees implements Serializable {
    /**
     * 主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 部门ID
     */
    @Column(name = "department_id")
    private Long departmentId;

    /**
     * 岗位ID
     */
    @Column(name = "position_id")
    private Long positionId;

    /**
     * 员工编号
     */
    @Column(name = "id_number")
    private String idNumber;

    /**
     * 员工年龄
     */
    private Long age;

    /**
     * 手机
     */
    private String mobile;

    private String ethnic;

    @Column(name = "marital_status")
    private Integer maritalStatus;

    /**
     * 生日
     */
    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "highest_education_institute")
    private String highestEducationInstitute;

    private String major;

    /**
     * 毕业时间
     */
    @Column(name = "graduation_date")
    private Date graduationDate;

    /**
     * 学位
     */
    @Column(name = "education_degree")
    private Integer educationDegree;

    /**
     * 学位类型
     */
    @Column(name = "education_degree_type")
    private Integer educationDegreeType;

    @Column(name = "registered_residence")
    private String registeredResidence;

    @Column(name = "registered_residence_type")
    private Integer registeredResidenceType;

    @Column(name = "emergency_contact_name")
    private String emergencyContactName;

    @Column(name = "emergency_contact_relationship")
    private Integer emergencyContactRelationship;

    @Column(name = "emergency_contact_number")
    private String emergencyContactNumber;

    /**
     * 地址
     */
    private String address;

    /**
     * 雇佣状态
     */
    @Column(name = "employment_status")
    private Integer employmentStatus;

    /**
     * 雇佣类型
     */
    @Column(name = "employment_type")
    private Integer employmentType;

    @Column(name = "hiring_date")
    private Date hiringDate;

    @Column(name = "trial_end_date")
    private Date trialEndDate;

    @Column(name = "employment_level")
    private Integer employmentLevel;

    private Long supervisor;

    /**
     * 学科
     */
    private String subject;

    /**
     * 星级（无、三星、四星、五星）
     */
    @Column(name = "star_level")
    private String starLevel;

    /**
     * 在公司工作年限
     */
    @Column(name = "working_years")
    private Integer workingYears;

    /**
     * 最近一次工作经历
     */
    @Column(name = "latest_working_experience")
    private String latestWorkingExperience;

    @Column(name = "latest_company_position")
    private String latestCompanyPosition;

    /**
     * 最后一次学习起始时间
     */
    @Column(name = "latest_education_start_date")
    private Date latestEducationStartDate;

    /**
     * 最后一次学习终止时间
     */
    @Column(name = "latest_education_end_date")
    private Date latestEducationEndDate;

    /**
     * 招聘来源(总部渠道、校区渠道、内部推荐、非你莫属)
     */
    @Column(name = "recruitment_sources")
    private String recruitmentSources;

    /**
     * 内部推荐推荐人
     */
    @Column(name = "reference_name")
    private String referenceName;

    @Column(name = "payment_start_date")
    private Date paymentStartDate;

    @Column(name = "contract_start_date")
    private Date contractStartDate;

    @Column(name = "contract_end_date")
    private Date contractEndDate;

    @Column(name = "contract_type")
    private Integer contractType;

    private String employer;

    @Column(name = "trial_salary")
    private Double trialSalary;

    private Double salary;

    @Column(name = "performance_base")
    private Double performanceBase;

    private Double royalty;

    @Column(name = "social_security_status")
    private Integer socialSecurityStatus;

    @Column(name = "social_security_base")
    private Double socialSecurityBase;

    @Column(name = "social_security_self_amount")
    private Double socialSecuritySelfAmount;

    @Column(name = "social_security_employer_amount")
    private Double socialSecurityEmployerAmount;

    @Column(name = "social_security_address")
    private String socialSecurityAddress;

    @Column(name = "housing_fund_status")
    private Integer housingFundStatus;

    @Column(name = "housing_fund_base")
    private Double housingFundBase;

    @Column(name = "housing_fund_self_amount")
    private Double housingFundSelfAmount;

    @Column(name = "housing_fund_employer_amount")
    private Double housingFundEmployerAmount;

    @Column(name = "housing_fund_address")
    private String housingFundAddress;

    /**
     * 创建时间
     */
    @Column(name = "created_at")
    private Date createdAt;

    /**
     * 更新时间
     */
    @Column(name = "updated_at")
    private Date updatedAt;

    /**
     * 创建人
     */
    @Column(name = "created_by")
    private Long createdBy;

    /**
     * 更新人
     */
    @Column(name = "updated_by")
    private Long updatedBy;

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
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取部门ID
     *
     * @return department_id - 部门ID
     */
    public Long getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置部门ID
     *
     * @param departmentId 部门ID
     */
    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取岗位ID
     *
     * @return position_id - 岗位ID
     */
    public Long getPositionId() {
        return positionId;
    }

    /**
     * 设置岗位ID
     *
     * @param positionId 岗位ID
     */
    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    /**
     * 获取员工编号
     *
     * @return id_number - 员工编号
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * 设置员工编号
     *
     * @param idNumber 员工编号
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    /**
     * 获取员工年龄
     *
     * @return age - 员工年龄
     */
    public Long getAge() {
        return age;
    }

    /**
     * 设置员工年龄
     *
     * @param age 员工年龄
     */
    public void setAge(Long age) {
        this.age = age;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * @return ethnic
     */
    public String getEthnic() {
        return ethnic;
    }

    /**
     * @param ethnic
     */
    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    /**
     * @return marital_status
     */
    public Integer getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus
     */
    public void setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 获取生日
     *
     * @return birth_date - 生日
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * 设置生日
     *
     * @param birthDate 生日
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return highest_education_institute
     */
    public String getHighestEducationInstitute() {
        return highestEducationInstitute;
    }

    /**
     * @param highestEducationInstitute
     */
    public void setHighestEducationInstitute(String highestEducationInstitute) {
        this.highestEducationInstitute = highestEducationInstitute == null ? null : highestEducationInstitute.trim();
    }

    /**
     * @return major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major
     */
    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    /**
     * 获取毕业时间
     *
     * @return graduation_date - 毕业时间
     */
    public Date getGraduationDate() {
        return graduationDate;
    }

    /**
     * 设置毕业时间
     *
     * @param graduationDate 毕业时间
     */
    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    /**
     * 获取学位
     *
     * @return education_degree - 学位
     */
    public Integer getEducationDegree() {
        return educationDegree;
    }

    /**
     * 设置学位
     *
     * @param educationDegree 学位
     */
    public void setEducationDegree(Integer educationDegree) {
        this.educationDegree = educationDegree;
    }

    /**
     * 获取学位类型
     *
     * @return education_degree_type - 学位类型
     */
    public Integer getEducationDegreeType() {
        return educationDegreeType;
    }

    /**
     * 设置学位类型
     *
     * @param educationDegreeType 学位类型
     */
    public void setEducationDegreeType(Integer educationDegreeType) {
        this.educationDegreeType = educationDegreeType;
    }

    /**
     * @return registered_residence
     */
    public String getRegisteredResidence() {
        return registeredResidence;
    }

    /**
     * @param registeredResidence
     */
    public void setRegisteredResidence(String registeredResidence) {
        this.registeredResidence = registeredResidence == null ? null : registeredResidence.trim();
    }

    /**
     * @return registered_residence_type
     */
    public Integer getRegisteredResidenceType() {
        return registeredResidenceType;
    }

    /**
     * @param registeredResidenceType
     */
    public void setRegisteredResidenceType(Integer registeredResidenceType) {
        this.registeredResidenceType = registeredResidenceType;
    }

    /**
     * @return emergency_contact_name
     */
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    /**
     * @param emergencyContactName
     */
    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName == null ? null : emergencyContactName.trim();
    }

    /**
     * @return emergency_contact_relationship
     */
    public Integer getEmergencyContactRelationship() {
        return emergencyContactRelationship;
    }

    /**
     * @param emergencyContactRelationship
     */
    public void setEmergencyContactRelationship(Integer emergencyContactRelationship) {
        this.emergencyContactRelationship = emergencyContactRelationship;
    }

    /**
     * @return emergency_contact_number
     */
    public String getEmergencyContactNumber() {
        return emergencyContactNumber;
    }

    /**
     * @param emergencyContactNumber
     */
    public void setEmergencyContactNumber(String emergencyContactNumber) {
        this.emergencyContactNumber = emergencyContactNumber == null ? null : emergencyContactNumber.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取雇佣状态
     *
     * @return employment_status - 雇佣状态
     */
    public Integer getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * 设置雇佣状态
     *
     * @param employmentStatus 雇佣状态
     */
    public void setEmploymentStatus(Integer employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    /**
     * 获取雇佣类型
     *
     * @return employment_type - 雇佣类型
     */
    public Integer getEmploymentType() {
        return employmentType;
    }

    /**
     * 设置雇佣类型
     *
     * @param employmentType 雇佣类型
     */
    public void setEmploymentType(Integer employmentType) {
        this.employmentType = employmentType;
    }

    /**
     * @return hiring_date
     */
    public Date getHiringDate() {
        return hiringDate;
    }

    /**
     * @param hiringDate
     */
    public void setHiringDate(Date hiringDate) {
        this.hiringDate = hiringDate;
    }

    /**
     * @return trial_end_date
     */
    public Date getTrialEndDate() {
        return trialEndDate;
    }

    /**
     * @param trialEndDate
     */
    public void setTrialEndDate(Date trialEndDate) {
        this.trialEndDate = trialEndDate;
    }

    /**
     * @return employment_level
     */
    public Integer getEmploymentLevel() {
        return employmentLevel;
    }

    /**
     * @param employmentLevel
     */
    public void setEmploymentLevel(Integer employmentLevel) {
        this.employmentLevel = employmentLevel;
    }

    /**
     * @return supervisor
     */
    public Long getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor
     */
    public void setSupervisor(Long supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * 获取学科
     *
     * @return subject - 学科
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置学科
     *
     * @param subject 学科
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * 获取星级（无、三星、四星、五星）
     *
     * @return star_level - 星级（无、三星、四星、五星）
     */
    public String getStarLevel() {
        return starLevel;
    }

    /**
     * 设置星级（无、三星、四星、五星）
     *
     * @param starLevel 星级（无、三星、四星、五星）
     */
    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel == null ? null : starLevel.trim();
    }

    /**
     * 获取在公司工作年限
     *
     * @return working_years - 在公司工作年限
     */
    public Integer getWorkingYears() {
        return workingYears;
    }

    /**
     * 设置在公司工作年限
     *
     * @param workingYears 在公司工作年限
     */
    public void setWorkingYears(Integer workingYears) {
        this.workingYears = workingYears;
    }

    /**
     * 获取最近一次工作经历
     *
     * @return latest_working_experience - 最近一次工作经历
     */
    public String getLatestWorkingExperience() {
        return latestWorkingExperience;
    }

    /**
     * 设置最近一次工作经历
     *
     * @param latestWorkingExperience 最近一次工作经历
     */
    public void setLatestWorkingExperience(String latestWorkingExperience) {
        this.latestWorkingExperience = latestWorkingExperience == null ? null : latestWorkingExperience.trim();
    }

    /**
     * @return latest_company_position
     */
    public String getLatestCompanyPosition() {
        return latestCompanyPosition;
    }

    /**
     * @param latestCompanyPosition
     */
    public void setLatestCompanyPosition(String latestCompanyPosition) {
        this.latestCompanyPosition = latestCompanyPosition == null ? null : latestCompanyPosition.trim();
    }

    /**
     * 获取最后一次学习起始时间
     *
     * @return latest_education_start_date - 最后一次学习起始时间
     */
    public Date getLatestEducationStartDate() {
        return latestEducationStartDate;
    }

    /**
     * 设置最后一次学习起始时间
     *
     * @param latestEducationStartDate 最后一次学习起始时间
     */
    public void setLatestEducationStartDate(Date latestEducationStartDate) {
        this.latestEducationStartDate = latestEducationStartDate;
    }

    /**
     * 获取最后一次学习终止时间
     *
     * @return latest_education_end_date - 最后一次学习终止时间
     */
    public Date getLatestEducationEndDate() {
        return latestEducationEndDate;
    }

    /**
     * 设置最后一次学习终止时间
     *
     * @param latestEducationEndDate 最后一次学习终止时间
     */
    public void setLatestEducationEndDate(Date latestEducationEndDate) {
        this.latestEducationEndDate = latestEducationEndDate;
    }

    /**
     * 获取招聘来源(总部渠道、校区渠道、内部推荐、非你莫属)
     *
     * @return recruitment_sources - 招聘来源(总部渠道、校区渠道、内部推荐、非你莫属)
     */
    public String getRecruitmentSources() {
        return recruitmentSources;
    }

    /**
     * 设置招聘来源(总部渠道、校区渠道、内部推荐、非你莫属)
     *
     * @param recruitmentSources 招聘来源(总部渠道、校区渠道、内部推荐、非你莫属)
     */
    public void setRecruitmentSources(String recruitmentSources) {
        this.recruitmentSources = recruitmentSources == null ? null : recruitmentSources.trim();
    }

    /**
     * 获取内部推荐推荐人
     *
     * @return reference_name - 内部推荐推荐人
     */
    public String getReferenceName() {
        return referenceName;
    }

    /**
     * 设置内部推荐推荐人
     *
     * @param referenceName 内部推荐推荐人
     */
    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName == null ? null : referenceName.trim();
    }

    /**
     * @return payment_start_date
     */
    public Date getPaymentStartDate() {
        return paymentStartDate;
    }

    /**
     * @param paymentStartDate
     */
    public void setPaymentStartDate(Date paymentStartDate) {
        this.paymentStartDate = paymentStartDate;
    }

    /**
     * @return contract_start_date
     */
    public Date getContractStartDate() {
        return contractStartDate;
    }

    /**
     * @param contractStartDate
     */
    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * @return contract_end_date
     */
    public Date getContractEndDate() {
        return contractEndDate;
    }

    /**
     * @param contractEndDate
     */
    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    /**
     * @return contract_type
     */
    public Integer getContractType() {
        return contractType;
    }

    /**
     * @param contractType
     */
    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    /**
     * @return employer
     */
    public String getEmployer() {
        return employer;
    }

    /**
     * @param employer
     */
    public void setEmployer(String employer) {
        this.employer = employer == null ? null : employer.trim();
    }

    /**
     * @return trial_salary
     */
    public Double getTrialSalary() {
        return trialSalary;
    }

    /**
     * @param trialSalary
     */
    public void setTrialSalary(Double trialSalary) {
        this.trialSalary = trialSalary;
    }

    /**
     * @return salary
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * @param salary
     */
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    /**
     * @return performance_base
     */
    public Double getPerformanceBase() {
        return performanceBase;
    }

    /**
     * @param performanceBase
     */
    public void setPerformanceBase(Double performanceBase) {
        this.performanceBase = performanceBase;
    }

    /**
     * @return royalty
     */
    public Double getRoyalty() {
        return royalty;
    }

    /**
     * @param royalty
     */
    public void setRoyalty(Double royalty) {
        this.royalty = royalty;
    }

    /**
     * @return social_security_status
     */
    public Integer getSocialSecurityStatus() {
        return socialSecurityStatus;
    }

    /**
     * @param socialSecurityStatus
     */
    public void setSocialSecurityStatus(Integer socialSecurityStatus) {
        this.socialSecurityStatus = socialSecurityStatus;
    }

    /**
     * @return social_security_base
     */
    public Double getSocialSecurityBase() {
        return socialSecurityBase;
    }

    /**
     * @param socialSecurityBase
     */
    public void setSocialSecurityBase(Double socialSecurityBase) {
        this.socialSecurityBase = socialSecurityBase;
    }

    /**
     * @return social_security_self_amount
     */
    public Double getSocialSecuritySelfAmount() {
        return socialSecuritySelfAmount;
    }

    /**
     * @param socialSecuritySelfAmount
     */
    public void setSocialSecuritySelfAmount(Double socialSecuritySelfAmount) {
        this.socialSecuritySelfAmount = socialSecuritySelfAmount;
    }

    /**
     * @return social_security_employer_amount
     */
    public Double getSocialSecurityEmployerAmount() {
        return socialSecurityEmployerAmount;
    }

    /**
     * @param socialSecurityEmployerAmount
     */
    public void setSocialSecurityEmployerAmount(Double socialSecurityEmployerAmount) {
        this.socialSecurityEmployerAmount = socialSecurityEmployerAmount;
    }

    /**
     * @return social_security_address
     */
    public String getSocialSecurityAddress() {
        return socialSecurityAddress;
    }

    /**
     * @param socialSecurityAddress
     */
    public void setSocialSecurityAddress(String socialSecurityAddress) {
        this.socialSecurityAddress = socialSecurityAddress == null ? null : socialSecurityAddress.trim();
    }

    /**
     * @return housing_fund_status
     */
    public Integer getHousingFundStatus() {
        return housingFundStatus;
    }

    /**
     * @param housingFundStatus
     */
    public void setHousingFundStatus(Integer housingFundStatus) {
        this.housingFundStatus = housingFundStatus;
    }

    /**
     * @return housing_fund_base
     */
    public Double getHousingFundBase() {
        return housingFundBase;
    }

    /**
     * @param housingFundBase
     */
    public void setHousingFundBase(Double housingFundBase) {
        this.housingFundBase = housingFundBase;
    }

    /**
     * @return housing_fund_self_amount
     */
    public Double getHousingFundSelfAmount() {
        return housingFundSelfAmount;
    }

    /**
     * @param housingFundSelfAmount
     */
    public void setHousingFundSelfAmount(Double housingFundSelfAmount) {
        this.housingFundSelfAmount = housingFundSelfAmount;
    }

    /**
     * @return housing_fund_employer_amount
     */
    public Double getHousingFundEmployerAmount() {
        return housingFundEmployerAmount;
    }

    /**
     * @param housingFundEmployerAmount
     */
    public void setHousingFundEmployerAmount(Double housingFundEmployerAmount) {
        this.housingFundEmployerAmount = housingFundEmployerAmount;
    }

    /**
     * @return housing_fund_address
     */
    public String getHousingFundAddress() {
        return housingFundAddress;
    }

    /**
     * @param housingFundAddress
     */
    public void setHousingFundAddress(String housingFundAddress) {
        this.housingFundAddress = housingFundAddress == null ? null : housingFundAddress.trim();
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
     * 获取创建人
     *
     * @return created_by - 创建人
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取更新人
     *
     * @return updated_by - 更新人
     */
    public Long getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", positionId=").append(positionId);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", age=").append(age);
        sb.append(", mobile=").append(mobile);
        sb.append(", ethnic=").append(ethnic);
        sb.append(", maritalStatus=").append(maritalStatus);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", highestEducationInstitute=").append(highestEducationInstitute);
        sb.append(", major=").append(major);
        sb.append(", graduationDate=").append(graduationDate);
        sb.append(", educationDegree=").append(educationDegree);
        sb.append(", educationDegreeType=").append(educationDegreeType);
        sb.append(", registeredResidence=").append(registeredResidence);
        sb.append(", registeredResidenceType=").append(registeredResidenceType);
        sb.append(", emergencyContactName=").append(emergencyContactName);
        sb.append(", emergencyContactRelationship=").append(emergencyContactRelationship);
        sb.append(", emergencyContactNumber=").append(emergencyContactNumber);
        sb.append(", address=").append(address);
        sb.append(", employmentStatus=").append(employmentStatus);
        sb.append(", employmentType=").append(employmentType);
        sb.append(", hiringDate=").append(hiringDate);
        sb.append(", trialEndDate=").append(trialEndDate);
        sb.append(", employmentLevel=").append(employmentLevel);
        sb.append(", supervisor=").append(supervisor);
        sb.append(", subject=").append(subject);
        sb.append(", starLevel=").append(starLevel);
        sb.append(", workingYears=").append(workingYears);
        sb.append(", latestWorkingExperience=").append(latestWorkingExperience);
        sb.append(", latestCompanyPosition=").append(latestCompanyPosition);
        sb.append(", latestEducationStartDate=").append(latestEducationStartDate);
        sb.append(", latestEducationEndDate=").append(latestEducationEndDate);
        sb.append(", recruitmentSources=").append(recruitmentSources);
        sb.append(", referenceName=").append(referenceName);
        sb.append(", paymentStartDate=").append(paymentStartDate);
        sb.append(", contractStartDate=").append(contractStartDate);
        sb.append(", contractEndDate=").append(contractEndDate);
        sb.append(", contractType=").append(contractType);
        sb.append(", employer=").append(employer);
        sb.append(", trialSalary=").append(trialSalary);
        sb.append(", salary=").append(salary);
        sb.append(", performanceBase=").append(performanceBase);
        sb.append(", royalty=").append(royalty);
        sb.append(", socialSecurityStatus=").append(socialSecurityStatus);
        sb.append(", socialSecurityBase=").append(socialSecurityBase);
        sb.append(", socialSecuritySelfAmount=").append(socialSecuritySelfAmount);
        sb.append(", socialSecurityEmployerAmount=").append(socialSecurityEmployerAmount);
        sb.append(", socialSecurityAddress=").append(socialSecurityAddress);
        sb.append(", housingFundStatus=").append(housingFundStatus);
        sb.append(", housingFundBase=").append(housingFundBase);
        sb.append(", housingFundSelfAmount=").append(housingFundSelfAmount);
        sb.append(", housingFundEmployerAmount=").append(housingFundEmployerAmount);
        sb.append(", housingFundAddress=").append(housingFundAddress);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}