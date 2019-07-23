package com.ssrtest02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
  //  private static final Logger logger =  LoggerFactory.getLogger(JspController.class);

    @RequestMapping("/getUser")
    public String getUser(int i){
        //这是在没有全局异常处理时，我们对异常的处理
//        int j=0;
//        try {
//            j = 1 / i;
//        }catch (Exception e){
//            return "系统异常";
//        }

        //这是我们开始使用全局异常处理后的代码，在本方法类里就不需要在进行异常的处理了
        int j = 1 / i;
        return "success  "+j;
    }

    @RequestMapping("/getMember")
    public String getMember(String name, Integer age){

    //    logger.info("name"+name+",age："+age);
        return "success getMember";
    }
}
