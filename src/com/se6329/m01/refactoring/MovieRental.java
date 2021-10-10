package com.se6329.m01.refactoring;

public class MovieRental {

	public static void main(String[] args) {
		Customer customer = new Customer("James Smith");
		customer.addRental(new Rental(new Movie("Star Trek Beyond", Movie.REGULAR), 2));
		customer.addRental(new Rental(new Movie("Aliens versus Predator", Movie.REGULAR), 3));
		customer.addRental(new Rental(new Movie("The Marksman", Movie.NEW_RELEASE), 1));
		customer.addRental(new Rental(new Movie("The Fast Saga", Movie.NEW_RELEASE), 2));
		customer.addRental(new Rental(new Movie("Baby Boss", Movie.CHILDRENS), 3));
		customer.addRental(new Rental(new Movie("Toy Story", Movie.CHILDRENS), 4));

		System.out.println(customer.htmlRentalReceipt());

	}

}
