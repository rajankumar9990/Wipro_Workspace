package com.jdbc;

import java.sql.*;

public class JDBC_Connection {
	public static void main(String[] args) {
		try {
			// Load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "123456");

			// System.out.println("Connected Successfully");
			// Create Statement
			//Statement stmt = con.createStatement();

			// SQL query to create table
			/*String sql = "CREATE TABLE IF NOT EXISTS patient (" + "id INT PRIMARY KEY AUTO_INCREMENT, "
					+ "name VARCHAR(100), " + "age INT, " + "disease VARCHAR(100)" + ")";*/
			
			//String sql="INSERT INTO patient(name, age, disease) VALUES(?,?,?)";
			String sql="UPDATE patient SET name=? WHERE name=?";
			
			PreparedStatement pstmt=con.prepareStatement(sql);
			/*pstmt.setString(1, "Rohit");
	            pstmt.setInt(2, 30);
	            pstmt.setString(3, "Diabetes");*/
			
			//using 2 d array for inserting values
			/*String[][] patients= {
					{"Rajan","22","Cold"},{"Aman","22","Fever"},{"Ankit","23","Headache"}
			};
			for(String[] row:patients) {
				pstmt.setString(1,row[0]);
				pstmt.setInt(2, Integer.parseInt(row[1]));
				pstmt.setString(3,row[2]);
				pstmt.executeUpdate();
				
			}*/
			
			// 2D array: {oldName, newName}
            String[][] updt = {
                {"Rajan Gupta", "Rajan"},
                {"Harsh Gupta", "Aashish"},
                {"Ankit Singh", "Ankit"}
            };
            
            for (String[] update : updt) {
                pstmt.setString(1, update[1]); // new name
                pstmt.setString(2, update[0]); // old name
                int rows = pstmt.executeUpdate();
                System.out.println("Values Updated.");
            }

			// Set values for placeholders
           /* 
            pstmt.setString(1, "Rohit");
            pstmt.setString(2,"Vishal");
            
            int rows=pstmt.executeUpdate();
            System.out.println(rows+" rows updated");*/

			// Execute the query

		//	System.out.println("Data insertion successfully.");

			// Close the connection
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
