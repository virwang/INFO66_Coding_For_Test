/**
   Filename: ScannerExample.java
     Author: Shelley Lapkowski
       Date: Sept 12, 2024 4:28:41 p.m.
Description: This will demonstrate use of the scanner object to
             get input from the user
 */
package com.example;


import java.util.Scanner;

public class ScannerExample
{
	public static void main(String[] args)
	{
		//Initilize vars
		String firstName, lastName, address;
		char likePizza;
		
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//Title the program
		System.out.println("\t\t\t\tWelcome my Information Gathering Session!");
		System.out.println("\t\t\t\t*****************************************");

		//input values from user
		System.out.println("Enter your first name:");
		firstName = input.next();
		
		//input values from user
		System.out.println("Enter your last name:");
		lastName = input.next();

		//use nextLine to flush EOL character from buffer
		input.nextLine();
		
		//input values from user
		System.out.println("Enter your address:");
		address = input.nextLine();

		//input values from user
		System.out.println("Do you like pizza?");
		likePizza = input.next().charAt(0);
		
		//display user's info
		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Address " + address);
		System.out.println("Like pizza? " + likePizza);
		
		//close the scanner object
		input.close();
		
	}
}
