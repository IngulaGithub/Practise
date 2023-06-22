package com.practice;

public class Prac {

	public static void main(String[] args) {
		System.out.println(4);
		 char code = 'a';
		System.out.println("reult:11" + code);
		code='b';
		//System.out.println("reult:12" + code);
		System.out.println('a'+'b');
		System.out.println('a');
		System.out.println('a'+1);
		System.out.println("a");
		
		int a=2;
		int res=++a + ++a;
		System.out.println(res);
		System.out.println(a);
		int b=2;
		int res1=b++ + b++;
		System.out.println(res1);
		System.out.println(b);
		
		int num=5;
		//num=num+7
		num+=7;
		System.out.println(num);
		
		if(code=='a'|| code=='g')
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
		for(int i=2;i<=10;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			continue;
			}
			
		}
		

	}

}
