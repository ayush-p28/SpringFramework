package com.dependancy_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependancy_injection.reference_di.Student;



// import com.dependancy_injection.collections_di.Student;

// import com.dependancy_injection.constructor_di.beans.Student;

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
        // ApplicationContext appCon = new ClassPathXmlApplicationContext("com/di_ways/constructor_di/constructordi.xml");
        // Student std = (Student) appCon.getBean("std1");
        // System.out.println(std);
        
        // for collections
        // ApplicationContext appCon = new ClassPathXmlApplicationContext("com/dependancy_injection/collections_di/collectionconfig.xml");
        // Student std = (Student) appCon.getBean("std1");
        // System.out.println(std);


        // reference di
        ApplicationContext appCon = new ClassPathXmlApplicationContext("com/dependancy_injection/reference_di/refconfig.xml");
        Student std = (Student) appCon.getBean("std1");
        System.out.println(std);

    }
}
