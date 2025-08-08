package com.day5;

class Demo {

	static void show_Static(int a,int b) { // Static Method
		System.out.println("This is a static method.");
		int c=a+b;
		System.out.println("Sum= "+c);;
		
	}

	void show_Instance() { // Instance Method
		System.out.println("This is an instance method.");
	}
}


public class Ins_Stat_Meth {
	
	public static void main(String[] args) {

		Demo.show_Static(5,6);

		Demo obj = new Demo();
		obj.show_Instance();
		
		
	}
}
