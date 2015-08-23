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
		
		int frequentRenterPoint = 0;// 	常客积点
		Enumeration rentals = _rentals.elements();
		String result = "Rental Record for" + getName() + "\n";

		while (rentals.hasMoreElements()) {// 取得一笔租借记录
			Rental each = (Rental) rentals.nextElement();
			
			//显示此笔租借记录
			result+="\t"+each.getMovie().getTitle()+"\t"+
			String.valueOf(each.getCharge())+"\n";

		}
		
		//结尾打印
		result +="Amount owed is"+String.valueOf(getTotalCharge())+"\n";
		
		result +="You earned "+String.valueOf(getTotalFrequentRenterPoints())+"frequent rent points";

		return result;
	}

	//计算一笔租片费
	private double amountFor(Rental aRental) {
		//getCharge方法参数只是用到了Rental对象，所以这里把它移动Rental对象里面
		//而这里只是引用而已
		return aRental.getCharge();
	}
	
	// 总消费金额
	private double getTotalCharge() {
		double result = 0;
		Enumeration rentals = _rentals.elements();
		while (rentals.hasMoreElements()) {// 取得一笔租借记录
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		return result;
	}
	
	//增加常客累计点
	private int getTotalFrequentRenterPoints(){

        int result = 0;

       Enumeration rentals = _rentals.elements();

       while (rentals.hasMoreElements()) {

           Rental each = (Rental) rentals.nextElement();

           result += each.getFrequentRenterPoints();

       }

       return result;

   }
	
	//这样可以直接复用之前的代码，来完成html格式的打印报表了
	public String htmlStatement(){
		 Enumeration rentals = _rentals.elements();

	     String result = "<H1>Rentals for <EM>" + getName() + "</EM></ H1><P>\n";

	     while (rentals.hasMoreElements()) {

	         Rental each = (Rental) rentals.nextElement();

	         //show figures for each rental

	         result += each.getMovie().getTitle()+ ": " +

	                       String.valueOf(each.getCharge()) + "<BR>\n";

	     }

	     //add footer lines

	     result +=  "<P>You owe <EM>" + String.valueOf(getTotalCharge()) + "</EM><P>\n";

	     result += "On this rental you earned <EM>" +

	         String.valueOf(getTotalFrequentRenterPoints()) +

	         "</EM> frequent renter points<P>";

	     return result;

	}


}
