package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.CrmCustomerGroupStudent;
import com.youwin.yws.models.crm.CrmCustomerGroupStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrmCustomerGroupStudentMapper {
    int countByExample(CrmCustomerGroupStudentExample example);

    int deleteByExample(CrmCustomerGroupStudentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CrmCustomerGroupStudent record);

    int insertSelective(CrmCustomerGroupStudent record);

    List<CrmCustomerGroupStudent> selectByExample(CrmCustomerGroupStudentExample example);

    CrmCustomerGroupStudent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CrmCustomerGroupStudent record, @Param("example") CrmCustomerGroupStudentExample example);

    int updateByExample(@Param("record") CrmCustomerGroupStudent record, @Param("example") CrmCustomerGroupStudentExample example);

    int updateByPrimaryKeySelective(CrmCustomerGroupStudent record);

    int updateByPrimaryKey(CrmCustomerGroupStudent record);
}