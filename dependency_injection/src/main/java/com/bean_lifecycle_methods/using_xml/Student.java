package com.bean_lifecycle_methods.using_xml;

public class Student {
    private int age;
    private String name;
    
    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    //case 1
    public void init(){
        System.out.println("system started");
    }
    public void destroy(){
        System.out.println("system destroyed");
    }
    //case2
    public void chalu(){
        System.out.println("system started");
    }
    public void band(){
        System.out.println("system destroyed");
    }
}
