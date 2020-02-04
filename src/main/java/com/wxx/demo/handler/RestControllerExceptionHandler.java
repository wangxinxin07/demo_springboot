package com.wxx.demo.handler;

import com.wxx.demo.entity.common.RestReturnJson;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
//@RestControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public RestReturnJson handler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        System.out.println("handler start");
        e.printStackTrace();
        return RestReturnJson.error("错误信息：" + e.getMessage());
    }
}
