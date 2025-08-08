package wd;

public class For_Each_Cities {
	public static void main(String[] args) {
		String[] city_name = { "Delhi", "Mumbai", "Pune", "Bangalore" };
		int city_count = 1;
		for (String str : city_name) {
			System.out.println("City " + city_count + " : " + str.toUpperCase());
			city_count++;
		}

	}

}
