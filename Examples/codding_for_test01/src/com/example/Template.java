/**
*Filename: Template.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 25, 2025 8:22:38 p.m.
*Description:
*/
package com.example;

/**
 * 
 */
public class Template
{
	public static void main(String[] args)
	{
		Template template = new Template();
		int num = 0;

		// Example 1 - calling a method and passing by value
		System.out.println("Value of num in main method before calling addFiveToNumber method: " + num);
		template.addFiveToNumber(num);
		// print results after method call, notice value of original var is the same
		System.out.println("Value of num in main method after calling addFiveToNumber method: " + num);
	}

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

}
