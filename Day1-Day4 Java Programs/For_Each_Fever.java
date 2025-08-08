package wd;

public class For_Each_Fever {
	public static void main(String[] args) {
		double[] temperatures = { 35.1, 35.9, 36.2, 36.8, 37.1, 37.5, 38.0, 35.6 };
		int Patient_Num = 1;
		for (double temp : temperatures) {
			if (temp > 37.0) {
				System.out.println("Patient : " + Patient_Num + " has fever of " + temp + " degree celsius.");
			} else {
				System.out.println("Patient : " + Patient_Num + " does not have fever and his temperature is " + temp
						+ " degree celsius.");
			}
			Patient_Num++;
		}
	}

}
