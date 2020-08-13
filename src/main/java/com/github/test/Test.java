package com.github.test;

import com.github.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applictionContext.xml");
        UserService userService= (UserService) ac.getBean("userServiceImpl");
        if (userService.addUser()){
            System.out.println("添加用户成功");
        }else {
            System.out.println("失败");
        }
    }
}
