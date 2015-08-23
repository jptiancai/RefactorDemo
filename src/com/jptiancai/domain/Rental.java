package com.jptiancai.domain;

/**
 * 租赁
 * 
 * @author Administrator
 *
 */
public class Rental {

	private Movie _movie;// 影片
	private int _dayRented;// 租期

	public Rental(Movie _movie, int _dayRented) {
		super();
		this._movie = _movie;
		this._dayRented = _dayRented;
	}

	public Movie getMovie() {
		return _movie;
	}

	public int getDayRented() {
		return _dayRented;
	}

	public double getCharge() {
		double result = 0;
		switch (getMovie().getPriceCode()) {// 取得影片租借价格
		case Movie.REGULAR:// 普通片
			result += 2;
			if (getDayRented() > 2)
				result += (getDayRented() - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:// 新片
			result += getDayRented() * 3;
			break;
		case Movie.CHILDRENS:// 儿童
			result += 1.5;
			if (getDayRented() > 3)
				result += (getDayRented() - 3) * 1.5;
			break;
		}
		return result;
	}

	/**
	 * 计算一笔租片费
	 * 
	 * @return
	 */
	public int getFrequentRenterPoints() {
		if (getMovie().getPriceCode() == Movie.NEW_RELEASE
				&& getDayRented() > 1) {
			return 2;
		}else
			return 1;
	}

}
