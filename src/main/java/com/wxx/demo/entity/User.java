package com.wxx.demo.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author wangxinxin07
 * @date 2020/1/29
 */
@Data
public class User {

    private String name;

    private Integer age;

    private Date birthday;

    private String desc;

}
