package wd;

public class Heart_Rate_For_Each{
    public static void main(String[] args) {
        int[] heartRates = {72, 85, 95, 102, 88};

        for (int rate : heartRates) {
            if (rate < 60 || rate > 100)
                System.out.println("Heart Rate: " + rate + " = Abnormal");
            else
                System.out.println("Heart Rate: " + rate + " = Normal");
        }
    }
}
