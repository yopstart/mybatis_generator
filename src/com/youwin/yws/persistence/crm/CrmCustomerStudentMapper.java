package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmCustomerStudent;
import com.youwin.yws.models.crm.CrmCustomerStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCustomerStudentMapper {
    int countByExample(CrmCustomerStudentExample example);

    int deleteByExample(CrmCustomerStudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmCustomerStudent record);

    int insertSelective(CrmCustomerStudent record);

    List<CrmCustomerStudent> selectByExample(CrmCustomerStudentExample example);

    CrmCustomerStudent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmCustomerStudent record, @Param("example") CrmCustomerStudentExample example);

    int updateByExample(@Param("record") CrmCustomerStudent record, @Param("example") CrmCustomerStudentExample example);

    int updateByPrimaryKeySelective(CrmCustomerStudent record);

    int updateByPrimaryKey(CrmCustomerStudent record);
}