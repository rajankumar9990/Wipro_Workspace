package wd;

import java.util.Scanner;

public class Ary2D_Ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = 3;
		int c = 3;
		int mat[][] = new int[r][c];
		System.out.println("Enter " + (r * c) + " elements: ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();

	}
}
