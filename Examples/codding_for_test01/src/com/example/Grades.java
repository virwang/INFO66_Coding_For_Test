package com.example;

/**
   Filename: Grades.java
     Author: Shelley Lapkowski
       Date: Feb 27, 2025 3:47:35 p.m.
Description: Determine letter grade, midterm grade (S or U) and whether
 	         student passed or failed a course based on percentage 
 		     entered by the user and display
 		      this info.
 */

import java.util.Scanner;

public class Grades
{
	public static void main(String[] args)
	{
		//Declare variables & set initial values where needed
		Scanner input = new Scanner(System.in);
		double perGrade;
		int intPerGrade;
		String letterGrade = "";
		char midtermGrade;
		
		// Get percentage grade from user
		System.out.println("What was your grade (as a percentage)?");
		perGrade = input.nextDouble();

		// If user enters invalid percentage, display appropriate message
		if (perGrade < 0 || perGrade > 100)
		{
			System.out.println("Grade invalid, must enter a value between 0 and 100!");
		}
		else // Percentage is valid
		{
			// Round percentage up to a whole (integer) number, no decimals		
			intPerGrade = (int)(perGrade + .5);

			//Determine letter grade for course
			if (intPerGrade >= 90)
			{
				letterGrade = "A+";
			}
			else if (intPerGrade >= 80)
			{
				letterGrade = "A";
			}
			else if (intPerGrade >= 75)
			{
				letterGrade = "B+";
			}
			else if (intPerGrade >= 70)
			{
				letterGrade = "B";
			}
			else if (intPerGrade >= 65)
			{
				letterGrade = "C+";
			}
			else if (intPerGrade >= 60 )
			{
				letterGrade = "C";
			}
			else if (intPerGrade >= 55)
			{
				letterGrade = "D+";
			}
			else if (intPerGrade >= 50)
			{
				letterGrade = "D";
			}
			else
			{
				letterGrade = "F";
			}
				
			// Determine midterm grade
			if (intPerGrade >= 60)
			{
				midtermGrade = 'S';
			}
			else
			{
				midtermGrade = 'U';
			}
			
			//Display letter grade
			System.out.println ("You have achieved a " + letterGrade 
					+ " in this course.");
			
			//Display midterm results, messages will vary depending on:
			//midterm grade and whether student is passing or failing 
			//course
			
			//Student received a "S" midterm grade
			if (midtermGrade == 'S')
			{
				System.out.println ("Congratulations!  Your midterm grade is S "
						+ "(satisfactory).  \nAll is well in the world.");
			}
			//Student failed course
			else if (letterGrade.equals("F"))
			{
				System.out.println ("Your midterm grade is U (unsatisfactory).");
				System.out.println ("You are failing this course, you need to do "
						+ "better - go see your Professor!");
			}
			//Student is passing course but did not receive a "S" midterm grade
			else
			{
				System.out.println ("Your midterm grade is U (unsatisfactory).");
				System.out.println ("Your grade is borderline, you need to do better - go see your Professor!");				
			}
		} //end else for valid percentage

		//Close scanner object	
		input.close();
		
	} // end main method
} //end class








