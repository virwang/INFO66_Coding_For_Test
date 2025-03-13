package com.example;
/*
     File Name: SortHelperMethods.java
        Author: Shelley Lapkowski
          Date: Feb 13, 2021 8:14:02 a.m.
   Description: This class will contain all the methods needed to sort our arrays
*/

//import the date class
import java.util.Date;
public class SortHelperMethods
{
	/*
  Method Name:  printArray
      Purpose:  to print the contents of an array
      Accepts:  int array
      Returns:  void
	 */
	public static void printArray(int [] anArray)
	{
		for(int index = 0; index < anArray.length; index++)
		{			
			if(index % 10 == 0 && index != 0)
			{
				System.out.println();
			}
			System.out.print(anArray[index] + "\t");
		}
	}
	
	/*
  Method Name:  copyArray
      Purpose:  to create an exact copy of an array
      Accepts:  int array
      Returns:  int array
	 */	
	public static int [] copyArray(int [] anArray)
	{
		int [] newArray = new int[anArray.length];
		for(int index = 0; index < anArray.length; index++)
		{
			newArray[index] = anArray[index];
		}
		return newArray;
	}
	
	/*
  Method Name:  populateArray
      Purpose:  to fill all the elements of our array.
      Accepts:  int array, two ints
      Returns:  void
	 */	
	public static void populateArray(int [] anArray, int high, int low)
	{
		int selection = 0;
		//for loop to work through each elements of our array
		for(int index = 0; index < anArray.length; index++)
		{
			//generate a random number based on the high and low range of values
			selection = (int)(Math.random() * (high - low) + 1) + low;
			anArray[index] = selection;
		}
	}

	/*
  Method Name:  swap
      Purpose:  to swap two elements of an array
      Accepts:  int array, two ints
      Returns:  void
	 */	
	private static void swap(int [] anArray, int a, int b)
	{
		int hold = anArray[a];
		anArray[a] = anArray[b];
		anArray[b] = hold;	
	}
	
	/*
  Method Name:  bubbleSort
      Purpose:  to sort an array from lower to higher values
      Accepts:  int array
      Returns:  void
	 */	
	public static void bubbleSort(int [] anArray)
	{
		for(int idx = 0; idx < anArray.length; idx++)
		{
			for(int index = 0; index < anArray.length -1; index++)
			{
				if(anArray[index] > anArray[index + 1])
				{
					swap(anArray, index, index + 1);
				}
			}
		}
	}
	
	/*
  Method Name:  shortCircuitBubbleSort
      Purpose:  to sort an array from lower to higher values
      Accepts:  int array
      Returns:  void
	 */	
	public static void shortCircultBubbleSort(int [] anArray)
	{
		int swapCounter = 0;
		for(int idx = 0; idx < anArray.length; idx++)
		{
			swapCounter = 0;
			for(int index = 0; index < anArray.length -1; index++)
			{
				if(anArray[index] > anArray[index + 1])
				{
					swap(anArray, index, index + 1);
					swapCounter++;
				}
			}
			if(swapCounter == 0)
			{
				break;
			}
		}
	}
	
	/*
  Method Name:  enhancedBubbleSort
      Purpose:  to sort an array from lower to higher values
      Accepts:  int array
      Returns:  void
	 */	
	public static void enhancedBubbleSort(int [] anArray)
	{
		
		for(int idx = 0; idx < anArray.length; idx++)
		{			
			for(int index = 0; index < anArray.length - (idx + 1); index++)
			{
				if(anArray[index] > anArray[index + 1])
				{
					swap(anArray, index, index + 1);					
				}
			}		
		}
	}
	
	
	/*
  Method Name:  SelectionSort
      Purpose:  to sort an array from lower to higher values
      Accepts:  int array
      Returns:  void
	 */	
	public static void selectionSort(int [] anArray)
	{
		//create a couple of holding variables
		int currentMaxIndex, currentMaxValue;
		//set up a for loop to compare the values
		for(int outerLoop = anArray.length - 1; outerLoop >= 0; outerLoop--)
		{	
			//assume the largest value is at the end of the array
			currentMaxValue = anArray[outerLoop];
			currentMaxIndex = outerLoop;
			//set up an inner loop to actually look for the largest value
			for(int innerLoop = outerLoop -1; innerLoop >= 0; innerLoop--)
			{
				//compare the values against the remaining elements
				if(currentMaxValue < anArray[innerLoop])
				{
					currentMaxValue = anArray[innerLoop];
					currentMaxIndex = innerLoop;
				}
			}		
			if(currentMaxIndex != outerLoop)
			{
				swap(anArray, outerLoop, currentMaxIndex);
			}
		}
	}

	/*
  Method Name:  takeTimeSnapshot
      Purpose:  to freeze a moment in time so it can be compared to another moment in time.
      Accepts:  nothing
      Returns:  long
	*/
	public static long takeTimeSnapshot()
	{
		Date myDate = new Date();
		return myDate.getTime();		
	}
}
