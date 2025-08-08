package wd;

public class Str_Buf_Employee {
    public static void main(String[] args) {
        // Employee details
        String name = "Aman";
        int empId = 105;
        String role = "Software Engineer";
        double monthlySalary = 65000;
        StringBuffer profile = new StringBuffer();
        profile.append("Employee Profile \n");
        profile.append("ID      : " + empId + "\n");
        profile.append("Name    : " + name + "\n");
        profile.append("Role    : " + role + "\n");
        profile.append("Salary  : Rs " + monthlySalary + " per month\n");
        profile.append("-------------------------\n");
        profile.append("Annual Package: Rs " + (monthlySalary * 12) + "\n");
        profile.append("Status  : Active\n");
        profile.append("Welcome to the Team!\n");
        System.out.println(profile);
    }
}
