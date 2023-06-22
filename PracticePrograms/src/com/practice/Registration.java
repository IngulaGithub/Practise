package com.practice;

public class Registration {
	OTTPlatform signup(char select)
	{
		if(select=='H')
		{
			return new Hotstar();	
		}
		else if(select=='N')
		{
		return new Netflix();
		}
		else
		{
		return new Amazonprime();
		}
		
	}
}