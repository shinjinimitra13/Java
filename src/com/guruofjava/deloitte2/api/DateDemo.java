package com.guruofjava.deloitte2.api;
import java.util.*;


public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		 System.out.println(d1);
		 System.out.println(d1.getTime());
		 d1.setTime(0);
		System.out.println(d1);
		
		Date d2 = new Date();
		d2.setTime(d2.getTime() + 500000);
		System.out.println(d2);
		

	}

}
