package com.example;
/*
     File Name: BubbleSortDemo1.java
        Author: Shelley Lapkowski
          Date: Mar 12, 2023 10:15:11 a.m.
   Description: This class will demonstrate the "swap" algorithm used 
                for Bubble sort
*/

public class BubbleSortDemo1
{
	public static void main(String[] args)
	{
		//create an array
		int myArray [] = {25, 20, 15, 10, 5};
		
		System.out.println("Before swap ...");
		PrintArray(myArray);
		
		//check / swap each element of array
		for (int index = 0; index < myArray.length - 1; index++)
		{
			if(myArray[index] > myArray[index + 1])
			{
				int temp = myArray[index];
				myArray[index] = myArray[index + 1];
				myArray[index + 1] = temp;
			}
		}
		
		System.out.println("\nAfter swap ...");
		PrintArray(myArray);
	}
	
	public static void PrintArray(int [] anArray)
	{
		for (int index=0; index < anArray.length; index++)
		{
			System.out.print(anArray[index] + " ");
		}
	}
}
