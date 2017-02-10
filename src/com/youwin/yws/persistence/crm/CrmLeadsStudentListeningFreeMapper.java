package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmLeadsStudentListeningFree;
import com.youwin.yws.models.crm.CrmLeadsStudentListeningFreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmLeadsStudentListeningFreeMapper {
    int countByExample(CrmLeadsStudentListeningFreeExample example);

    int deleteByExample(CrmLeadsStudentListeningFreeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmLeadsStudentListeningFree record);

    int insertSelective(CrmLeadsStudentListeningFree record);

    List<CrmLeadsStudentListeningFree> selectByExample(CrmLeadsStudentListeningFreeExample example);

    CrmLeadsStudentListeningFree selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmLeadsStudentListeningFree record, @Param("example") CrmLeadsStudentListeningFreeExample example);

    int updateByExample(@Param("record") CrmLeadsStudentListeningFree record, @Param("example") CrmLeadsStudentListeningFreeExample example);

    int updateByPrimaryKeySelective(CrmLeadsStudentListeningFree record);

    int updateByPrimaryKey(CrmLeadsStudentListeningFree record);
}