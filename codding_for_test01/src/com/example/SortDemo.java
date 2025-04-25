package com.example;

import java.util.Arrays;

/*
     File Name: Sorting.java
        Author: Shelley Lapkowski
          Date: Oct. 19, 2021 10:15:11 a.m.
   Description: This class will call on all our methods in the SortHelperMethods class in 
                order to sort our arrays.
*/

public class SortDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		int [] simpleArray = new int[100000];
		SortHelperMethods.populateArray(simpleArray,  10000, 1000);
		int [] secondArray = SortHelperMethods.copyArray(simpleArray);
		int [] thirdArray = SortHelperMethods.copyArray(simpleArray);
		int [] fourthArray = SortHelperMethods.copyArray(simpleArray);
		int [] fifthArray = SortHelperMethods.copyArray(simpleArray);
		
	  //time trial on bubbleSort
		long startTime = SortHelperMethods.takeTimeSnapshot();
		SortHelperMethods.bubbleSort(simpleArray);
		long stopTime = SortHelperMethods.takeTimeSnapshot();
		double totalTime = (stopTime - startTime) / 1000.0;
		System.out.println("Bubble Sort took " + totalTime + " seconds to sort.");
		
		//time trial on enhancedBubbleSort
		startTime = SortHelperMethods.takeTimeSnapshot();
		SortHelperMethods.enhancedBubbleSort(fourthArray);
		stopTime = SortHelperMethods.takeTimeSnapshot();
		totalTime = (stopTime - startTime) / 1000.0;
		System.out.println("enhancedBubbleSort took " + totalTime + " seconds to sort.");
		
		//time trial on shortCircuitBubbleSort
		startTime = SortHelperMethods.takeTimeSnapshot();
		SortHelperMethods.shortCircultBubbleSort(thirdArray);
		stopTime = SortHelperMethods.takeTimeSnapshot();
		totalTime = (stopTime - startTime) / 1000.0;
		System.out.println("shortCircuitBubbleSort took " + totalTime + " seconds to sort.");
		
	  //time trial on selectionSort
		startTime = SortHelperMethods.takeTimeSnapshot();
		SortHelperMethods.selectionSort(fifthArray);
		stopTime = SortHelperMethods.takeTimeSnapshot();
		totalTime = (stopTime - startTime) / 1000.0;
		System.out.println("selectionSort took " + totalTime + " seconds to sort.");
		

		//time trials on built in Arrays.sort
		startTime = SortHelperMethods.takeTimeSnapshot();
		Arrays.sort(secondArray);
		stopTime = SortHelperMethods.takeTimeSnapshot();
		totalTime = (stopTime - startTime) / 1000.0;
		System.out.println("Arrays.sort took " + totalTime + " seconds to sort.");		
		
	}
}
