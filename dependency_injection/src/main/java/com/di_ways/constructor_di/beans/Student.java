package com.di_ways.constructor_di.beans;

public class Student {
    private int age;
    private String name;

    // public Student(int age, String name) {
    //     this.age = age;
    //     this.name = name;
    // }

    // Ambiguity example
    public Student(double age,double name){
        this.age = (int)age;
        this.name = name+"";
        System.out.println("double double runned");
    }
    public Student(int age,int name){
        this.age = age;
        this.name = name+"";
        System.out.println("int int runned");
    }
    public Student(String age,String name){
        this.age = Integer.parseInt(age);
        this.name = name;
        System.out.println("String string runned");
    }
    // --

    public String toString(){
        return name+" "+age;
    }
}
