package com.wxx.demo.controller;

import com.wxx.demo.entity.User;
import com.wxx.demo.entity.common.RestReturnJson;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author wangxinxin07
 * @date 2020/1/29
 */
@RestController
@RequestMapping("/userRest")
public class UserRestController {

    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setName("zhangsan");
        u.setAge(11);
        u.setBirthday(new Date());
        return u;
    }

    @RequestMapping("/getReturnUser")
    public Object getReturnUser() {
        User u = new User();
        u.setName("zhangsan");
        u.setAge(11);
        u.setBirthday(new Date());
        u.setDesc("i am desc");
        return RestReturnJson.success(u);
    }
}
