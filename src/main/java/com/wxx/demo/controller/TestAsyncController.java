package com.wxx.demo.controller;

import com.wxx.demo.entity.common.RestReturnJson;
import com.wxx.demo.job.AsyncFirstTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Future;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
@Controller
@RequestMapping("/async")
public class TestAsyncController {

    @Autowired
    private AsyncFirstTask asyncFirstTask;

    @ResponseBody
    @RequestMapping("/doAsyncTask")
    public Object doAsyncTask()throws Exception{
        long start = System.currentTimeMillis();
        Future<Boolean> f1 = asyncFirstTask.doTask11();
        Future<Boolean> f2 = asyncFirstTask.doTask22();
        Future<Boolean> f3 = asyncFirstTask.doTask33();

        while (!f1.isDone() || !f2.isDone() || !f3.isDone()) {

        }

        String msg = "共花费时间:" + (System.currentTimeMillis() - start);
        System.out.println(msg);
        return RestReturnJson.success(msg);
    }


}
