package com.dependancy_injection.reference_di;

public class Student {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student(Address address) {
        this.address = address;
    }
    

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [address=" + address + "]";
    }

}
