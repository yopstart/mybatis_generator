package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.DCity;
import com.youwin.yws.models.crm.DCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DCityMapper {
    int countByExample(DCityExample example);

    int deleteByExample(DCityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DCity record);

    int insertSelective(DCity record);

    List<DCity> selectByExample(DCityExample example);

    DCity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DCity record, @Param("example") DCityExample example);

    int updateByExample(@Param("record") DCity record, @Param("example") DCityExample example);

    int updateByPrimaryKeySelective(DCity record);

    int updateByPrimaryKey(DCity record);
}