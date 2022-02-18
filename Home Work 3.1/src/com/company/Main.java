package com.company;

public class Main {

    public static void main(String[] args) {
        Car mark2 = new Car("Белый","Toyota Mark2", 1996,17, 3.0, "2jzgte", "Automatic gettrag");
        System.out.println(mark2); // выведем на печать нашу машину

        Factory avtovaz = new Factory(); // создали обьект завода
        CarShowroom carShowroom = new CarShowroom();// создали обьект салона

        avtovaz.changeColor(mark2, avtovaz.color[2]); // отдаем заводу конкретную машину на перекраску и вызываем метод завода
        avtovaz.changeWheels(mark2,avtovaz.wheels[4]);// отдаем заводу конкретную машину на изменение размера колес и вызываем метод завода

        System.out.println(mark2); // посмотрим какая у нас машина получилась


    }
}

