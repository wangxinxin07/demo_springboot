package com.wxx.demo.handler;

import com.wxx.demo.entity.common.RestReturnJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wangxinxin07
 * @date 2020/2/4
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {


    @ExceptionHandler(value = Exception.class)
    public Object handle(HttpServletRequest request, HttpServletResponse response, Exception e) {
        e.printStackTrace();

        if (isaJax(request)) {
            System.out.println("这是ajax请求错误");

            return RestReturnJson.error("错误原因：" + e.getMessage());
        } else {
            System.out.println("这是页面访问错误");
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("exeption", e);
            modelAndView.addObject("url", request.getRequestURL());
            modelAndView.addObject("uri", request.getRequestURI());
            modelAndView.setViewName("error");

            return modelAndView;
        }
    }


    private boolean isaJax(HttpServletRequest request) {
        String requestedWith = request.getHeader("x-requested-with");
        if (requestedWith != null && requestedWith.equalsIgnoreCase("XMLHttpRequest")) {
            return true;
        } else {
            return false;
        }
    }

}
