package com.stereotype_annotation.using_annotation;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.stereotype_annotation.using_annotation")
public class config {
    
    @Bean(name = {"ass","ststs"})
    public Student getStudent(){
        return new Student();
    }

    @Bean
    public Address getAddress(){
        return new Address();
    }

    @Bean
    public ArrayList<Integer> getlist(){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(15);
        arr.add(13);

        return arr;
    }
}
