package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.using_anno.Dao.StudentDaoImple;
import com.spring.jdbc.using_anno.models.Student;

// import com.spring.jdbc.using_xml.dao.StudentDaoImple;
// import com.spring.jdbc.using_xml.models.Student;

public class App{
    public static void main( String[] args ){
        // using xml
        // ApplicationContext appCon = new ClassPathXmlApplicationContext("com/spring/jdbc/using_xml/config.xml");
        // StudentDaoImple jt = appCon.getBean("std",StudentDaoImple.class);
        // int res = jt.insert(new Student(2,"Prateek"));
        // System.out.println(res);

        //using annotatin
        ApplicationContext appCon = new AnnotationConfigApplicationContext("com.spring.jdbc.using_anno");
        StudentDaoImple std =  appCon.getBean("getSDT",StudentDaoImple.class);
        int res = std.insert(new Student(3,"Prashant"));
        System.out.println(res);
    }
}