package com.company;

import java.util.Random;

public class Test{
    private String name;
    private double salary;
    private int id;
    {
        Random generator = new Random();
        id = 1 + generator.nextInt(1_000_000);
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary*byPercent/100;
        this.salary += raise;
    }
    public String getName(){
        return name;
    }
    public Test(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    public Test(double salary){
        this("",salary);
    }

}
