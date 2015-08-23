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
	
	private String _title;//名称
	private int _priceCode;//价格（代号）
	
	
	public Movie(String _title, int _priceCode) {
		super();
		this._title = _title;
		this._priceCode = _priceCode;
	}


	public String getTitle() {
		return _title;
	}



	public int getPriceCode() {
		return _priceCode;
	}


	public void set_priceCode(int _priceCode) {
		this._priceCode = _priceCode;
	}
	
	
	
	
	
	
	
	
	
	

}
