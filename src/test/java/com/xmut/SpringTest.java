package com.xmut;

import com.xmut.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationcontext.xml");
        UserService userService=(UserService)applicationContext.getBean("userService");

        boolean flag= userService.login("张三","123");
        if(flag)
        {
            System.out.println("登录成功");
        }
        else{
            System.out.println("登录失败");
        }
    }
}
