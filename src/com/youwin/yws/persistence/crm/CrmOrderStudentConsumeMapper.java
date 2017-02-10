package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudentConsume;
import com.youwin.yws.models.crm.CrmOrderStudentConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentConsumeMapper {
    int countByExample(CrmOrderStudentConsumeExample example);

    int deleteByExample(CrmOrderStudentConsumeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudentConsume record);

    int insertSelective(CrmOrderStudentConsume record);

    List<CrmOrderStudentConsume> selectByExample(CrmOrderStudentConsumeExample example);

    CrmOrderStudentConsume selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudentConsume record, @Param("example") CrmOrderStudentConsumeExample example);

    int updateByExample(@Param("record") CrmOrderStudentConsume record, @Param("example") CrmOrderStudentConsumeExample example);

    int updateByPrimaryKeySelective(CrmOrderStudentConsume record);

    int updateByPrimaryKey(CrmOrderStudentConsume record);
}