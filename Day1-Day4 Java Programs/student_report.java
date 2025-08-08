package wd;

public class student_report {
    public static void main(String[] args) {
        System.out.println("STUDENT REPORT CARD");

        // Student 1
        char s1="Rajan";
        int roll1 = 1; 
        int m1_1 = 84, m1_2 = 90, m1_3 = 88;
        int total1 = m1_1 + m1_2 + m1_3;
        float avg1 = total1 / 3.0f;
        System.out.println("Name: "+s1);
        System.out.println("Roll No.: " + roll1);
        System.out.println("Marks: " + m1_1 + ", " + m1_2 + ", " + m1_3);
        System.out.println("Total: " + total1);
        System.out.println("Average: " + avg1);
        System.out.println();

        // Student 2
        char s2="Aman";
        int roll2 = 2;
        int m2_1 = 78, m2_2 = 82, m2_3 = 82;
        int total2 = m2_1 + m2_2 + m2_3;
        float avg2 = total2 / 3.0f;
        System.out.println("Name: "+s2);
        System.out.println("Roll No.: " + roll2);
        System.out.println("Marks: " + m2_1 + ", " + m2_2 + ", " + m2_3);
        System.out.println("Total: " + total2);
        System.out.println("Average: " + avg2);
        System.out.println();

    }
}
