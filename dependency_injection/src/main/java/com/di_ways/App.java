package com.di_ways;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di_ways.constructor_di.beans.Student;

// import com.di_ways.setter_di.beans.Student;
// import com.di_ways.setter_di.beans.User;

/**
 * Hello world!
 **/

public class App 
{
    public static void main( String[] args )
    {

        // Using getter/setter 
        // ApplicationContext appCon = new ClassPathXmlApplicationContext("com/di_ways/setter_di/setterdi.xml");
        // Student std = (Student) appCon.getBean("std1");
        // System.out.println(std.getName()+""+std.getAge());
        
        
        // Using constructor
        ApplicationContext appCon = new ClassPathXmlApplicationContext("com/di_ways/constructor_di/constructordi.xml");
        Student std = (Student) appCon.getBean("std1");
        System.out.println(std);

    }
}
