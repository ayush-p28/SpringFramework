package com.stereotype_annotation.using_annotation;

import org.springframework.beans.factory.annotation.Value;

public class Address {
    @Value("jabalpur")
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address [city=" + city + "]";
    }

    
}
