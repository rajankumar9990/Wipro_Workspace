package com.day6;

class TicketBooking {
	int availableSeats = 1;

	public synchronized void bookTicket(String name) {
		if (availableSeats > 0) {
			System.out.println(name + " is booking ticket...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(name + " successfully booked the ticket!");
			availableSeats--;
		} else {
			System.out.println(" sorry " + name + " , seat already booked!");

		}
	}
}

class User extends Thread {
	TicketBooking booking;
	String userName;

	public User(TicketBooking booking, String userName) {
		this.booking = booking;
		this.userName = userName;
	}

	public void run() {
		booking.bookTicket(userName);
	}
}

public class TicketBookingSystem {

	public static void main(String[] args) {
		TicketBooking booking = new TicketBooking();

		User user1 = new User(booking, "Renu");
		User user2 = new User(booking, "Sai");
		User user3 = new User(booking, "Mahasa");
		user1.start();
		user2.start();
		user3.start();
	}

}
