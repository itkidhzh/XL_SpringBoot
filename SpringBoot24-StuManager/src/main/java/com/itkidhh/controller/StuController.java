package com.itkidhh.controller;

import com.itkidhh.domain.Stu;
import com.itkidhh.service.StuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
@Controller
public class StuController {

    @Resource
    private StuService service;

    @RequestMapping("/*")
    public String stuManager(){


        return "StuManger.html";
    }

    @RequestMapping("/index")
    public String selAll(Model model){
        List<Stu> stuList = service.sellAll();

        model.addAttribute("stuList",stuList);

        return "index.html";
    }
    @RequestMapping("/add")
    public String add(){
        System.out.println("controller add is running ...");

        return "add.html";
    }

    @RequestMapping("/insert")
    public String insert(Stu stu){
        service.insert(stu);

        return "redirect:/index";
    }


    @RequestMapping("/delete")
    public String del(int id){
        service.deleteById(id);

        return "redirect:/index";
    }

    @RequestMapping(value = "/edit")
    public String edit(Model model,int id){
        Stu stu = service.findById(id);

        System.out.println(stu);

        model.addAttribute("stu",stu);

        return "edit.html";
    }
    @RequestMapping(value = "/update")
    public String update(Stu stu){
        service.update(stu);
        System.out.println(stu);

        return "redirect:/index";
    }
}
