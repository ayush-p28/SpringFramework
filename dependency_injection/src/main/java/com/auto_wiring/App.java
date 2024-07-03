package com.auto_wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.auto_wiring.using_autowired.Student;

// import com.auto_wiring.using_xml.Student;

public class App {
    public static void main(String[] args) {
        //using XML
        // ApplicationContext appCon = new ClassPathXmlApplicationContext("com/auto_wiring/using_xml/auto_config.xml");
        // Student std = appCon.getBean("std1",Student.class);
        // System.out.println(std);

        //using annotations
        ApplicationContext appCon = new ClassPathXmlApplicationContext("com/auto_wiring/using_autowired/auto_annoconfig.xml");
        Student std = appCon.getBean("std1",Student.class);
        System.out.println(std);
    }
}
