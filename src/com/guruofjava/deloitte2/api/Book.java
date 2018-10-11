package com.guruofjava.deloitte2.api;

public class Book {

	int no_of_pages,current_page;
	String title,author, publisher;	   
	boolean isOpen,isClose;
	public Book()
	{
		no_of_pages = 100;
		current_page = 0;
		title = "Meluha";
		author = "Amish";
		publisher = "Penguin Publication House";
		isOpen = false;
		isClose = true;
	}
	public Book(int n,int c,String t,String a,String pb)
	{
		no_of_pages = n;
		current_page = c;
		title = t;
		author = a;
		publisher = pb;
		isOpen = false;
		isClose = true;
	}
	public void open()
	{
		isOpen = true;
		isClose = false;
	}
	public void open(int page_num)
	{
		current_page = page_num;
	}
	public void close()
	{
		isOpen = false;
		isClose = true;
	}
	public boolean isOpen()
	{
		return isOpen;
	}
	public boolean isClose()
	{
		return isClose;
	}
	public int turnLeft()
	{
		current_page=current_page+2;
		if(current_page > no_of_pages)
			return -1;
		else
			return current_page;
	}
	public int turnRight()
	{
		current_page=current_page-2;
		if(current_page < 0)
			return -1;
		else
			return current_page;
	}

}

