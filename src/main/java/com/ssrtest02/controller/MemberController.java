package com.ssrtest02.controller;

import com.ssrtest02.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 演示springboot 异步调用技术
 * 作者：荣杉山
 */
@RestController
@Slf4j
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Value("${name}") //此时便相当于给name赋好了值
    private String name;
    @Value("${age}") //此时便相当于给age赋好了值
    private String age;

    @Value("${http_url}") //此时便相当于给age赋好了值
    private String httpurl;

    @RequestMapping("/httpurl")
    public String httpurl(){
        return httpurl;
    }

    @RequestMapping("/addMemberAndEmail")
    public String addMemberAndEmail(){
        log.info("1");
        String result = memberService.addMemberAndEmail();
        log.info("4");
        return result;
    }

    @RequestMapping("/getName")
    public String getName(){
        return name;
    }

    @RequestMapping("/getAge")
    public String getAge(){
        return age;
    }
}
