package com.example;
/*
     File Name: TwoDArrays.java
        Author: Shelley Lapkowski
          Date: Jan. 30, 2024 10:01:31 a.m.
   Description: This program introduces us to a two dimensional array
*/
public class TwoDArrays
{

	public static void main(String[] args)
	{
		
		/*
		 * Example 1 - 2D to show multiplication times table
		 */
		
		//declare a two d array
		int [][] myTimesTable = new int[15][11];
		
		System.out.println("Example #1 - 2D Array - Multiplication Times Table");
		//populate all the elements of the array.
		for(int rows = 0; rows < myTimesTable.length; rows++)
		{
			for(int columns = 0; columns < myTimesTable[rows].length; columns++)
			{
				myTimesTable[rows][columns] = rows * columns;
			}
		}
		
		//print out the arrays
		for(int rows = 1; rows < myTimesTable.length; rows++)
		{
			for(int columns = 1; columns < myTimesTable[rows].length; columns++)
			{
				System.out.print(myTimesTable[rows][columns] + "\t");
			}
			//do a line return here
			System.out.println();
		}
		
		/*
		 *  Example 2 - creating 2D arrays using 2 different approaches 
		 *  to create array
		 */
		//create array - Approach #1 - declare first then set values
		// 3 rows, 3 cols
		/*
		int [][] myFunArray = new int[3][3];
		myFunArray[0][0] = 10;
		myFunArray[0][1] = 23;
		myFunArray[0][2] = 12;
		myFunArray[1][0] = 55;
		myFunArray[1][1] = 67;
		myFunArray[1][2] = 88;
		myFunArray[2][0] = 33;
		myFunArray[2][1] = 43;
		myFunArray[2][2] = 25;
		*/
	
		
		//Approach # 2 - shortcut approach to a two dimensional array 3 rows / 3 col
		int [][] myFunArray = {{10, 23, 12},
				                   {55, 67, 88},
				                   {33, 43, 25}};
		
		System.out.println("\nExample #2 - 2D array");
		for(int rows = 0; rows < myFunArray.length; rows++)
		{
			for(int columns = 0; columns < myFunArray[rows].length; columns++)
			{
				System.out.print(myFunArray[rows][columns] + "\t");
			}
			//do a line return here
			System.out.println();
		}
		
		
		
		//Example # 3 - can also do a three dimension array, same # of rows / cols
		int [][][] myThreeDArray = new int[5][6][4];
		
		System.out.println("\nExample #3 - 3D array");
		for(int page = 0; page < myThreeDArray.length; page++)
		{
			for(int row = 0; row < myThreeDArray[page].length; row++)
			{
				for(int cols = 0; cols < myThreeDArray[page][row].length; cols++)
				{
					myThreeDArray[page][row][cols] = page;
					System.out.print(myThreeDArray[page][row][cols] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		
	//	Example # 4 - Introducing a ragged array
		int [][] anotherTwoDArray = new int[4][];
		anotherTwoDArray[0] = new int[3];
		anotherTwoDArray[1] = new int[5];
		anotherTwoDArray[2] = new int[4];
		anotherTwoDArray[3] = new int[7];
		
		/*
		//shortcut approach to a ragged array
		int [][] anotherTwoDArray = {{10, 23, 12, 44, 99, 77},
        												 {55, 67, 88},
        												 {33, 43, 25, 30, 26, 55, 15, 29, 22}};
		*/
		
		System.out.println("\nExample #4 - 2D Ragged Array");
		for(int rows = 0; rows < anotherTwoDArray.length; rows++)
		{
			for(int columns = 0; columns < anotherTwoDArray[rows].length; columns++)
			{
				System.out.print(anotherTwoDArray[rows][columns] + "\t");
			}
			//do a line return here
			System.out.println();
		}

	}
}
