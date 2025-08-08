package wd;

public class While_Monitor_Patients_Temp {
	 public static void main(String[] args){
		 double temp=50;
		 int hours=5;
		 for(hours=1;hours<=5;hours++) {
			 System.out.println("At Hour "+hours+" Temperature is "+temp++ + " degrees.");
		 }
		 int heart_Rate = 105; 
	        while (heart_Rate < 60 || heart_Rate > 100) {
	            System.out.println("Heart Rate: " + heart_Rate + " : Waiting until normal...");
	            heart_Rate--; 
	        }

	        System.out.println("Heart Rate: " + heart_Rate + " : Patient's heart rate got normal.");
	    }
		 
	 }


