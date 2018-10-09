package com.guruofjava.deloitte2.api;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar c1 = new Calendar();
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));
		System.out.println(c1.get(Calendar.DATE));
		System.out.println(c1.get(Calendar.DAY_OF_YEAR));
		System.out.println(c1.get(Calendar.MONTH));
		c1.set(Calendar.DAY_OF_YEAR, c1.getActualMaximum(Calendar.DAY_OF_YEAR)+72);
		System.out.println(c1.getMaximum(Calendar.DAY_OF_YEAR));
		System.out.println(c1.getMaximum(Calendar.DAY_OF_MONTH));      

		System.out.println(c1.get(Calendar.MONTH));
		

	}

}
