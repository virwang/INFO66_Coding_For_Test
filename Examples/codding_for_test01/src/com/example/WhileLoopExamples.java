package com.example;
/**
   Filename: WhileLoopExamples.java
     Author: Shelley Lapkowski
       Date: May 28, 2024 1:14:38 p.m.
Description: Examples of simple while loops 
 */
import java.util.Scanner;

public class WhileLoopExamples
{

	public static void main(String[] args)
	{

		//Loop 1 Example - While loop being controlled by counter
		System.out.println("Example 1 - Loop controlled by a counter");
		int counter = 0;
		
		//repeat loop as long as value of of counter is less than 10
		while (counter < 10)
		{
			counter++;
			System.out.println("In loop 1, using a counter.  Counter = " + counter);
		}
		
		//Loop 2 Example - While loop with sentinel value
		System.out.println("\nExample 2 - While loop using sentinel value of zero");
		int userInput = -1;
		int sum = 0;
		Scanner myInput = new Scanner(System.in);
		
		while (userInput != 0)
		{
			System.out.println ("Enter an integer number, enter zero to quit");
			userInput = myInput.nextInt();
			
			sum = sum + userInput;
		}
			
		System.out.println("The sum is: " + sum);
	
		//Loop 3 Example - Do While loop controlled by sentinel value
		//Do while loop will always execute at least 1 time
		System.out.println("\nExample 3 - do while loop using sentinel value of zero");
		userInput = 0;
		sum = 0;
		
		//repeat loop until the value of userInput is not equal to zero
		//and keep a running total of the sum of the numbers entered by user
		do
		{
			System.out.println ("Enter an integer number, enter zero to quit");
			userInput = myInput.nextInt();
			
			sum = sum + userInput;
		} while (userInput != 0);
			
		//print results
		System.out.println("The sum is: " + sum);
	}

}
