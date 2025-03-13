
/**
*Filename: Lets_Code_0214.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 14, 2025 3:37:31 p.m.
*Description:
*/

import java.util.Scanner;

public class TestMax_0214
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner sacScanner = new Scanner(System.in);

		System.out.println("Please enter integer 1: ");
		int num1 = sacScanner.nextInt();

		sacScanner.nextLine();
		System.out.println("Please enter integer 2: ");
		int num2 = sacScanner.nextInt();
		
		sacScanner.close();
		
		if (num1 == num2)
		{
			System.out.println("Input Integer 1 equals Integer 2. Integer 1 = Integer 2. Integer is: " + num1);
			return;
		}

		getMaxInt(num1, num2);
	}

	public static void getMaxInt(int num1, int num2)
	{
		String responseString = "The larger value of " + num1 + " and " + num2 + " is ... ";
		int compareResult = Math.max(num1, num2);
		if (compareResult == num1 || compareResult == num2)
		{
			System.out.println(responseString + compareResult);
		} else
		{
			System.out.println(responseString + num2);
		}
	}
}
