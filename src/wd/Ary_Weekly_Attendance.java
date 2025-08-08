package wd;
public class Ary_Weekly_Attendance {
    public static void main(String[] args) {
        int[][] attendance = {
            {1, 1, 0, 1, 1, 0, 1}, // Student 1
            {0, 1, 1, 1, 0, 1, 1}, // Student 2
            {1, 1, 1, 0, 1, 1, 0}  // Student 3
        };

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println("Attendance Record for the Week (Present:1 and Absent:0) :");

        for (int i = 0; i < attendance.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.println(days[j] + ": " + attendance[i][j]);
            }
        }
    }
}
