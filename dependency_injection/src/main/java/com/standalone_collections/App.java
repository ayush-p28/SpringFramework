package com.standalone_collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCon = new ClassPathXmlApplicationContext("com/standalone_collections/stand_config.xml");
        Student std = appCon.getBean("std1",Student.class);
        System.out.println(std);
    }
}
