package com.standalone_collections;

import java.util.*;

public class Student {
    private String name;
    private ArrayList<String> arr;
    private HashMap<Integer,String> has;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList getArr() {
        return arr;
    }
    public void setArr(ArrayList arr) {
        this.arr = arr;
    }
    public HashMap getHas() {
        return has;
    }
    public void setHas(HashMap has) {
        this.has = has;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", arr=" + arr + ", has=" + has + "]";
    }
    
}
