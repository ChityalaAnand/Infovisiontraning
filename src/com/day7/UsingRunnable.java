package com.day7;

public class UsingRunnable implements Runnable {
	private int availableTickets = 200;
	String tickerBuyer;
	int bookedTickets;
	public UsingRunnable(int bookedTickets, String tickerBuyer) {
		this.bookedTickets = bookedTickets;
		this.tickerBuyer = tickerBuyer;
	}
	@Override
	public void run() {
		purchase(bookedTickets, tickerBuyer);
	}
	
	public synchronized void purchase(int bookedTickets, String tickerBuyer) {
		if(bookedTickets <= availableTickets) {
			System.out.println("Booked Tickets : "+bookedTickets);
			availableTickets -= bookedTickets;
			System.out.println("AvailableTickets : "+availableTickets);
		}else {
			System.out.println("No tickets Available");
		}
	}

}
