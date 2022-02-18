package com.company;


public class Factory implements Service {
    String[] color = new String[]{"Blue","Red","Black"};
    int[] wheels = new int[]{14,15,16,17,18};

    @Override
    public void changeColor(Car car, String color) {
        car.color = color;
    }

    @Override
    public void changeWheels(Car car, int wheels) {
        car.wheels = wheels;
    }



}
