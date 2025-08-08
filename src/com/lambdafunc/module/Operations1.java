package com.lambdafunc.module;

interface Operation {
	double calculate(double a, double b);
}

public class Operations1 {
	public static void main(String[] args) {
		Operation add = (a, b) -> a + b;
		Operation sub = (a, b) -> a - b;
		Operation mul = (a, b) -> a * b;
		Operation div = (a, b) -> {
			if (b == 0) {
				System.out.println("Division by zero not allowed!");
				return 0;
			}
			return a / b;
		};

		float x = 10;
		float y = 9;

		System.out.println("Addition: " + add.calculate(x, y));
		System.out.println("Subtraction: " + sub.calculate(x, y));
		System.out.println("Multiplication: " + mul.calculate(x, y));
		System.out.println("Division: " + div.calculate(x, y));
	}
}
