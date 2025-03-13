package com.example;
/**
   Filename: HouseHunting.java
     Author: Shelley Lapkowski
       Date: Sep 15, 1:34:54 p.m.
Description: This program will help an agent determine which type of 
             house his client is interested in.
 */

/*
  Pseudocode
 
 1.  Title the program
 2.  Instantiate a Scanner object
 3.  ask the user what kind of house they want(single family, duplex, condo, etc)
 4.  ask what minimum price user would like to pay
 5.  ask what maximum price user would like to pay
 6.  ask user how many bedrooms they would like
 7.  ask user how many bathrooms they would like
 8.  ask user if they would like to have a garage (y or n)
 9. ask user if they would want a pool(boolean)
 10. ask user where they want the house located
 11. print out a report of the results
 */

import java.util.Scanner;

public class HouseHunting
{

	public static void main(String[] args)
	{

		//Declare variables
		Scanner input = new Scanner(System.in);
		String houseType = "";
		int minPrice, maxPrice, numBed;
		int numBath;
		char hasGarage;
		boolean hasPool;
		String location;
		
		//Title the program
		System.out.println("\t\t\t\tWelcome to my House Hunting program!");
		System.out.println("\t\t\t\t************************************");

		//Get values from user
		System.out.println("Please enter the type of house you would like (ie. single family, duplex, condo, etc.)?");
		houseType = input.nextLine();
		
		System.out.println("Please enter the minimum price you would like to pay?");
		minPrice = input.nextInt();
		
		System.out.println("Please enter the maximum price you would like to pay?");
		maxPrice = input.nextInt();
		
		System.out.println("Please enter the number of bedrooms you would like?");
		numBed = input.nextInt();
		
		System.out.println("Please enter the number of bathrooms you would like?");
		numBath = input.nextInt();

		//flush EOL character out of buffer since I have a nextInt
		//followed by nextLine
		input.nextLine();

		System.out.println("Would you like the house to have a garage (Y or N)?");
		hasGarage = input.nextLine().charAt(0);
				
		System.out.println("Would you like the house to have a pool (true or false)?");
		hasPool = input.nextBoolean();

		//flush EOL character out of buffer
		input.nextLine();

		System.out.println("Enter your preferred location?");
		location = input.nextLine();
		
		//Display results
		System.out.println("\nHere is your perfect house:\n");
		System.out.println("Type of house: " + houseType);
		System.out.println("Minimum price: " + minPrice);
		System.out.println("Maximum price: " + maxPrice);		
		System.out.println("Number of bedrooms: " + numBed);
		System.out.println("Number of bathrooms: " + numBath);
		System.out.println("Garage: " + hasGarage);
		System.out.println("Pool: " + hasPool);
		System.out.println("Location: " + location);

		//close scanner object
		input.close();
	}

}
