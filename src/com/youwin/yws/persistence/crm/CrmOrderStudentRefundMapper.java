package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudentRefund;
import com.youwin.yws.models.crm.CrmOrderStudentRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentRefundMapper {
    int countByExample(CrmOrderStudentRefundExample example);

    int deleteByExample(CrmOrderStudentRefundExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudentRefund record);

    int insertSelective(CrmOrderStudentRefund record);

    List<CrmOrderStudentRefund> selectByExample(CrmOrderStudentRefundExample example);

    CrmOrderStudentRefund selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudentRefund record, @Param("example") CrmOrderStudentRefundExample example);

    int updateByExample(@Param("record") CrmOrderStudentRefund record, @Param("example") CrmOrderStudentRefundExample example);

    int updateByPrimaryKeySelective(CrmOrderStudentRefund record);

    int updateByPrimaryKey(CrmOrderStudentRefund record);
}