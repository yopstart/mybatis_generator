package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmOrderStudentPayment;
import com.youwin.yws.models.crm.CrmOrderStudentPaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmOrderStudentPaymentMapper {
    int countByExample(CrmOrderStudentPaymentExample example);

    int deleteByExample(CrmOrderStudentPaymentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmOrderStudentPayment record);

    int insertSelective(CrmOrderStudentPayment record);

    List<CrmOrderStudentPayment> selectByExample(CrmOrderStudentPaymentExample example);

    CrmOrderStudentPayment selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmOrderStudentPayment record, @Param("example") CrmOrderStudentPaymentExample example);

    int updateByExample(@Param("record") CrmOrderStudentPayment record, @Param("example") CrmOrderStudentPaymentExample example);

    int updateByPrimaryKeySelective(CrmOrderStudentPayment record);

    int updateByPrimaryKey(CrmOrderStudentPayment record);
}