package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudentTransfer;
import com.youwin.yws.models.crm.CrmOrderStudentTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentTransferMapper {
    int countByExample(CrmOrderStudentTransferExample example);

    int deleteByExample(CrmOrderStudentTransferExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudentTransfer record);

    int insertSelective(CrmOrderStudentTransfer record);

    List<CrmOrderStudentTransfer> selectByExample(CrmOrderStudentTransferExample example);

    CrmOrderStudentTransfer selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudentTransfer record, @Param("example") CrmOrderStudentTransferExample example);

    int updateByExample(@Param("record") CrmOrderStudentTransfer record, @Param("example") CrmOrderStudentTransferExample example);

    int updateByPrimaryKeySelective(CrmOrderStudentTransfer record);

    int updateByPrimaryKey(CrmOrderStudentTransfer record);
}