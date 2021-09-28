package com.se6329.m01.refactoring;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	int getFrequentRenterPoints(int daysRented) {
		if (daysRented > 1)
			return 2;
		return 1;
	}
}
