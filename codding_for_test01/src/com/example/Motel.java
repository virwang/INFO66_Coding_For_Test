package com.example;
/*
     File Name: Motel.java
        Author: Shelley Lapkowski
          Date: Apr. 4, 10:29:47 a.m.
   Description: This class extends from Accommodation and follows the specifications from the
                uml diagram
*/
public class Motel extends Accommodation
{
	private String bedType;
	private int unitNumber;
	
	public Motel(String location, String bedType, int unitNumber)
	{
		super("motel", location);
		this.bedType = bedType;
		this.unitNumber = unitNumber;
	}
	
	//accessor and mutator methods
	public int getUnit()
	{
		return this.unitNumber;
	}	
	public String getBedType()
	{
		return this.bedType;
	}
	public void setUnit(int unitNumber)
	{
		this.unitNumber = unitNumber;
	}
	public void setBedType(String bedType)
	{
		this.bedType = bedType;
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
				               "\nIt is identified by unit number " + this.unitNumber + " and has a " + 
				               this.bedType + " bed provided for your comfort.");
	}
}
