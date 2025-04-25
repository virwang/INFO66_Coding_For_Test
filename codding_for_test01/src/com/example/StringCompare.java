package com.example;
import java.util.Scanner;

public class StringCompare
{
	public static void main(String[] args)
	{
		//Declare scanner object
		Scanner input = new Scanner(System.in);
		
		//Declare & initialize Strings in different ways but same value
		
		// If we create string object using "new" guarantees new String
		// object is created 
		String newStringObject = new String("Shelley");  
		
		/*
		If we create using shortcut way, with string literal instead,
		Java references internal pool of Java string objects, if a string
		with same content already exists, simply adds another reference to 
		that existing string.  Thus even though 2 variables only 1 string
		is created.
		*/
		
		String stringLiteral = "Shelley";
		String stringLiteral2 = "Shelley";
		
		//Read one string in from the user
		System.out.println("To test our string comparisons, enter the name Shelley");
		String stringFromScanner = input.next();
		
		System.out.println ("Let's Compare Strings In Many Different Ways!");
		System.out.println ("");
		
		// Do comparisons, remember we're comparing references / memory locations
		if (stringLiteral == stringLiteral2)
		{
			System.out.println("Using comparison operator, stringLiteral " + stringLiteral + " equals stringLiteral2 " + stringLiteral2);
		}
		else
		{
			System.out.println("Using comparison operator, stringLiteral " + stringLiteral + " does NOT equal stringLiteral2 " + stringLiteral2);			
		}
	
		if (stringLiteral == stringFromScanner)
		{
			System.out.println("Using comparison operator, stringLiteral " + stringLiteral + " equals stringFromScanner " + stringFromScanner);
		}
		else
		{
			System.out.println("Using comparison operator, stringLiteral " + stringLiteral + " does NOT equal stringFromScanner " + stringFromScanner);			
		}
		
		
		if (newStringObject == stringLiteral)
		{
			System.out.println("Using comparison operator, newStringObject " + newStringObject + " equals stringLiteral " + stringLiteral);
		}
		else
		{
			System.out.println("Using comparison operator, newStringObject " + newStringObject + " does NOT equal stringLiteral " + stringLiteral);			
		}
		
		System.out.println();
		
		if (stringLiteral.equals(stringLiteral2))
		{
			System.out.println("Using String.equals method, stringLiteral " + stringLiteral + " equals stringLiteral2 " + stringLiteral2);
		}
		else
		{
			System.out.println("Using String.equals method, stringLiteral " + stringLiteral + " does NOT equal stringLiteral2 " + stringLiteral2);			
		}
	
		if (stringLiteral.equals(stringFromScanner))
		{
			System.out.println("Using String.equals method, stringLiteral " + stringLiteral + " equals stringFromScanner " + stringFromScanner);
		}
		else
		{
			System.out.println("Using String.equals method, stringLiteral " + stringLiteral + " does NOT equal stringFromScanner " + stringFromScanner);			
		}

		
		
		if (newStringObject.equalsIgnoreCase(stringLiteral))
		{
			System.out.println("Using String.equals method, newStringObject " + newStringObject + " equals stringLiteral " + stringLiteral);
		}
		else
		{
			System.out.println("Using String.equals method, newStringObject does NOT equal stringLiteral");			
		}
		
	}
}
