package com.stereotype_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stereotype_annotation.using_annotation.Student;

// import com.stereotype_annotation.using_xml.Student;

public class App {
    public static void main(String[] args) {
        //using xml
        // ApplicationContext appCon = new ClassPathXmlApplicationContext("com/stereotype_annotation/using_xml/config.xml");
        // Student std = appCon.getBean("student",Student.class);
        // System.out.println(std);

        //using annotation
        ApplicationContext appCon = new AnnotationConfigApplicationContext("com.stereotype_annotation.using_annotation");
        // Student std = appCon.getBean("student",Student.class);
        // Student std = appCon.getBean("getStudent",Student.class);
        Student std = appCon.getBean("ststs",Student.class);
        System.out.println(std);
    }
}
