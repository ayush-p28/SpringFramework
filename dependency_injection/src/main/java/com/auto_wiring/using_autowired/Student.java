package com.auto_wiring.using_autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    @Autowired
    @Qualifier("add2")
    private Address address;

    public Student() {
    }

    // @Autowired
    public Student(Address address) {
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
