package com.company;

public abstract class Car {

    String model = "Model: rx-7";
    String color = "Color: Red";
    String speed = "MaxSpeed: 240 km/h";


    void gas(){
        System.out.println("gas: " + 100);
    }

    void brake(){
        System.out.println("brake: " + 20);
    }

    abstract void description();

}
