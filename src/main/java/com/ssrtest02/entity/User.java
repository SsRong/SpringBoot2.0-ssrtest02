package com.ssrtest02.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "username:"+name+"  age:"+age;
    }

    public static void main(String[] args) {
        User user = new User();
        user.name="rongshanshan";
        user.age=22;
        log.info(user.toString());
    }
}
