package com.guruofjava.deloitte2.inheritance;

public abstract class Animal {
	boolean alive;
	{
		alive = true;
	}
	public void eat()
	{
		System.out.println("Animal is Eating");
		
	}
	/*public void move(int distance)
	{
		System.out.println("Animal is moving");
		
	}*/
	public abstract void move(int distance);
	public void run(int distance) {
		// TODO Auto-generated method stub
		
	}
	public void jump(int lenght) {
		// TODO Auto-generated method stub
		
	}
	
		
	

}
