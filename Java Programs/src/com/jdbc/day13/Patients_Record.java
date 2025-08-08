package com.jdbc.day13;

import java.sql.*;
import java.util.Scanner;

public class Patients_Record {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_new", "root", "123456");
			// Statement stmt = con.createStatement();
			/*
			 * String sql = "CREATE TABLE IF NOT EXISTS Patient (" +
			 * "id INT PRIMARY KEY AUTO_INCREMENT, " + "name VARCHAR(100), " + "age INT, " +
			 * "disease VARCHAR(100), " + "admission_date DATE, " +
			 * "doctor_assigned VARCHAR(100)" + ")";
			 */
			String sql = "INSERT INTO patient(name, age, disease, admission_date, doctor_assigned) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			System.out.print("How many patients do you want to store? ");
			int count = sc.nextInt();
			sc.nextLine();

			for (int i = 1; i <= count; i++) {
				System.out.println("\nEnter details for Patient " + i + ":");
				System.out.print("Enter Patient Name: ");
				String name = sc.nextLine();

				System.out.print("Enter the Age: ");
				int age = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter the Disease: ");
				String disease = sc.nextLine();

				System.out.print("Enter Admission Date (YYYY-MM-DD): ");
				String date = sc.nextLine();

				System.out.print("Enter the Doctor name which is Assigned: ");
				String doctor = sc.nextLine();
				// setting placeholder
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
				pstmt.setString(3, disease);
				pstmt.setDate(4, Date.valueOf(date));
				pstmt.setString(5, doctor);

				pstmt.executeUpdate();
				System.out.println("Patient " + i + " data inserted successfully!");
			}
			System.out.print("\nDo you want to delete any patient record? (yes/no): ");
			String choice = sc.nextLine();
			if (choice.equalsIgnoreCase("yes")) {
				System.out.print("Enter the Patient ID to delete: ");
				int delId = sc.nextInt();

				String deleteSql = "DELETE FROM patient WHERE id = ?";
				PreparedStatement deleteStmt = con.prepareStatement(deleteSql);
				// placeholder
				deleteStmt.setInt(1, delId);

				int rows = deleteStmt.executeUpdate();
				if (rows > 0) {
					System.out.println("Patient with ID " + delId + " deleted successfully.");
				} else {
					System.out.println("No patient found with ID " + delId + ".");
				}
			}

			// stmt.executeUpdate(sql);
			// System.out.println("Table Created.");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
