package com.bean_lifecycle_methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean_lifecycle_methods.using_xml.Student;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext appCon = new ClassPathXmlApplicationContext("com/bean_lifecycle_methods/using_xml/life_config.xml");
        appCon.registerShutdownHook();
        Student std = appCon.getBean("std1",Student.class);
        System.out.println(std);
    }
}
