package com.ssrtest02.controller;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JspController {
   // private static final Logger logger =  LoggerFactory.getLogger(JspController.class);

    @RequestMapping("/jspIndex")
    public String jspIndex(){
     //   logger.info("springboot 整合log4j 成功！！荣杉山真帅");
        return "jspIndex";
    }
}
