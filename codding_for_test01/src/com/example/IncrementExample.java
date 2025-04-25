package com.example;

/**
       File: IncrementExample.java
     Author: Shelley Lapkowski
       Date: Sep 8, 3:30:32 p.m.
Description:  Demo of Increment operator (post and pre increment)
 */
public class IncrementExample
{

	public static void main(String[] args)
	{
	
		//Examples of values of variable using both pre & post increment
		int count1 = 15;
  	int count2 = 15;
  	int count3 = 15;
  	
  	System.out.println("Values of all count vars initially set to 15");
  	System.out.println("The value of count1 (count1) is " + count1);	
  	System.out.println("The value of count2 (count2++) is " + count2++);  	
  	System.out.println("The value of count2 (count2) is " + count2);
  	System.out.println("The value of count3 (++count3) is " + ++count3);
	
  	/* Example #1 of pre & post increment when using
  	   in an expression adding the same variable (num1)
  	   Note the values of num1 before and after expression
  	   as well as value in result (num3)
  	*/  	
  	int num1 = 15;
  	System.out.println("\nOriginal value of num1 = " + num1);
  	
  	int num3 = num1++  +  ++num1;
  	
  	System.out.println("Expression: num3 = num1++  +  ++num1");
  	
  	System.out.println("\nvalue of num3 (answer) is " + num3 + " (15 + 17)");
  	System.out.println("value of num1 now is " + num1);	 
     
    /* Example of #2 of pre & post increment when using 
       in an expression which adds 2 different variables (num4 & num5)
       Note we get a different results even though initial values are
       set to 15 in both examples
    */
    
  	int num4 = 15;
  	int num5 = 15;
  	
  	System.out.println("\nOriginal value of num4 = " + num4);
  	System.out.println("Original value of num5 = " + num5);
  	
    int num6 = num4++  +  ++num5;
    
    System.out.println("Expression: num6 = num4++  +  ++num5");
    System.out.println("\nvalue of num6 (answer) is " + num6 + " (15 + 16)");
    System.out.println("value of num4 now is " + num4);
    System.out.println("value of num5 now is " + num5);	
   
	}

}
