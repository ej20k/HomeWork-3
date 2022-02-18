package com.company;

public class Car {
    static String color; //цвет автомобиля
    final String model; //модель автомобиля
    final int yearOfIssue; //год выпуска
    int wheels; //радиус колёсных дисков
    final double engineVolume; //объём двигателя
    String engineModel; //модель двигателя
    String transmission; //тип трансмиссии


    public Car(String color, String model, int yearOfIssue, int wheels, double engineVolume, String engineModel, String transmission) {
        this.color = color;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.wheels = wheels;
        this.engineVolume = engineVolume;
        this.engineModel = engineModel;
        this.transmission = transmission;
    } // это у нас конструктор для создания обьекта машины


    @Override
    public String toString() {

        return "Цвет автомобиля: " + color + " Модель автомобиля: " + model + " Год выпуска: " + yearOfIssue + " Радиус колёсных дисков: " + wheels + " Объём двигателя: " + engineVolume + " Модель двигателя: " + engineModel + " Тип трансмисси: " + transmission;
    }// специальный метод для вывода на печать нашего обькта машины



}
