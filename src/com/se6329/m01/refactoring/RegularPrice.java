package com.se6329.m01.refactoring;

public class RegularPrice extends Price {

	public RegularPrice() {
		super();
		super.basePrice = Double.valueOf(super.properties.getProperty("regularBasePrice"));
		super.extraChargeModifier = Double.valueOf(super.properties.getProperty("regularExtraChargeModifier"));
		super.extraChargeDays = Integer.valueOf(super.properties.getProperty("regularExtraChargeDays"));
	}
	
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }



    @Override
    public double getCharge(int daysRented) {
        double amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }


}