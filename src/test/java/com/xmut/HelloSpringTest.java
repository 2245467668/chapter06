package com.xmut;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class HelloSpringTest {

    public static void main(String[] args) {
        //获取spring配置
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
        //从spring容器获取对象
        HelloSpring helloSpring=(HelloSpring) ac.getBean("helloSpring");
        //调佣对象方法
        helloSpring.show();

    }
}