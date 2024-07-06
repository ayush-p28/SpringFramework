package com.bean_lifecycle_methods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean_lifecycle_methods.using_interfaces.Student;

// import com.bean_lifecycle_methods.using_annotations.Student;

// import com.bean_lifecycle_methods.using_xml.Student;

public class App {
    public static void main(String[] args) {

        //using xml
        // AbstractApplicationContext appCon = new ClassPathXmlApplicationContext("com/bean_lifecycle_methods/using_xml/life_config.xml");
        // appCon.registerShutdownHook();
        // Student std = appCon.getBean("std1",Student.class);
        // System.out.println(std);
        
        //using annotations
        // AbstractApplicationContext appCon = new ClassPathXmlApplicationContext("com/bean_lifecycle_methods/using_annotations/anno_config.xml");
        // appCon.registerShutdownHook();
        // Student std = appCon.getBean("std1",Student.class);
        // System.out.println(std);

        //using interfaces
        AbstractApplicationContext appCon = new ClassPathXmlApplicationContext("com/bean_lifecycle_methods/using_interfaces/inter_config.xml");
        appCon.registerShutdownHook();
        Student std = appCon.getBean("std1",Student.class);
        System.out.println(std);
    }
}
