package com.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spEl")
public class Student {
    @Value("#{11+22}")
    private int x;

    @Value("#{11<22}")
    private boolean bool;

    @Value("#{new String('Ayush')}")
    private String str;

    @Value("#{ T(java.lang.Math).max(11,22) }")
    private int calc;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    

    @Override
    public String toString() {
        return "Student [x=" + x + ", bool=" + bool + ", str=" + str + ", calc=" + calc + "]";
    }

    public int getCalc() {
        return calc;
    }

    public void setCalc(int calc) {
        this.calc = calc;
    }
}
