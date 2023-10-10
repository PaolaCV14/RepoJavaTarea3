package com.iteso.calendar;

import javax.swing.JOptionPane;

public class TestDate {
	
	public static void main(String[] args) {

		DateTime t1 = new DateTime();
		System.out.println(t1);
		DateTime t2 = new DateTime(0, 26, 3, 0);
		System.out.println(t2);
		DateTime t3 = new DateTime(23, 59, 59, 31, 12, 2017, 0);
		System.out.println(t3);
		DateTime t4 = t3.nextSecond();
		System.out.println(t4);
		Date d5 = new Date(31, 12, 2017);
		System.out.println(d5);
		Date d3 = t3.toDate();
		d3.next();
		DateTime t6 = new DateTime(t3.getSS(), t3.getMI(), t3.getHH(), d3.getDay(), d3.getMonth(), d3.getYear(), 2) ;
		System.out.println(t6);
		DateTime t2C = t2.clone();
		System.out.println(t2.equals(t2C));
		System.out.println(d5.equals(t3));
		System.out.println(t3.equals(d5));
		
		
	}
}
