package com.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext appCon = new AnnotationConfigApplicationContext("com.spEL");
        System.out.println(appCon.getBean("student"));
    }
}
