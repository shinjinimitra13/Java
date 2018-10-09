package com.guruofjava.deloitte2.api;

public class Book_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book();
		Book b2 = new Book(100,1,"A brief History of Time","Stephen Hawking","Publication House");
		System.out.println(b2.isOpen());
		System.out.println(b1.title);
		System.out.println(b2.title);
		System.out.println();
	}

}


