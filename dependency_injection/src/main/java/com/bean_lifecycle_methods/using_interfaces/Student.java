package com.bean_lifecycle_methods.using_interfaces;

import javax.security.auth.DestroyFailedException;
import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private String name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("chalu");
        
    }

    @Override
    public void destroy() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("band");
    }
   

    
}
