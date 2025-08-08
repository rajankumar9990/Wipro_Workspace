package wd;
public class Jagged_Ary_Ex {
    public static void main(String[] args) {
       
        int[][] projects = {
            {101, 102, 103},   // Employee 1 → 3 projects
            {201, 202},        // Employee 2 → 2 projects
            {301},             // Employee 3 → 1 project
            {401, 402, 403, 404} // Employee 4 → 4 projects
        };

        System.out.println("Employee Project List:");

        for (int i = 0; i < projects.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < projects[i].length; j++) {
                System.out.print("Project-" + projects[i][j] + " ");
            }
            System.out.println();
        }
    }
}
