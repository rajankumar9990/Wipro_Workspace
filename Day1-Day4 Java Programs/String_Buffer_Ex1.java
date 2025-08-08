package wd;

public class String_Buffer_Ex1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello Rajan");
		sb.append(" World");
		System.out.println("Append: " + sb);

		sb.insert(5, " Java");
		System.out.println("Insert: " + sb);
		sb.replace(6, 10, "Programming");
		System.out.println("Replace: " + sb);

		sb.delete(6, 8);
		System.out.println("Delete: " + sb);

		sb.reverse();
		System.out.println("Reverse: " + sb);
	}
}
