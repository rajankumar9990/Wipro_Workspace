package wd;

public class Static_Ex {
	static int a = 0; // static variable

	Static_Ex() { // constructor
		a++;
	}

	public static void main(String[] args) {
		Static_Ex Obj1 = new Static_Ex();
		Static_Ex Obj2 = new Static_Ex();
		Static_Ex Obj3 = new Static_Ex();
		System.out.println("Total objects created: " + a);
	}
}
