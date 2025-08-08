package wd;


abstract class Vehicle {
    abstract void startEngine();
}


class PetrolCar extends Vehicle {
    void startEngine() {
        System.out.println("Petrol Car engine started with key ignition.");
    }
}


class SportsBike extends Vehicle {
    void startEngine() {
        System.out.println("Sports Bike engine started with self-start button.");
    }
}


public class Abs_Engine {
    public static void main(String[] args) {
        Vehicle car = new PetrolCar();
        car.startEngine();

        Vehicle bike = new SportsBike();
        bike.startEngine();
    }
}
