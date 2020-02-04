package com.wxx.demo.controller;

import com.wxx.demo.entity.common.RestReturnJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/index")
    public String index(){
        int n = 10 / 0;
        return "";
    }


    @RequestMapping("/ajaxIndex")
    public String ajaxIndex(){
        return "html/index";
    }

    @ResponseBody
    @RequestMapping("/ajaxPost")
    public RestReturnJson ajaxPost() {
        int n = 10 / 0;
        return RestReturnJson.success("this is success");
    }

}
