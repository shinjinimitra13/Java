package com.guruofjava.deloitte2.inheritance;

public abstract class  Cat extends Animal implements Hunter,Jumper,Runner {

	

	@Override
	public void run(int distance) {
		// TODO Auto-generated method stub
		System.out.println("cat running "+ distance + " distance");
		
	}

	@Override
	public void jump(int length) {
		// TODO Auto-generated method stub
		System.out.println("cat jumping "+length+" distance");
		
	}

	@Override
	public void hunt() {
		// TODO Auto-generated method stub
		System.out.println("cat is hunting");
		
	}

	@Override
	public void move(int distance) {
		// TODO Auto-generated method stub
		System.out.println("cat is moving: "+ distance+" distance");}
		public static void main(String[] args)
		{
			
		}
		
		
	

}
