package com.example;
/**
   Filename: FileReaderExample.java
     Author: Shelley Lapkowski
       Date: Oct 22, 2024 4:13:45 p.m.
Description:  
 */

import java.io.File;
import java.util.Scanner;

public class FileReaderExample
{
	public static void main(String[] args) 
	{
		String word = "";
		System.out.println("This will read and display contents of a text file.");
		
		//Step one - create file object to reference my file
		File fileOne = new File("message.txt");
		
		//use try and block in case of exception FileNotFound
		try 
		{
			//Step 2 - create Scanner object to read the file
			Scanner fileReader = new Scanner(fileOne);
			
			//Step 3 - use Scanner to read the text in the file one word at a time
			while (fileReader.hasNextLine()) 
			{
				word = fileReader.nextLine();
				System.out.println(word);
			}
			
			fileReader.close();
		}
		catch (Exception ex)
		{
			System.out.println("Exception occurred! Message: " + ex.getMessage());
		}
	} //end of main method

}//end of class
