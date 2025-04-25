package com.example;
/*
     File Name: Cave.java
        Author: Shelley Lapkowski
          Date: Apr. 4, 2023 10:06:01 a.m.
   Description: This class extends from Accommodation and follows the specifications outlined
                in our uml diagram
*/
public class Cave extends Accommodation
{
	private int numRooms;
	
	public Cave(String location, int rooms)
	{
		super("Cave", location);
		this.numRooms = rooms;
		
	}
	
	//accessor and mutator method
	public int getNumRooms()
	{
		return this.numRooms;
	}
	public void setNumRooms(int rooms)
	{
		this.numRooms = rooms;
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
		System.out.println("This " + this.getType() + " is located in " 
				+ this.getLocation());
		System.out.println("This " + this.getType() + " has " + this.numRooms 
				+ " rooms.");
	}
}
