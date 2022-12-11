package com.driver;

public class Main {

    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
          String name="AKSHAY";
        obj.setName(name);
        System.out.print(obj.getName());


    }
}