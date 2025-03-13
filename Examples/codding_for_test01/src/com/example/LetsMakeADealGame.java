package com.example;
/**
   File Name: LetsMakeADeal.java
      Author: Shelley Lapkowski
        Date: Jan 16, 2023 2:41:19 p.m.
 Description: This program will mimic the game show lets make a deal using a 
              Switch-Case construct with string variables for door #
 */

import java.util.Scanner;

public class LetsMakeADealGame
{

	public static void main(String[] args)
	{
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare and initialize rest of my variables
		String door = "";
		String prize = "";
				
		//title the program 
		System.out.println("\t\t\t\tWelcome to Lets Make A Deal");
		System.out.println("\t\t\t\t***************************");


		//Get door number from user 
		System.out.println("Please choose door number - one, two, three, four or five");
		door = input.next();
		
		//Switch statement to determine the prize based on String datatype
		switch(door.toLowerCase())
		{
			case "one":
			{
				prize = "a brand new car! Congratulations!";
				break;
			}
			case "two":
			{
				prize = "a grizzly bear.  Be careful!";
				break;
			}
			case "three":
			{
				prize = "an iPhone.  Congratulations!";
				break;
			}
			case "four":
			{
				prize = "a trip to Hawaii.  Congratulations - don't forget your sunscreen!";
				break;
			}
			case "five":
			{
				prize = "a bag of chips. Hope you really like chips!";
				break;
			}
			default:
			{
				prize = "nothing.  That door does not exist!"
						+ "\nNext time enter a door from one to five if you want to win!";
			}
		}
		
		//Display results
		System.out.println("You won " + prize);
	
		//Close scanner
		input.close();
	}

}
