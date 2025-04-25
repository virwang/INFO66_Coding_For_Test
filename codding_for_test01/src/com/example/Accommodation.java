package com.example;
/*
     File Name: Accommodation.java
        Author: Shelley Lapkowski
          Date: Apr. 4, 2023 10:00:57 a.m.
   Description: This class will serve as an abstract version of all accommodations as per
                the uml diagram
*/
public abstract class Accommodation
{
	private String location;
	private String type;
	
	public Accommodation(String type, String location)
	{
		this.location = location;
		this.type = type;
	}
	
	//access and mutator methods
	public String getLocation()
	{
		return this.location;
	}
	public String getType()
	{
		return this.type;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	
	/*
	  Method Name:  describeAccommodation
	      Purpose:  to describe what the accomodation is all about
	      Accepts:  nothing
	      Returns:  void
	 */
	public abstract void describeAccomodation();	
}
