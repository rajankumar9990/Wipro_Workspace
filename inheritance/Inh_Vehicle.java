package inheritance;

class Vehicle {
    String brand;
    int speed;

    void setDetails(String b, int s) {
        brand = b;
        speed = s;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }

    void move() {
        System.out.println("The vehicle is moving.");
    }
}


class Car extends Vehicle {
 
    void move() {
        System.out.println("The car is cruising comfortably on the highway.");//override move
    }
}


class Bike extends Vehicle {
   
    void move() {
        System.out.println("The bike is speeding through city traffic.");//override move
    }
}


class Truck extends Vehicle {
  
    void move() {
        System.out.println("The truck is transporting goods to another city.");//override move
    }
}


public class Inh_Vehicle {
    public static void main(String[] args) {
        Car c = new Car();
        c.setDetails("Porsche", 180);

        Bike b = new Bike();
        b.setDetails("Triumph", 200);

        Truck t = new Truck();
        t.setDetails("Bajaj", 65);

        c.showDetails();
        c.move();

        System.out.println();

        b.showDetails();
        b.move();

        System.out.println();

        t.showDetails();
        t.move();
    }
}
