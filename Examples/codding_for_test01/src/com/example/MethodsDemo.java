package com.example;

import java.util.Scanner;

/**
 * Filename: MethodsDemo.java Author: Shelley Lapkowski Date: Feb 11, 2025
 * 3:59:00 p.m. Description: This class will demo some methods
 */
public class MethodsDemo
{

	// INSTRUCTION:
	// Create your own method called AddNum that accepts 2 integer parameters
	// add them together and return the sum of the 2 numbers

	// In main call your method and print out the results
	public static void main(String[] args)
	{

		myPrint("Shelley is very very lazy!");
		myPrint("She won't even type System.out!");

		int sum = AddNum(15, 25);
		myPrint("The sum is: " + sum);

		// or we can print this way!
		System.out.println(AddNum(15, 25));

	} // end of main method

	// my custom print method
	public static void myPrint(String message)
	{
		System.out.println(message);
	}

	// adds 2 numbers together
	public static int AddNum(int num1, int num2)
	{
		int sum = num1 + num2;
		return sum;
	}

	//overload method
	public static double AddNum(int num1, int num2, int num3)
	{
		int sum = num1 + num2 + num3;
		return new Double(sum);
	}

	
	//method without static: object like Scanner method; have to create an object to use methods
	Scanner tempScanner = new Scanner(System.in);
	
} // end of class
