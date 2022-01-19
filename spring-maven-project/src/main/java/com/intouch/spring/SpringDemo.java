package com.intouch.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpringDemo {
    public static void main(String[] args) {
        //创建IoC容器
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");

        //xaingIoC容器索要对象
        Date now=context.getBean(Date.class);
        DateFormat dateFormat=context.getBean(SimpleDateFormat.class);
        System.out.println("现在的时间是:"+dateFormat.format(now));
    }
}
