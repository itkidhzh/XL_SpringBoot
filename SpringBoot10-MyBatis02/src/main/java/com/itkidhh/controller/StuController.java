package com.itkidhh.controller;

import com.itkidhh.model.Stu;
import com.itkidhh.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */

@RestController
public class StuController {

    @Resource
    private ServiceImpl service;

    @RequestMapping("findById")
    public Stu testWithSelById(int id){
        return service.selectById(id);
    }

    @RequestMapping("findAll")
    public List<Stu> testWithSelAll(){
        return service.selectAll();
    }

}
