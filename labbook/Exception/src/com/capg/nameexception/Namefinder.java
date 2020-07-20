package com.capg.nameexception;

public class Namefinder {

	public String FullName(String first, String last) throws NameException
	{
		if(first == null ||last == null)
	{
		throw new NameException("name is blank");
	}
		
		return first+last;
		
	}
}
