package com.itkidhh.service.impl;

import com.itkidhh.mapper.StuMapper;
import com.itkidhh.model.Stu;
import com.itkidhh.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

    @Resource
    private StuMapper stuMapper;

    @Override
    public Stu selectById(int id) {
        return stuMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Stu> selectAll() {
        return stuMapper.selectAll();
    }
}
