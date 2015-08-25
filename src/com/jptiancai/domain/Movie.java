package com.jptiancai.domain;

/**
 * 这是一个影片出租店用的程序，计算每一位顾客的消费金额并打印报表（statement）。
 * 操作者告诉程序：顾客租了哪些影片、租期多长，程序便根据租赁时间和影片类型算出费用。
 * 影片分为三类：普通片、儿童片和新片。除了计算费用，还要为常客计算点数；点数会随着「租片种类是否为新片」而有不同
 * 
 * @author Administrator
 *
 */
public class Movie {

	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	
	private String _name;//名称
	private int _priceCode;//价格（代号）
	private Price _price;
	
	
	public Movie(String name, int priceCode) {
		this._name = name;
		setPriceCode(priceCode);	
	}


	private void setPriceCode(int priceCode) {
		switch (priceCode) {
		case REGULAR:
			_price=new RegularPrice();
			break;
		case CHILDRENS:
			_price=new ChildrensPrice();
			break;
		case NEW_RELEASE:
			_price = new NewReleasePrice();
			break;
		default:
			throw new IllegalArgumentException("Incorrect Price Code");
		}
	}


	public String getTitle() {
		return _name;
	}



	public int getPriceCode() {
		return _priceCode;
	}


	public void set_priceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}
	
	public double getCharge(int daysRented) {
		return _price.getCharge(daysRented);
	}


	public int getFrequentRenterPoints(int daysRented) {
		return _price.getFrequentRenterPoints(daysRented);
	}
	
	
	
	
	
	
	
	

}
