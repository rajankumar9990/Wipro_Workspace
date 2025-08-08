package com.day8;

import java.util.HashMap;
import java.util.Scanner;

public class Scoreboard_Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> scoreboard = new HashMap<>();  //stores key value pairs(teram name with number of goals)

        
        System.out.print("Enter Team 1 Name: ");
        String team1 = sc.nextLine();
        System.out.print("Enter goals by " + team1 + ": ");
        int goals1 = sc.nextInt(); 

        // Autoboxing int to Integer
        scoreboard.put(team1, goals1);

        sc.nextLine(); 

        // Input Team 2
        System.out.print("Enter Team 2 Name: ");
        String team2 = sc.nextLine();
        System.out.print("Enter goals by " + team2 + ": ");
        int goals2 = sc.nextInt();

        // Autoboxing int to Integer
        scoreboard.put(team2, goals2);

       
        System.out.println("\nFootball Scoreboard :- ");

        // Unboxing Integer to int
        int score1 = scoreboard.get(team1);
        int score2 = scoreboard.get(team2);

        System.out.println(team1 + " : " + score1);
        System.out.println(team2 + " : " + score2);

        //print winner
        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("Match Draw!");
        }

        sc.close();
    }
}
