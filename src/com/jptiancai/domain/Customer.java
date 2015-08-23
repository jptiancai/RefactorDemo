package com.jptiancai.domain;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String _name;// 姓名
	private Vector _rentals = new Vector();// 租借数据结构

	public Customer(String _name) {
		this._name = _name;
	}

	public String getName() {
		return _name;
	}

	public Vector getRentals() {
		return _rentals;
	}

	/**
	 * ���챨��
	 * 
	 * @return
	 */
	public String statement() {
		double totalAmount = 0;// 总消费金额
		int frequentRenterPoint = 0;// 	常客积点
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for" + getName() + "\n";

		while (rentals.hasMoreElements()) {// 取得一笔租借记录
			double thisAmount = 0;
			Rental each = (Rental) rentals.nextElement();

			//
			switch (each.getMovie().getPriceCode()) {// 取得影片租借价格
			case Movie.REGULAR:// 普通片
				thisAmount += 2;
				if (each.getDayRented() > 2)
					thisAmount += (each.getDayRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:// 新片
				thisAmount += each.getDayRented() * 3;
				break;
			case Movie.CHILDRENS:// 儿童
				thisAmount += 1.5;
				if (each.getDayRented() > 3)
					thisAmount += (each.getDayRented() - 3) * 1.5;
				break;
			}
			
			//增加常客累计点
			frequentRenterPoint++;
			if ((each.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&each.getDayRented()>1) {
				frequentRenterPoint++;
			}
			
			//显示此笔租借记录
			result+="\t"+each.getMovie().getTitle()+"\t"+
			String.valueOf(thisAmount)+"\n";
			thisAmount+=thisAmount;

		}
		
		//结尾打印
		result +="Amount owed is"+String.valueOf(totalAmount)+"\n";
		
		result +="You earned "+String.valueOf(frequentRenterPoint)+"frequent rent points";

		return result;
	}

}
