package wd;
import java.util.Scanner;


public class do_while_guess {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int right_guess=8;
		int guess;
		do {
			System.out.println("Guess the number from 1 to 10 : ");
			guess=sc.nextInt();
		}while(guess!=right_guess); //if guess no is not equal to right guess it will repeat

        System.out.println("Right! You guessed the number.");
        sc.close();
		
	}

}
