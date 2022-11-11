package com.zy.spring.aop;

import com.zy.spring.aop.service.UserService;
import com.zy.spring.aop.service.UserServiceImpl;
import com.zy.spring.aop.service.UserServiceProxy;
import com.zy.spring.aop.service.UserServiceProxy1;

public class Application {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        userService.createUser();
//代理
//        UserService userService =  new UserServiceProxy(new UserServiceImpl());
//        userService.createUser();
//二代理
        UserService userService = new UserServiceProxy1(new UserServiceProxy(new UserServiceImpl()));
        userService.createUser();
    }
}
