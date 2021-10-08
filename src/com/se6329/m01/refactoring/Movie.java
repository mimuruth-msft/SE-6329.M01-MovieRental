package com.se6329.m01.refactoring;

public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String _title;

	public Movie() {
		_title = "";
	}

	public Movie(String title, int priceCode) {
		this._title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return _title;
	}

	private void setPriceCode(int priceCode) {
		switch (priceCode) {
		case REGULAR:
			_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}

	private Price _price;

	public int getPriceCode() {
		return _price.getPriceCode();
	}

	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}

	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}

}