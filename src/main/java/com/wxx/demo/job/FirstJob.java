package com.wxx.demo.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
@Component
public class FirstJob {

    public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //每隔3秒执行任务
//    @Scheduled(fixedRate = 3000)
    //cron表达式
    @Scheduled(cron = "0/3 * * * * ?")
    public void run(){
        System.out.println("当前时间3：" + SIMPLE_DATE_FORMAT.format(new Date()));
    }

//    @Scheduled(fixedRate = 5000)
    public void run5() {
        System.out.println("当前时间5：" + SIMPLE_DATE_FORMAT.format(new Date()));
    }
}
