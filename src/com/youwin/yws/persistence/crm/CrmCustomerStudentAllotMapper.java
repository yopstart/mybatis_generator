package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmCustomerStudentAllot;
import com.youwin.yws.models.crm.CrmCustomerStudentAllotExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCustomerStudentAllotMapper {
    int countByExample(CrmCustomerStudentAllotExample example);

    int deleteByExample(CrmCustomerStudentAllotExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmCustomerStudentAllot record);

    int insertSelective(CrmCustomerStudentAllot record);

    List<CrmCustomerStudentAllot> selectByExample(CrmCustomerStudentAllotExample example);

    CrmCustomerStudentAllot selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmCustomerStudentAllot record, @Param("example") CrmCustomerStudentAllotExample example);

    int updateByExample(@Param("record") CrmCustomerStudentAllot record, @Param("example") CrmCustomerStudentAllotExample example);

    int updateByPrimaryKeySelective(CrmCustomerStudentAllot record);

    int updateByPrimaryKey(CrmCustomerStudentAllot record);
}