package com.guruofjava.deloitte2.basics;

public class Marker {
	public Marker()
	{
	//System.out.println("Marker Object Creater");
		price = 20.0;
	}
	public Marker(String b)
	{
		brand = b;
	}
	public Marker(String c,double p,String v)
	{
		color = c;
		price = p;
		brand = v;
	}
	public Marker(String string, String string2, int i) {
		// TODO Auto-generated constructor stub
	}
	public double getPrice()
	{
		return price;
	}
	public void setPrice(double price)
	{
		this.price=price ;
		
		
	}
	// TODO Auto-generated method stub
	private String brand;
	String color = "Black";
	double price ;
	public String category;
public void write(String input)
{
	System.out.println(input);
	
}
public void write(double input)
{
System.out.println(input);	
}
//public static String category=" ";

public  void setCategory(String category)
{
	this.category = category;
}
public String getCategory()
{
	return category;
}

}