package com.auto_wiring.using_xml;

public class Address {
    private String name;

    public Address() {
        System.out.println("from constrctor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address [name=" + name + "]";
    }
    
}
