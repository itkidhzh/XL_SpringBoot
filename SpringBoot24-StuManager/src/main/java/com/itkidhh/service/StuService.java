package com.itkidhh.service;

import com.itkidhh.domain.Stu;

import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */

public interface StuService {
    List<Stu> sellAll();
    void insert(Stu stu);
    void deleteById(int id);
    void update(Stu stu);
    Stu findById(int id);
}
