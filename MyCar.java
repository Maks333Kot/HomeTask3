package com.company;

public class MyCar extends Car {

    @Override
    void description() {
        System.out.println(model + " "  + color + " " + speed);
    }

    public static void main(String[] args) {
        MyCar mazda = new MyCar();
        mazda.gas();
        mazda.brake();
        mazda.description();

    }


}
