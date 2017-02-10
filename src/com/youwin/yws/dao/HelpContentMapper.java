package com.youwin.yws.dao;

import com.youwin.yws.entity.HelpContent;
import com.youwin.yws.entity.HelpContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HelpContentMapper {
    /**
     *  根据指定的条件获取数据库记录数,help_content
     *
     * @param example
     */
    int countByExample(HelpContentExample example);

    /**
     *  根据指定的条件删除数据库符合条件的记录,help_content
     *
     * @param example
     */
    int deleteByExample(HelpContentExample example);

    /**
     *  根据主键删除数据库的记录,help_content
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,help_content
     *
     * @param record
     */
    int insert(HelpContent record);

    /**
     *  动态字段,写入数据库记录,help_content
     *
     * @param record
     */
    int insertSelective(HelpContent record);

    /**
     * ,help_content
     *
     * @param example
     */
    List<HelpContent> selectByExampleWithBLOBs(HelpContentExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,help_content
     *
     * @param example
     */
    List<HelpContent> selectByExample(HelpContentExample example);

    /**
     *  根据指定主键获取一条数据库记录,help_content
     *
     * @param id
     */
    HelpContent selectByPrimaryKey(Integer id);

    /**
     *  动态根据指定的条件来更新符合条件的数据库记录,help_content
     *
     * @param record
     * @param example
     */
    int updateByExampleSelective(@Param("record") HelpContent record, @Param("example") HelpContentExample example);

    /**
     * ,help_content
     *
     * @param record
     * @param example
     */
    int updateByExampleWithBLOBs(@Param("record") HelpContent record, @Param("example") HelpContentExample example);

    /**
     *  根据指定的条件来更新符合条件的数据库记录,help_content
     *
     * @param record
     * @param example
     */
    int updateByExample(@Param("record") HelpContent record, @Param("example") HelpContentExample example);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,help_content
     *
     * @param record
     */
    int updateByPrimaryKeySelective(HelpContent record);

    /**
     * ,help_content
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(HelpContent record);

    /**
     *  根据主键来更新符合条件的数据库记录,help_content
     *
     * @param record
     */
    int updateByPrimaryKey(HelpContent record);
}