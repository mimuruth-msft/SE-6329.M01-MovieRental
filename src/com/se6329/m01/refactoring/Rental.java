package com.se6329.m01.refactoring;

public class Rental {
	Movie _movie;
	private int _daysRented;

	public Rental() {
		this._movie = null;
		this._daysRented = -1;
	}

	public Rental(Movie movie, int daysRented) {
		this._movie = movie;
		this._daysRented = daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}

	public String getMovieRentalTitle () {
		return _movie.getTitle();
	}

	public int getDaysRented() {
		return _daysRented;
	}
	
	public double getCharge() {
		return _movie.getCharge(_daysRented);
	}
	
	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	}
	
}