package com.se6329.m01.refactoring;

public class NewReleasePrice extends Price {

	private int streakStart;
	private int streakRenterPoints;

	public NewReleasePrice() {
		super();
		super.basePrice = Double.valueOf(super.properties.getProperty("newReleaseBasePrice"));
		super.extraChargeModifier = Double.valueOf(super.properties.getProperty("newReleaseExtraChargeModifier"));
		super.extraChargeDays = Integer.valueOf(super.properties.getProperty("newReleaseExtraChargeDays"));
		this.streakStart = Integer.valueOf(super.properties.getProperty("streakDayStart"));
		this.streakRenterPoints = Integer.valueOf(super.properties.getProperty("streakFrequentRenterPoints"));
	}

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	public int getFrequentRenterPoints(int daysRented) {
		if (daysRented > streakStart)
			return streakRenterPoints;
		return super.baseFrequentRenterPoints;
	}

}
