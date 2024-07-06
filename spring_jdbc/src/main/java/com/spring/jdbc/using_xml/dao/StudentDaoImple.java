package com.spring.jdbc.using_xml.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.using_xml.models.Student;

public class StudentDaoImple implements StudentDao{
    private JdbcTemplate jdbcTemplate; 

    public int insert(Student std) {
        String query = "insert into students(student_id,name) values(?,?)";
        int res = jdbcTemplate.update(query,std.getStudentId(),std.getName());
        return res;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    
    
}
