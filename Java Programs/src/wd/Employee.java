package wd;

public class Employee {
	String name; //instance variable
	static String company="Wipro"; //static variable
	Employee(String n){
		name=n;
	}
	void work() {
		int hours=6;  //local variable inside function
		System.out.println(name+ " works for "+ hours+" hours at this company "+company);
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Rajan");
		Employee e2=new Employee("Ankit");
		e1.work();
		e2.work();
	}

}
