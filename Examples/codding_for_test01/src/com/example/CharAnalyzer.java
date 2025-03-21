package com.example;

//import the input/output class for File type objects
import java.io.File;
import java.io.FileNotFoundException;
/**
   Filename: CharAnalyzer.java
     Author: Shelley Lapkowski
       Date: Feb 28, 2023 5:33:57 p.m.
Description: This program will read a text file, one character at time,
 						 and display the the content of the text file and total
 						 counts for the # of lowercase letters, letters, digits
 						 and whitespace in the file.
 						 
 						 Also shows the user of setting the delimiter to an empty string "", 
						 which means we DON'T FILTER OUT ANYTHING, NOT EVEN WHITE SPACE. 
						 This allows us to count whitespace characters when we use a 
						 scanner method, such as .next, which normally would consume
						 whitespace.
						 
						 Keep in mind you must have a file called "message.txt" in the project folder
						 of the project you place this class in, since we are using relative path,
						 for code to work as is. 
 */
import java.util.Scanner;

public class CharAnalyzer
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//initialize variables
		int numLowerCase = 0;
		int numWhiteSpaces = 0;
		int numDigits = 0;
		int numLetters = 0;

		//create a file and scanner object
		File inputFile = new File("message.txt");
		Scanner fileReader = new Scanner(inputFile);
		//set up a delimiter to an empty string, nothing gets filtered out
		fileReader.useDelimiter("");
		
		//create string buffer object to look at contents of text file as a string
		StringBuffer charList = new StringBuffer();
		
		//loop through contents of file and do analysis
		while (fileReader.hasNext())
		{
			char charIn = fileReader.next().charAt(0);
			//add each character into string buffer as we go
			charList.append(charIn);
			
			//evaluate each individual character and update counts
			if (Character.isDigit(charIn))
			{
				numDigits++;
			}
			
			if (Character.isLetter(charIn))
			{
				numLetters++;
			}
			
			if (Character.isWhitespace(charIn))
			{
				numWhiteSpaces++;
			}

			if (Character.isLowerCase(charIn))
			{
				numLowerCase++;
			}
		}
		
		//Display results
		System.out.println("The content of my file was: \n\n" 
		+ new String(charList));
		System.out.println("Analysis of File");
		System.out.println("****************");
		System.out.println("# of Letters is " + numLetters);
		System.out.println("# of LowerCase Letters is " + numLowerCase);
		System.out.println("# of Digits is " + numDigits);
		System.out.println("# of Whitespace is " + numWhiteSpaces);
		
		//Close scanner object
		fileReader.close();
		
	}

}
