package com.guruofjava.deloitte2.api;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "java";
		String b = "Java";
		String s3 = new String("java");
		
		if(a==b)
		{
			System.out.println("a and b are same");
		}
		else{
			System.out.println("a and b are not same");
		}
		
		System.out.println(a.contains("aa"));
		System.out.println(a.startsWith("ja"));
		System.out.println(a.startsWith("av",1));
		System.out.println(a.endsWith("eva"));
		System.out.println(a.endsWith("ava"));
		String s2 = " ";
		System.out.println(s2.isEmpty());
		System.out.println(s2.trim().isEmpty());
	}
	private void main1() {
		// TODO Auto-generated method stub

	
	String s1 = "Java Programming Language";
	System.out.println(s1.length());
	System.out.println(s1);
	System.out.println(s1.charAt(9));
	System.out.println(s1.indexOf('a'));
	System.out.println(s1.lastIndexOf('a'));
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	s1= s1+" "+"Created by James";
	System.out.println(s1);
	System.out.println(s1.hashCode());
	System.out.println(s1.substring(10));
	System.out.println(s1.substring(10, 12));
	}

}
