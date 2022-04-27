package com.xmut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class User1Test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");

        User1 user1=(User1)ac.getBean("User1");
        System.out.println(user1);
    }

}