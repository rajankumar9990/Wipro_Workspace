package wd;

public class Instance_Var_Ex {
	 int num; // instance variable

	 Instance_Var_Ex(int n) {      //constructor
	        num = n;
	    }

	    public static void main(String[] args) {
	    	Instance_Var_Ex obj1 = new Instance_Var_Ex(10);
	    	Instance_Var_Ex obj2 = new Instance_Var_Ex(20);

	        System.out.println("Object1 number: " + obj1.num);
	        System.out.println("Object2 number: " + obj2.num);
	    }

}
