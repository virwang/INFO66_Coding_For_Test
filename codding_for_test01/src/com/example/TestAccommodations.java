package com.example;
/*
     File Name: TestAccommodations.java
        Author: Shelley Lapkowski
          Date: Apr. 4, 2023 10:35:20 a.m.
   Description: This class will create accommodations from all the subclasses in order
                to demonstrate polymorphic behavior.
                Based on Accommodations practice exercise.
*/
public class TestAccommodations
{
	public static void main(String[] args)
	{
		//Create new array of type Accommodation and assign an object of each 
		//subclass type to array of type Accommodation
		Accommodation [] myDwellings = new Accommodation[5];
		myDwellings[0] = new Cave("the mountainous regions of the Himalayans.", 4);
		myDwellings[1] = new SingleFamily("15 Oxford Street West, London, Ontario", 3, 2);
		myDwellings[2] = new Apartment("32 Kipps Lane, London, Ontario", 2, 1, 301);
		myDwellings[3] = new BoardingHouse("16 German Way, Berlin, Germany", 16);
		myDwellings[4] = new Motel("25 Commercial Boulevard, Fort Lauderdale, Florida", "king sized", 413);
		
		
		//Set up a loop to call the describeAccommodation method for each of 
		//the objects
		//The following loop will demonstrate true polymorphic behavior 
		//as I access each subclass object through the parent reference.  
		//Remember myDwellings is an accommodation array, containing all the 
		//different types of accommodations.
		System.out.println("Polymorphic behavior - accessing each subclass using parent reference.");
		System.out.println("Calls abstract method describeAccommodation method\n");
		for(int index = 0; index < myDwellings.length; index++)
		{
			myDwellings[index].describeAccomodation();
			System.out.println();
		}		
		
		//Answer to question, list methods accessible & not accessible as you
		//look at each element of the myDwellings array in code above
		
		//getClass, getLocation, getType, setLocation, setType are accessible
		//cannot access getNumRooms and setNumRooms from Cave
		//cannot access getNumBeds, getNumBaths, setNumBeds, setNumBaths 
		//from SingleFamily
	  //cannot access getNumBeds, getNumBaths, setNumBeds, setNumBaths, 
		//getUnit, setUnit from Apartment
		//cannot access getUnit or setUnit from BoardingHouse
		//cannot access getBedType, getUnit, setBedType, setUnit from Motel.
	
		//Note: code below is not part of original Exercise instructions, 
		//code to further demonstrate concept

		//This loop will look at each element of Accommodation array, and 
		//create new objects of the appropriate subclass (cave, etc.) in order 
		//to access methods not available to parent / super class Accommodation 
		System.out.println("Non-Polymorphic: Creating New Objects of Subclasses Without Parent Reference\n"
				+ "and Calling Additonal Methods (Getters) Accessible to SubClasses\n");
		for(int index = 0; index < myDwellings.length; index++)
		{
			if(myDwellings[index] instanceof Cave)
			{
				Cave myNewCave = (Cave)myDwellings[index]; 
				System.out.println("This " + myNewCave.getType() + " has " 
				                   + myNewCave.getNumRooms() + " rooms.");
			}
			else if(myDwellings[index] instanceof SingleFamily)
			{
				SingleFamily myFamily = (SingleFamily)myDwellings[index];
				System.out.println("This " + myFamily.getType() + " has " 
													+ myFamily.getBedrooms() +" bedrooms and " 
						              + myFamily.getBaths() + " bathrooms.");
			}
			else if(myDwellings[index] instanceof BoardingHouse)
			{
				BoardingHouse myBoardHouse = (BoardingHouse)myDwellings[index];
				//TODO:
				//add another print statement accessing those subclass methods
			}
			else if(myDwellings[index] instanceof Apartment)
			{
				Apartment myApartment = (Apartment)myDwellings[index];
				//TODO:
				//add another print statement accessing those subclass methods
			}
			else if(myDwellings[index] instanceof Motel)
			{
				Motel myMotel = (Motel)myDwellings[index];
				//TODO:
				//add another print statement accessing those subclass methods
			}
		}		
	}
}
