package com.dependancy_injection.reference_di;

public class Address {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(String city) {
        this.city = city;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address [city=" + city + "]";
    }

    
}
