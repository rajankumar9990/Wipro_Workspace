package wd;

class Car {
	private boolean engine_status_On;
	private int speed;
	private double fuelLevel;

	public void startEngine() {
		engine_status_On= true;
		System.out.println("Engine started.");
	}

	public void stopEngine() {
		engine_status_On= false;
		speed = 0; // Car stops when engine is off
		System.out.println("Engine stopped.");
	}

	public void setSpeed(int speed) {
		if (engine_status_On && speed >= 0) {
			this.speed = speed;
			System.out.println("Speed set to: " + speed + " km/h");
		} else if (!engine_status_On) {
			System.out.println("Cannot change speed. Engine is OFF!");
		} else {
			System.out.println("Invalid speed!");
		}
	}

	public int getSpeed() {
		return speed;
	}

	public void setFuelLevel(double fuelLevel) {
		if (fuelLevel >= 0) {
			this.fuelLevel = fuelLevel;
		} else {
			System.out.println("Invalid fuel level!");
		}
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public boolean isEngineOn() {
		return engine_status_On;
	}
}

public class Encap_Car {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setFuelLevel(28.5);
		System.out.println("Fuel Level: " + myCar.getFuelLevel() + " liters");

		myCar.startEngine();
		myCar.setSpeed(80);
		System.out.println("Current Speed: " + myCar.getSpeed() + " km/h");

		myCar.stopEngine();
		myCar.setSpeed(60);
	}
}
