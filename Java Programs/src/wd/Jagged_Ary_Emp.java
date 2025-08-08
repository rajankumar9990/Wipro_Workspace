package wd;

import java.util.Scanner;

public class Jagged_Ary_Emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of employees: ");
        int employees = sc.nextInt();

        int[][] projects = new int[employees][]; // Jagged array

        // Taking user input for each employee
        for (int i = 0; i < employees; i++) {
            System.out.print("Enter number of projects for Employee " + (i + 1) + ": ");
            int projectCount = sc.nextInt();

            projects[i] = new int[projectCount]; // Assigning column size for each row

            for (int j = 0; j < projectCount; j++) {
                System.out.print("Enter Project ID " + (j + 1) + ": ");
                projects[i][j] = sc.nextInt();
            }
        }

        // Displaying employee projects
        System.out.println("\nEmployee Project List:");
        for (int i = 0; i < projects.length; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            for (int j = 0; j < projects[i].length; j++) {
                System.out.print("Project-" + projects[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
