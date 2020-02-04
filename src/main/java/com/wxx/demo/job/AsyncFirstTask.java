package com.wxx.demo.job;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
@Component
public class AsyncFirstTask {

    @Async
    public Future<Boolean> doTask11() throws Exception {
        Thread.sleep(1000);
        System.out.println("dotask11执行完毕");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask22() throws Exception {
        Thread.sleep(700);
        System.out.println("dotask22执行完毕");
        return new AsyncResult<>(true);
    }

    @Async
    public Future<Boolean> doTask33() throws Exception {
        Thread.sleep(300);
        System.out.println("dotask33执行完毕");
        return new AsyncResult<>(true);
    }

}
