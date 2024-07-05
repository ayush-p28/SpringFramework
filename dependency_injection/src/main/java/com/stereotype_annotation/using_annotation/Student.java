package com.stereotype_annotation.using_annotation;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component
public class Student {

    @Value("Ayush")
    private String name;
    
    @Value("#{getAddress}")
    private Address address;

    @Value("#{getlist}")
    private ArrayList<Integer> arr;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ArrayList<Integer> getArr() {
        return arr;
    }

    public void setArr(ArrayList<Integer> arr) {
        this.arr = arr;
    }

    
    @Override
    public String toString() {
        return "Student [name=" + name + ", address=" + address + ", arr=" + arr + "]";
    }

}
