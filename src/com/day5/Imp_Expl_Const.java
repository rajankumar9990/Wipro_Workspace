package com.day5;

class Impl_Ex {
	int num; // 0
	String name; // null
}

class Expl_Ex {
	int num;
	String name;

	Expl_Ex() {
		num = 10;
		name = "Rajan";
		System.out.println("Explicit constructor called!");
	}
}

public class Imp_Expl_Const {
	public static void main(String[] args) {

		Impl_Ex obj1 = new Impl_Ex();
		System.out.println("\nImplicit Constructor ");
		System.out.println("Num: " + obj1.num); // 0
		System.out.println("Name: " + obj1.name); // null

		Expl_Ex obj2 = new Expl_Ex();
		System.out.println("\nExplicit Constructor ");
		System.out.println("Num: " + obj2.num); // 10
		System.out.println("Name: " + obj2.name); // Rajan
	}
}
