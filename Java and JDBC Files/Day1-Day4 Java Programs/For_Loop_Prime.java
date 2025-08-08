package wd;

public class For_Loop_Prime {
	public static void main (String[] args) {
		int num=23;
		boolean is_Prime=true;
		for(int i=2;i<=num/2;i++) {      //number cannot have a factor greater than its half
			if(num % i==0) {
				is_Prime=false;
				break;
			}
		}
		if(is_Prime && num>1) {
			 System.out.println(num + " is a Prime Number");
		}
		else {
			System.out.println(num + " is NOT a Prime Number");
		}
	}

}
