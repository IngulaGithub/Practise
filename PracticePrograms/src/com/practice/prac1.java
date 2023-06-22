package com.practice;

class prac0 {
	void run()
	{
		System.out.println("i am running");
	}
	static int c=20;
	/*int y=60;
	
	prac0(float x)
	{
	
	
	
		
		System.out.println("constructor of super class");
	}*/
}
	 class prac2 extends prac0{
		 void run()
			{
				System.out.println("i am sleeping");
			}
/*	int y=30;
		prac2(int i)
		{
			super(14.2f);
			System.out.println("constructor of sub class");
			System.out.println(y);
			System.out.println(super.y);
		*/}
	//}
	public class prac1 {
	public static void main(String[] args) {
		
		prac2 p=new prac2();
		System.out.println(p.c);
		p.run();
		
      
			    
			  }
}		

	


