package com.se6329.m01.refactoring;

import java.util.List;
import java.util.ArrayList;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String statement() {
		String result = "Rental Record for " + getName() + "\n";
		for (Rental rental : rentals)
			result += "\t" + rental.getMovieRentalTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
		return result;
	}

	public String htmlStatement() {
		String result = "<h1>Rental record for <em>" + getName() + "</em></h1>\n<table>\n";
		for (Rental rental : rentals)
			result += "\t<tr><td>" + rental.getMovieRentalTitle() + "</td><td>" + ": "
					+ String.valueOf(rental.getCharge()) + "</td></tr>\n";
		result += "</table>\n<p>Amount owed is <em>" + String.valueOf(getTotalCharge()) + "</em></p>\n";
		result += "<p>You earned <em>" + String.valueOf(getTotalFrequentRenterPoints())
				+ "</em> frequent renter points</p>";
		return result;
	}

	private double getTotalCharge() {
		double total = 0;
		for (Rental rental : rentals)
			total += rental.getCharge();
		return total;
	}

	private int getTotalFrequentRenterPoints() {
		int total = 0;
		for (Rental rental : rentals)
			total += rental.getFrequentRenterPoints();
		return total;
	}

}