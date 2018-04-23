package ru.vadimushka_d;

/**
 * Демо класс
 *
 * @author Вадим Дунькин
 * @version 1.1
 */
public class App {
    public static void main(String[] args) {

        Airplane plane = new Airplane(1000, 10000);
        System.out.println(plane.toString());
        plane.Message();

        System.out.println("");

        Boat boat = new Boat(250);
        System.out.println(boat.toString());
        boat.Message();

        System.out.println("");

        Car car = new Car(200, 4);
        System.out.println(car.toString());
        car.Message();

        System.out.println("");

        Taxi taxi = new Taxi(3);
        System.out.println(taxi.toString());
        taxi.Message();

        System.out.println("");

        Truck truck = new Truck(20000);
        System.out.println(truck.toString());
        truck.Message();
    }
}