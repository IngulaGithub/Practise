package com.practice;

public class Prac3 {
	
	String run(int a,String name)
	{
		int b=3;
		System.out.println(b);
		return "JAVA"; 
	}

	public static void main(String[] args) {
		Prac3 p=new Prac3();
             String STAY = p.run(3,"say");
             System.out.println(STAY);
	}

}
