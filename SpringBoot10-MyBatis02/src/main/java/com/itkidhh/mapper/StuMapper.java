package com.itkidhh.mapper;

import com.itkidhh.model.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Stu record);

    int insertSelective(Stu record);

    Stu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);

    @Select("select * from stu")
    List<Stu> selectAll();

}