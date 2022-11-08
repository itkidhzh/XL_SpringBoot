package com.itkidhh.service;

import com.itkidhh.model.Stu;

import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */

public interface Service {
    Stu selectById(int id);
    List<Stu> selectAll();
}
