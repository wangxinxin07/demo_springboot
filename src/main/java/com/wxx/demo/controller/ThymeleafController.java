package com.wxx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
@RequestMapping("/th")
@Controller
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(ModelMap map){
        map.addAttribute("name", "zhangsan");
        return "thymeleaf/index";
    }

    @RequestMapping("/center")
    public String center(){
        return "thymeleaf/center/center";
    }

}
