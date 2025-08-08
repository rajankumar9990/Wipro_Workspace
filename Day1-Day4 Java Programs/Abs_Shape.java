package wd;

import java.util.Scanner;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        System.out.println("Area of Circle : " + (3.14 * radius * radius));
    }
}

public class Abs_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        Shape s1 = new Circle(radius); 
        s1.area();
        
        sc.close();
    }
}
