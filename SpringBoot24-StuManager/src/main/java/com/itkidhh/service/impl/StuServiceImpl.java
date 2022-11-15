package com.itkidhh.service.impl;

import com.itkidhh.domain.Stu;
import com.itkidhh.mapper.StuMapper;
import com.itkidhh.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
@Service
public class StuServiceImpl implements StuService {

    @Resource
    private StuMapper stuMapper;

    @Override
    public List<Stu> sellAll() {
        List<Stu> stuList = stuMapper.sellAll();

        return stuList;
    }

    @Override
    public void insert(Stu stu) {

        stuMapper.insert(stu);
    }

    @Override
    public void deleteById(int id) {

        stuMapper.deleteById(id);
    }

    @Override
    public Stu findById(int id) {

        return stuMapper.findById(id);
    }

    @Override
    public void update(Stu stu) {

        stuMapper.update(stu);
    }
}
