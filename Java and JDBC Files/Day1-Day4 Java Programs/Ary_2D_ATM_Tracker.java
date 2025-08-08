package wd;

import java.util.Scanner;

public class Ary_2D_ATM_Tracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] cash = new int[2][3]; // 2 ATMs, 3 note types
        int[] notes = {100, 500, 2000};

        for (int i = 0; i < 2; i++) {
            System.out.println("ATM " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of Rs" + notes[j] + " notes: ");
                cash[i][j] = sc.nextInt();
            }
        }

        // Showing total cash in each ATM
        for (int i = 0; i < 2; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += cash[i][j] * notes[j];
            }
            System.out.println("ATM " + (i + 1) + " Total Cash = Rs" + total);
        }

        sc.close();
    }
}
