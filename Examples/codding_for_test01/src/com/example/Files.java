/**
*Filename: Files.java
*	Author: Yun-Jiung Wang
*		 Date: Mar 4, 2025 2:23:48 p.m.
*Description: Just a practice 
*/
package com.example;

import java.io.File;
import java.io.IOException;

/**
 * 
 */
public class Files
{

	/**
	 * @param args Method Name:main Purpose: Accepts: Files Returns:void
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//
		final String FILE_PATH = "C:\\Users\\virginia\\OneDrive\\Fanshawe_Software and System Information Testing\\Coding For Test\\generdatedFiles\\";
		final String FILE_NAME = "temp.txt";
		File myFile = new File(FILE_PATH + FILE_NAME);
		String os = System.getProperty("os.name").toLowerCase();
		System.out.println("os: " + os);

		//Create file
		try
		{
			myFile.createNewFile();
		} catch (IOException e)
		{
	
			e.printStackTrace();
			System.err.println(e.toString());
			return;
		}

		System.out.println(os.contains("win"));

	}

}
