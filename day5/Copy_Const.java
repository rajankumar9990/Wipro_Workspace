package com.day5;

class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(Student s) {
        name = s.name;
        age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Copy_Const {
    public static void main(String[] args) {
        
        Student s1 = new Student("Rajan", 22);
        s1.display();

   
        Student s2 = new Student(s1);
        s2.display();
    }
}
