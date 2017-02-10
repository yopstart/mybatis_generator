package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmLeadsStudentAllot;
import com.youwin.yws.models.crm.CrmLeadsStudentAllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmLeadsStudentAllotMapper {
    int countByExample(CrmLeadsStudentAllotExample example);

    int deleteByExample(CrmLeadsStudentAllotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmLeadsStudentAllot record);

    int insertSelective(CrmLeadsStudentAllot record);

    List<CrmLeadsStudentAllot> selectByExample(CrmLeadsStudentAllotExample example);

    CrmLeadsStudentAllot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmLeadsStudentAllot record, @Param("example") CrmLeadsStudentAllotExample example);

    int updateByExample(@Param("record") CrmLeadsStudentAllot record, @Param("example") CrmLeadsStudentAllotExample example);

    int updateByPrimaryKeySelective(CrmLeadsStudentAllot record);

    int updateByPrimaryKey(CrmLeadsStudentAllot record);
}