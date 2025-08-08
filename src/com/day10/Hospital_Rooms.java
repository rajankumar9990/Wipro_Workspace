package com.day10;

import java.util.TreeSet;

public class Hospital_Rooms {
    public static void main(String[] args) {
        TreeSet<String> rooms = new TreeSet<>();

        rooms.add("Room one");
        rooms.add("Room two");
        rooms.add("Room three");
        rooms.add("Room four");
        rooms.add("Room five");

        System.out.println("Available Rooms (Unsorted):");
        for (String room : rooms) {
            System.out.println("Rooms: " + room);
        }
        System.out.println("Available Rooms (Sorted in Ascending Order):");
        for (String room : rooms) {
            System.out.println("Rooms: " + room);
        }
        System.out.println("Available Rooms (Sorted in Descending Order):");
        for (String room : rooms.descendingSet()) {
            System.out.println("Rooms: " + room);
        }

        System.out.println("\nFirst Available Room: " + rooms.first());
        System.out.println("Last Available Room: " + rooms.last());
        System.out.println("\nFirst Available Room: " + rooms.descendingSet().first());
        System.out.println("Last Available Room: " + rooms.descendingSet().last());
    }
}
