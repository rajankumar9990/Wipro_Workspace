package wd;

class Voter {
	private String name;
	private int age;
	private boolean voting;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void vote() {
		if (age >= 18) {
			if (!voting) {
				voting = true;
				System.out.println(name + " has successfully voted.");
			} else {
				System.out.println("Sorry, " + name + " has already voted!");
			}
		} else {
			System.out.println("Sorry, " + name + " is not eligible to vote (Must be 18+).");
		}
	}
}

public class Encap_Vote {
	public static void main(String[] args) {
		Voter v1 = new Voter();
		v1.setName("Akash");
		v1.setAge(22);

		Voter v2 = new Voter();
		v2.setName("Ankit");
		v2.setAge(16);

		Voter v3 = new Voter();
		v3.setName("Alok");
		v3.setAge(19);

		v1.vote();
		v1.vote();
		v2.vote();
		v3.vote();
	}
}
