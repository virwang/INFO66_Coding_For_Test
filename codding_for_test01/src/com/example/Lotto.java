package com.example;
/**
   Filename: Lotto.java
     Author: Shelley Lapkowski
       Date: Oct 2, 2023 12:20:46 p.m.
Description: This will generate 6 random lotto numbers 
 */
/*
 Psuedocode for lotto649
 
 Step One:  Title the program
 Step Two: Declare / instantiate integer array [6]
 Step Three: Generate random numbers 1 to 49 and populate array 
 						 (repeat 6 times for 6 numbers)
 						 As numbers are generated, ensure each new lotto number does not
 						 already exist in my array of numbers
 Step Four: Print contents of array

*/
public class Lotto
{
	public static void main(String[] args)
	{
		//Step One:  Title the program
		System.out.println("\n\t\t\tWelcome to my Quick Pick Lottery Selecter");
		
		//Step Two: create array and intitalize variable to track duplicate numbers
		int [] lottoArray = new int [6];
		int counter;
		
		//Step 3 - populate array with random lotto numbers
		for(int index = 0; index < lottoArray.length; index++)
		{
			lottoArray[index] = (int) (Math.random() * 49 + 1);

			//Step 3, part 2:  
			//check to make sure new number selected does not already exist in array
			//using counter variable and a secondary loop
			counter = 0;
			while(counter < index)
			{
				//if current number is the same as an existing number
				if(lottoArray[index] == lottoArray[counter])
				{
				  //reset lotto number to new random number
					lottoArray[index] = (int)(Math.random() * 49) + 1;
				  //reset counter to zero to start checking at 1st element
					counter = 0;
				}
				else
				{
					//increment counter so next element in array can be checked
					counter++;
				}
			}

		}
		
		//Step Four - print results
		for(int index = 0; index < lottoArray.length; index++)
		{
			System.out.println( lottoArray[index]);
		}
		
	}

}
