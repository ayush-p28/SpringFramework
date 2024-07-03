package com.dependancy_injection.collections_di;

import java.util.List;
import java.util.Map;

public class Student {
    private List courses;
    private Map coursemap;

    public Map getCoursemap() {
        return coursemap;
    }

    public void setCoursemap(Map coursemap) {
        this.coursemap = coursemap;
    }

    public List getCourses() {
        return courses;
    }

    public void setCourses(List courses) {
        this.courses = courses;
    }

    public Student(List courses, Map coursemap) {
        this.courses = courses;
        this.coursemap = coursemap;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student [courses=" + courses + "] coursemap-"+coursemap;
    }
    
}
