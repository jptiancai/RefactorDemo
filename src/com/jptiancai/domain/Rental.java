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


	public double getCharge(){
		return _movie.getCharge(_dayRented);
	}
	
	/**
	 * 计算一笔租片费
	 * 
	 * @return
	 */
	public int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_dayRented);
	}

}
