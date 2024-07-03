package com.bean_lifecycle_methods.using_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }

    @PostConstruct
    public void chalu(){
        System.out.println("System chalu");
    }

    @PreDestroy
    public void band(){
        System.out.println("system band");
    }

}
