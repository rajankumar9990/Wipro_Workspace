package wd;

public class Shopping_Bill_Str_Buf {
    public static void main(String[] args) {
        String[] items = {"Milk", "Tea", "Cold Drink"};
        int[] price = {60, 65, 40};
        int[] qty = {3, 5, 4};
        StringBuffer bill = new StringBuffer();
        bill.append("Shop Bill\n");
        bill.append("---------------------------\n");
        int grandTotal = 0;
        for (int i = 0; i < items.length; i++) {
            int total = price[i] * qty[i];
            grandTotal += total;
           
            bill.append((i + 1) + ". " + items[i] + " = " + total + "\n");
        }

        bill.append("-------------------------------\n");
        bill.append("Grand Total  = " + grandTotal + "\n");
        bill.append("Thank You!\n");

        System.out.println(bill);
    }
}
