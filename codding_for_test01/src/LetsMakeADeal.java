
/**
*Filename: LetsMakeADeal
*	Author: Yun-Jiung Wang
*		 Date: Jan 24, 2025 2:32:09 p.m.
* Description:
*/

import java.util.Scanner;


public class LetsMakeADeal
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter doorNumbers to win a prize. Please enter with string (one, two, three, etc. ...)");

		String doorNumber = input.nextLine();
		if (!doorNumber.isEmpty() && !doorNumber.isBlank())
		{
			//Case doesn't matter, so, I turn input String to lower case
			doorNumber = doorNumber.trim().toLowerCase();
		}

		String prizeString = "You got a prize from door " + doorNumber;

		switch (doorNumber)
		{
		case "one":
			System.out.println(prizeString);
			break;
		case "two":
			System.out.println(prizeString);
			break;
		case "three":
			System.out.println(prizeString);
			break;
		case "four":
			System.out.println(prizeString);
			break;
		case "five":
			System.out.println(prizeString);
			break;
		default:
			System.err.println("The input door number is not valid.");
			break;
		}

		input.close();
	}

}
