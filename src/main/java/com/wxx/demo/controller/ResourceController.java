package com.wxx.demo.controller;

import com.wxx.demo.entity.Resource;
import com.wxx.demo.entity.common.RestReturnJson;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxinxin07
 * @date 2020/1/29
 */
@RequestMapping("/resource")
@RestController
public class ResourceController {

    @Autowired
    private Resource resource;

    @RequestMapping("/getResource")
    public Object getResource(){
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource, bean);
        return RestReturnJson.success(bean);
    }

}
