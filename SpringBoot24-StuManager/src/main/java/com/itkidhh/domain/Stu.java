package com.itkidhh.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName
 * @Description: TODO
 * @Author: kidhzh@outlook.com
 */
@Data
@AllArgsConstructor
public class Stu {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private Float score;
    private String tel;
    private String classid;
}
