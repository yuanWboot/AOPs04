package com.zy.spring.aop.service;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UserServiceProxy1 implements UserService {
    //持有委托类的对象
    private UserService userService;
    public UserServiceProxy1(UserService userService){
        this.userService = userService;
    }

    public void  createUser() {
        userService.createUser();
        System.out.println("===========后置功能拓展==========");
    }


}
