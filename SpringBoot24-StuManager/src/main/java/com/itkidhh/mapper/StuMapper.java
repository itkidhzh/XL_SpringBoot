package com.itkidhh.mapper;

import com.itkidhh.domain.Stu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
@Mapper
public interface StuMapper {

    @Select("select * from stu")
    List<Stu> sellAll();

    @Insert("insert into stu(name, sex, age, score, tel, classid) " +
            "values (#{name}, #{sex}, #{age}, #{score}, #{tel}, #{classid})")
    void insert(Stu stu);

    @Delete("delete from stu where id=#{id}")
    void deleteById(int id);

    @Select("select * from stu where id=#{id}")
    Stu findById(int id);

    @Update("update stu set " +
            "name=#{name}, sex=#{sex}, age=#{age}, " +
            "score=#{score}, tel=#{tel}, classid=#{classid} " +
            "where id=#{id}")
    void update(Stu stu);
}
