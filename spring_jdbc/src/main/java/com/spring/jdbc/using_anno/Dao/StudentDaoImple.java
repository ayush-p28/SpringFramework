package com.spring.jdbc.using_anno.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.using_anno.models.Student;

public class StudentDaoImple implements StudentDao{
    
    @Autowired
    @Qualifier("template")
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student std) {
        String query = "insert into students(student_id,name) values(?,?)";
        int res = jdbcTemplate.update(query,std.getStudentId(),std.getName());
        return res;
    }

    
}
