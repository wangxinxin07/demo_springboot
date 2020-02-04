package com.wxx.demo.controller;

import com.wxx.demo.entity.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangxinxin07
 * @date 2020/1/30
 */
@RequestMapping("/template/freemarker")
@Controller
public class FreemakerController {
    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("resource", resource);
        return "freemarker/index";
    }

    @RequestMapping("/center")
    public String center() {
        return "freemarker/center/center";
    }


}
