package wd;

public class While_Loop_Sum_Digits {
	public static void main(String[] args) {
		int num=874;
		int sum=0;
		while(num>0) {
			int digit=num%10; //we get the last digit using modulus operator
			sum +=digit;    
			num=num/10;     //remove last digit(4 will be removed)
			
		}
		
		 System.out.println("Sum of digits = " + sum);
	}

}
