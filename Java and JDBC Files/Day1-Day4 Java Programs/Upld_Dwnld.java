package wd;

import java.util.Scanner;

public class Upld_Dwnld {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file name: ");
		String fileName = sc.nextLine();

		System.out.print("Enter file size (in MB): ");
		double fileSize = sc.nextDouble();

		System.out.println("\nFile Uploaded Successfully!\n");
		System.out.println("Uploaded File: " + fileName + " (" + fileSize + " MB)");

		System.out.println("\nDownloading File: " + fileName + " (" + fileSize + " MB)");

		sc.close();
	}
}
