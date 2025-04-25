package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Filename: TestMethods.java Author: Shelley Lapkowski Date: Feb 8, 2023
 * 4:51:29 p.m. Description: Tests various methods contained within the same
 * class Demonstrates the following concepts: Passing by value vs Passing By
 * Reference Object / instance method vs Static / Class method
 */
public class TestMethodsPassByValueAndReference
{

	public static void main(String[] args)
	{
		int num = 0;
		int[] mainIntArray =
		{ 1, 2, 3 };
		List<Integer> testIntList = new ArrayList<Integer>();
		testIntList.add(1);
		testIntList.add(2);
		testIntList.add(3);
		testIntList.add(4);

		// Create instance of object for my addFiveToNumber method
		TestMethodsPassByValueAndReference myTestMethods = new TestMethodsPassByValueAndReference();

		// Example 1 - calling a method and passing by value
		// print results after method call
		System.out.println("Example 1 - Passing Arguments by Value");
		System.out.println("Value of num in main method before calling addFiveToNumber method: " + num);
		// call method to add 5 to our number, passing by value since argument is a
		// primitive data type
		myTestMethods.addFiveToNumber(num);
		// print results after method call, notice value of original var is the same
		System.out.println("Value of num in main method after calling addFiveToNumber method: " + num);
		System.out.println();

		// Example 2 - calling method and passing by reference
		System.out.println("Example 2 - Passing Arguments by Reference");

		// Display values in array
		for (int index = 0; index < mainIntArray.length; index++)
		{
			System.out.println("Value of mainIntArray in main method before calling method: " + mainIntArray[index]);
		}

		// call method, array is passed by reference
		multiplyArrayValues(mainIntArray, 2);
		System.out.println();
		System.out.println("Calling method multplyArrayValues, method will multiply values by 2.");
		System.out.println();

		// print values in array after calling methods, values are changed
		for (int index = 0; index < mainIntArray.length; index++)
		{
			System.out.println("Value of mainIntArray in main method after calling method: " + mainIntArray[index]);
		}
		
		//print List 
		testIntList.forEach(it-> System.out.println("\n\ttestIntList before calling method "+ it));
		
//		multiplyArrayValues(testIntList);
		multiplyArray(testIntList);
		
		testIntList.forEach(it-> System.out.println("\n------\n\ttestIntList after calling method "+ it));

	} // end main

	/*
	 * Method: addFiveToNumber Purpose: adds 5 to any integer number Accepts:
	 * integer
	 */
	public void addFiveToNumber(int num)
	{
		System.out.println("Value of num in addFiveToNumber method before adding 5 is: " + num);
		num = num + 5;
		System.out.println("Value of num in addFiveToNumber method after adding 5 is: " + num);
	}

	/*
	 * Method: multiplyArrayValues Purpose: muliplies all values in array by a
	 * number Accepts: array of integers, integer
	 */
	public static void multiplyArrayValues(int[] intArray, int MultiplyBy)
	{
		// Loop through array and multiply each value by MultiplyBy argument
		for (int index = 0; index < intArray.length; index++)
		{
			intArray[index] = intArray[index] * MultiplyBy;
		}
	}

	/*
	 * Method: multiplyArrayValues Purpose: muliplies all values in array by a
	 * number Accepts: array of integers, integer
	 */
	public static void multiplyArrayValues(List<Integer> intArray)
	{
		int MultiplyBy = 2;
		// Loop through array and multiply each value by MultiplyBy argument
		for (int index = 0; index < intArray.size(); index++)
		{
			intArray.set(index, intArray.get(index) * MultiplyBy);
		}
	}
	
	public static void multiplyArray(List<Integer> intArray)
	{
		List<Integer> tempIntegers = new ArrayList<Integer>(intArray);
		int MultiplyBy = 2;
		// Loop through array and multiply each value by MultiplyBy argument
		for (int index = 0; index < tempIntegers.size(); index++)
		{
			tempIntegers.set(index, tempIntegers.get(index) * MultiplyBy);
		}
	}

} // end class
