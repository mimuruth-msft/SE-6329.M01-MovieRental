package com.se6329.m01.refactoring;

import java.util.Properties;

abstract class Price {

	protected Properties properties;
	protected double basePrice;
	protected double extraChargeModifier;
	protected int extraChargeDays;
	protected int baseFrequentRenterPoints;

	protected Price() {
		properties = MovieRentalProperties.getProperties();
		basePrice = -1;
		extraChargeModifier = -1;
		extraChargeDays = -1;
		baseFrequentRenterPoints = Integer.valueOf(properties.getProperty("baseFrequentRenterPoints"));
	}

	abstract int getPriceCode();

	public double getCharge(int daysRented) {
		if (basePrice < 0 || extraChargeModifier < 0 || extraChargeDays < 0) {
			return -1;
		}
		double amount = basePrice;
		if (daysRented > extraChargeDays) {
			basePrice += (daysRented - extraChargeDays) * extraChargeModifier;
		}
		return amount;
	}

	public int getFrequentRenterPoints(int daysRented) {
		return baseFrequentRenterPoints;
	}
}