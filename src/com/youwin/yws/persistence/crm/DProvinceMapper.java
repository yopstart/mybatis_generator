package com.youwin.yws.persistence.crm;

import com.youwin.yws.models.crm.DProvince;
import com.youwin.yws.models.crm.DProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DProvinceMapper {
    int countByExample(DProvinceExample example);

    int deleteByExample(DProvinceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DProvince record);

    int insertSelective(DProvince record);

    List<DProvince> selectByExample(DProvinceExample example);

    DProvince selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DProvince record, @Param("example") DProvinceExample example);

    int updateByExample(@Param("record") DProvince record, @Param("example") DProvinceExample example);

    int updateByPrimaryKeySelective(DProvince record);

    int updateByPrimaryKey(DProvince record);
}