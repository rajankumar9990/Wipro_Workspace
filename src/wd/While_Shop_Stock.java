package wd;
public class While_Shop_Stock {
    public static void main(String[] args) {
        int stock = 5;

        while (stock > 0) {
            System.out.println("Sold 1 item, Remaining stock: " + (stock - 1));
            stock--;
        }

        System.out.println("All items sold out!");
    }
}
