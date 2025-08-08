package wd;

public class For_Loop_Fact {
	public static void main(String[] args) {
		int fact=1;
		int num=13;
		for (int i = 1; i <= num; i++) {
            fact *= i;
        }
		System.out.println("Factorial of " + num + " = " + fact);
	}

}
