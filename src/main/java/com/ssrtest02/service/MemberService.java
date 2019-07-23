package com.ssrtest02.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberService {

    //添加用户的时候，会去发送邮件
    @Async//相当于这个方法重新开辟了一个单独线程进行执行
    public String addMemberAndEmail(){
        log.info("2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        log.info("3");
        return "rongshanshan";
    }
}
