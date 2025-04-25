package com.example;
/*
     File Name: Apartment.java
        Author: Shelley Lapkowski
          Date: Apr. 4, 2023 10:20:07 a.m.
   Description: This class extends Accommodation and implements the class according to the
                uml specifications
*/
public class Apartment extends Accommodation
{
	private int bedrooms;
	private int bathrooms;
	private int unitNumber;
	
	public Apartment(String location, int bedrooms, int bathrooms, 
			             int unit)
	{
		super("apartment", location);
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.unitNumber = unit;
	}
	
//accessor and mutator methods
	public int getBedrooms()
	{
		return this.bedrooms;
	}
	public int getBaths()
	{
		return this.bathrooms;
	}
	public int getUnit()
	{
		return this.unitNumber;
	}
	public void setBedrooms(int bedrooms)
	{
		this.bedrooms = bedrooms;
	}
	public void setBaths(int bathrooms)
	{
		this.bathrooms = bathrooms;
	}
	public void setUnit(int unit)
	{
		this.unitNumber = unit;
	}
	/*
  Method Name:  describeAccommodation
      Purpose:  to describe what the accomodation is all about
      Accepts:  nothing
      Returns:  void
 */
	@Override
	public void describeAccomodation()	
	{
		System.out.println("This " + this.getType() + " dwelling is located at " + this.getLocation() +
				               "\nIt is identified by unit number " + this.unitNumber + " and has " 
				               + this.getBaths() + " bathroom(s) and " + this.getBedrooms() + " bedroom(s).");
	}
}
