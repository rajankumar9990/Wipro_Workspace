package wd;

public class Do_While_Heart_Rate {
    public static void main(String[] args) {
        int heartRate = 105;

        do {
            System.out.println("Heart Rate: " + heartRate + " : Waiting until normal..........");
            heartRate--; 
        } while (heartRate < 60 || heartRate > 100);

        System.out.println("Heart Rate: " + heartRate + " : Patient's Heart Rate got normal now.");
    }
}
