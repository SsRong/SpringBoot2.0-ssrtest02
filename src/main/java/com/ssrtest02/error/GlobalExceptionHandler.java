package com.ssrtest02.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局捕获异常 使用AOP技术，采用异常通知方法
 * 1、捕获返回json格式
 * 2、捕获返回页面
 */
@ControllerAdvice(basePackages = "com.ssrtest02.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(){
        //注意：在实际的公司开发过程中，要把错误记录在日志中
        Map<String,Object> errorResultMap=new HashMap<String,Object>();
        errorResultMap.put("errorCode","1314520");
        errorResultMap.put("errorMsg","系统喜欢你到死机");
        return errorResultMap;
    }
}
