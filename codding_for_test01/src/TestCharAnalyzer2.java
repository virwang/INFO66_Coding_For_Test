

//import the input/output class for File type objects
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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

public class TestCharAnalyzer2
{

	static final String TARGET_FILE_NAME = "message.txt";

	public static void main(String[] args) throws FileNotFoundException
	{
		// initialize variables
		int numLowerCase = 0;
		int numWhiteSpaces = 0;
		int numDigits = 0;
		int numLetters = 0;

		String content = "";

		// create a file and scanner object
		File inputFile = new File(TARGET_FILE_NAME);
		Scanner fileReader;

		try
		{
			inputFile.createNewFile();
			fileReader = new Scanner(inputFile);
			PrintWriter printWriter = new PrintWriter(inputFile);
			printWriter.write("Hello World!! How are you? 123456");
			printWriter.close();
		} catch (Exception e)
		{
			// TODO: handle exception
			System.err.println(e);
			return;
		}

		// set up a delimiter to an empty string, nothing gets filtered out
		fileReader.useDelimiter("");

		// create string buffer object to look at contents of text file as a string
		StringBuffer charList = new StringBuffer();

		// loop through contents of file and do analysis
		while (fileReader.hasNext())
		{
			char charIn = fileReader.next().charAt(0);
//			System.out.println("Content of the file: "+ fileReader.next());

			// add each character into string buffer as we go
			charList.append(charIn);

			// evaluate each individual character and update counts
			if (Character.isDigit(charIn))
			{
				numDigits++;
				continue;
			}

			if (Character.isLetter(charIn))
			{
				numLetters++;
				if (Character.isLowerCase(charIn))
				{
					numLowerCase++;
					continue;
				}
				continue;
			}

			if (Character.isWhitespace(charIn))
			{
				numWhiteSpaces++;
				continue;
			}
		}

		// Display results
		System.out.println("Content of the file: " + charList);
		System.out.println("Num of Digits: " + numDigits);
		System.out.println("Num of Lowercase: " + numLowerCase);
		System.out.println("Num of Letters: " + numLetters);
		System.out.println("Num of White space: " + numWhiteSpaces);

		// Close scanner object
		fileReader.close();

	}

}
