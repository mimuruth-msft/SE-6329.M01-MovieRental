package com.se6329.m01.refactoring;

public class ChildrensPrice extends Price {

	public ChildrensPrice() {
		super();
		super.basePrice = Double.valueOf(super.properties.getProperty("childrenBasePrice"));
		super.extraChargeModifier = Double.valueOf(super.properties.getProperty("childrenExtraChargeModifier"));
		super.extraChargeDays = Integer.valueOf(super.properties.getProperty("childrenExtraChargeDays"));
	}

	@Override
	public int getPriceCode() {
		return Movie.CHILDRENS;
	}

	@Override
	public double getCharge(int daysRented) {
		double amount = 1.5;
		if (daysRented > 3)
			amount += (daysRented - 3) * 1.5;
		return amount;
	}
}
