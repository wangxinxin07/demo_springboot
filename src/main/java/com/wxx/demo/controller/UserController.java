package com.wxx.demo.controller;

import com.wxx.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author wangxinxin07
 * @date 2020/1/29
 */
@RequestMapping("/user")
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser() {
        User u = new User();
        u.setName("zhangsan");
        u.setAge(11);
        u.setBirthday(new Date());
        return u;
    }

}
