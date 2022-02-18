package com.company;

public class CarShowroom implements Service {
    // Это у нас автосалон

    @Override
    public void changeColor(Car car, String color) {
        car.color = color;
    }

    @Override
    public void changeWheels(Car car, int wheels) {
        car.wheels = wheels;
    }
}
