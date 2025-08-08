package wd;

abstract class Game {
	abstract void startGame();

	abstract void play();

	abstract void endGame();
}

class Cricket extends Game {
	void startGame() {
		System.out.println("Cricket Match Started. Toss won by Team A.");
	}

	void play() {
		System.out.println("Players are batting and bowling.");
	}

	void endGame() {
		System.out.println("Cricket Match Ended. Final score declared.");
	}
}

class Football extends Game {
	void startGame() {
		System.out.println("Football Match Started. Kick-off by Team A.");
	}

	void play() {
		System.out.println("Players are passing and shooting the ball.");
	}

	void endGame() {
		System.out.println("Football Match Ended. Final whistle blown.");
	}
}

class Hockey extends Game {
	void startGame() {
		System.out.println("Hockey Match Started. First pass by Team A.");
	}

	void play() {
		System.out.println("Players are dribbling and striking the ball.");
	}

	void endGame() {
		System.out.println("Hockey Match Ended. Team B wins!");
	}
}

public class Abs_Game_Framework {
	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.startGame();
		cricket.play();
		cricket.endGame();

		System.out.println();

		Game football = new Football();
		football.startGame();
		football.play();
		football.endGame();

		System.out.println();

		Game hockey = new Hockey();
		hockey.startGame();
		hockey.play();
		hockey.endGame();
	}
}
