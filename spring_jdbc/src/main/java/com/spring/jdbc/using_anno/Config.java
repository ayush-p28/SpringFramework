package com.spring.jdbc.using_anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.using_anno.Dao.StudentDaoImple;

@Configuration
public class Config {
    
    @Bean
    public DriverManagerDataSource getDS(){
        DriverManagerDataSource obj = new DriverManagerDataSource();
        obj.setDriverClassName("com.mysql.cj.jdbc.Driver");
        obj.setUrl("jdbc:mysql://localhost:3306/springdb");
        obj.setUsername("root");
        obj.setPassword("1234");

        return obj;
    }

    @Bean(name="template")
    public JdbcTemplate getTemplate(){
        JdbcTemplate tempp = new JdbcTemplate();
        tempp.setDataSource(getDS());
        return tempp;
    }

    @Bean
    public StudentDaoImple getSDT(){
        return new StudentDaoImple();
    }
}
