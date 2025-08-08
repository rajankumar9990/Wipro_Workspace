package wd;

abstract class Remote {
	abstract void turnOn();

	abstract void turnOff();
}

class FanRemote extends Remote {
	void turnOn() {
		System.out.println("Fan is turned ON using Fan Remote.");
	}

	void turnOff() {
		System.out.println("Fan is turned OFF using Fan Remote.");
	}
}

class MusicSystemRemote extends Remote {
	void turnOn() {
		System.out.println("Music System is turned ON using Music System Remote.");
	}

	void turnOff() {
		System.out.println("Music System is turned OFF using Music System Remote.");
	}
}

public class Abs_Remote {
	public static void main(String[] args) {
		Remote fan = new FanRemote();
		fan.turnOn();
		fan.turnOff();
		System.out.println("\n");
		Remote music = new MusicSystemRemote();
		music.turnOn();
		music.turnOff();
	}
}
