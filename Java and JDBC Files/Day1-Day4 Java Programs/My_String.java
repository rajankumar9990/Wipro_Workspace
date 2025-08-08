package wd;

public class My_String {
	public static void main(String[] args) {
		String str = "Hello Rajan";

		System.out.println(str.toUpperCase());

		System.out.println(str.charAt(4));

		System.out.println(str.substring(3, 7));
		System.out.println(str.startsWith("Hel"));
		System.out.println(str.length());
		System.out.println(str.equalsIgnoreCase("hello rajan"));  

		System.out.println(str.replace('o', 'x'));

		System.out.println("".isEmpty());

		System.out.println(str.contains("H"));
		System.out.println(str.toLowerCase());
		System.out.println("   hello hello   ".trim());
		System.out.println(str.indexOf('R'));

		System.out.println(str.endsWith("Hello"));

		System.out.println(str.substring(8));

		System.out.println(str.equals("Rajan"));
	}
}
