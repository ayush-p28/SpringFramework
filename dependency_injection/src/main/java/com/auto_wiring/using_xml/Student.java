package com.auto_wiring.using_xml;

public class Student {
    private Address address;

    public Student() {
    }
    
    public Student(Address address) {
        System.out.println("from constrctor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + "]";
    }

}
