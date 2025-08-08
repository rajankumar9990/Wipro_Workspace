package wd;

public class School_Student {
	String name;  //instance variable - one copy for each
	int age;     //instance
	static String school="Apex Public School";  //static variable one for all
	
	void study() {
		int hours=8;     //local variable
		System.out.println(name+" studies for "+hours+" hours at "+ school+" and his age is "+age);
		
	}
	public static void main(String[] args) {
		School_Student s1=new School_Student();
		School_Student s2=new School_Student();
		s1.name="Anil";
		s1.age=15;
		s2.name="Akash";
		s2.age=16;
		s1.study();
		s2.study();
		
		//Changing static variable
		school="DAV";
		System.out.println("\nAfter Changing School:-");
		s1.study();
		s2.study();
		
	}

}
