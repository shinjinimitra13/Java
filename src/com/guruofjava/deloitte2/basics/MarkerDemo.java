package com.guruofjava.deloitte2.basics;

import java.util.Date;

public class MarkerDemo {

	public static void main1(String[] args) {
		
		Marker m1;
		m1 = new Marker();
		m1.price=15.8;
		System.out.println(m1.price);
		Marker m2;m2 = new Marker();
		System.out.println(m2.price);
		
		m2.price = 0.0;
		System.out.println(m2.price);
		System.out.println(m2.price);
		System.out.println(m2.color);
		
	}
public static void main2(String[] args)
{
	/*Marker m1 = new Marker();
	System.out.println(m1.brand);
	m1.brand="Camlin";
	System.out.println(m1.brand);*/
	Marker m1 = new Marker("black",80,"Camlin");
	//System.out.println(m1.brand);
	System.out.println(m1.color);
	System.out.println(m1.price);
	m1.price=-10.0;
	System.out.println(m1.price);
	System.out.println(m1.getPrice());
	//System.out.println(m1.brand);
	
	//m1.write("blackboard");
	m1.write(288);
	m1.write(126.45);
}
public static void main3(String[] args) {
	Marker m1 = new Marker("Reynolds","Blue",28);
	Marker m2 = new Marker("Cello","Green",30);
	
	System.out.println(m1.color);
	System.out.println(m2.color);
	
	System.out.println(m1.category);
	System.out.println(m2.category);
	
	m1.color = "Black";
	m2.color = "Red";
	
	m1.category = "Stationery";
	m2.category = "Writing Instruments";
	
	System.out.println(m1.color);
	System.out.println(m2.color);
	
	System.out.println(m1.category);
	System.out.println(m2.category);}
public static void main5(String[] args)
{
	Marker m1 = new Marker();
	Date d1 = new Date();
	System.out.println(m1.toString());
	System.out.println(d1.toString());
	
}
public static void main6(String[] args)
{	
	Marker m1 = new Marker();
	System.out.println(m1.getPrice());
	m1.setPrice(35);
	System.out.println(m1.getPrice());
	
}
public static void main(String[] args)
{
	Marker m1 = new Marker();
	m1.setCategory("pen");
	System.out.println(m1.getCategory());
}
	
}


