package com.company;

public abstract class Car {

    String model;
    String color;
    int speed;


    void gas(){
        System.out.println("gas: " );
    }

    void brake(){
        System.out.println("brake: " );
    }

    abstract void description();

}
