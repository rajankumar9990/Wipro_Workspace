package com.day8;

import java.util.ArrayList;
import java.util.Scanner;

public class Marks_System2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

      
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            int mark = sc.nextInt();
            marks.add(mark);  
        }

        int total = 0;

 
        for (int i = 0; i < marks.size(); i++) {
            int mark = marks.get(i); 
            total += mark;
        }

        double average = (double) total / marks.size();

   
        System.out.println("\nMarks: " + marks);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}
