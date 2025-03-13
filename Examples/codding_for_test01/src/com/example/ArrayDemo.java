package com.example;
/**
   Filename: ArrayDemo.java
     Author: Shelley Lapkowski
       Date: Jun 4, 2024 1:04:49 p.m.
Description:  
 */
public class ArrayDemo
{

	public static void main(String[] args)
	{

		//Example #1 - declare and instantiate array in 2 lines of code
		//declare an array to build ages
		int [] ageArray1;
		
		//instantiate the array that will hold 3 integer values
		ageArray1 = new int[3];
		
		//Example #1 - hard coding values
		ageArray1[0] = 3;
		ageArray1[1] = 3;
		ageArray1[2] = 4;
		
		//Example #2 - creating array with shortcut method to hold 6 integers
		int [] ageArray2 = {2, 3, 10, 5, 3, 7};
		
		//Loop through array1 to get sum of numbers in array and 
		//then calculate average
		int sum = 0;
		for (int index = 0; index < ageArray1.length; index ++)
		{
			sum = sum + ageArray1[index];
		}
		
		double avg1 = (double)sum / ageArray1.length;
		
		//reset sum to zero before calculating sum for 2nd array
		sum = 0;
		
		//Loop through array1 to get sum of numbers in array and 
		//then calculate average
		for (int index = 0; index < ageArray2.length; index ++)
		{
			sum = sum + ageArray2[index];
		}
		
		double avg2 = (double)sum / ageArray2.length;

		//print results
		System.out.println("The averages of ageArray1: " + avg1);
		System.out.println("The averages of ageArray2: " + avg2);
	}

}
