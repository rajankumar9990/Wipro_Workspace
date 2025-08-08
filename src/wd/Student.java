package wd;

public class Student {
	String name;  //instance variable - one copy for each
	static String school="Apex Public School";  //static variable one for all
	
	Student(String n){
		name=n;
	}
	void study() {
		int hours=8;     //local variable
		System.out.println(name+" studies for "+hours+" hours at "+ school);
		
	}
	public static void main(String[] args) {
		Student s1=new Student("Harsh");
		Student s2=new Student("Vikram");
		s1.study();
		s2.study();
	}

}
