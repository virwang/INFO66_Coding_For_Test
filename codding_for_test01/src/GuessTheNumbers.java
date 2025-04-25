
/**
*Filename: GuessTheNumbers.java
*	Author: Yun-Jiung Wang
*		 Date: Jan 31, 2025 2:29:39 p.m.
*Description:
* This is a Guess The Number game.
* This program will generate a random number between 1 & 100
* and allow the user to guess the correct number.
* 
*/

import java.util.Scanner;

public class GuessTheNumbers
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		/**
		 * User will enter Levels 1,2,3 (Number) and 1 - Easy, 2 - Medium, 3 - Hard
		 */
		System.out.println(
				"\t Please enter your level. Type one of the three options: \n\n\t\t\t 1 (Easy), 2 (Medium), 3 (Hard)");

		Scanner scanner = new Scanner(System.in);
		int level = 0;
		int[] levelDef =
		{ 1, 2, 3 };

		// prevent user input error
		try
		{
			level = scanner.nextInt();
		} catch (Exception e)
		{
			System.err.println("Error occurs! Message:" + e);
			scanner.close();
			return;
		}

		// make sure user only enter 1,2,3
		if (!levelDef.equals(level))
		{
			System.out
					.println("Please run the project again and enter the number of the level: 1 (Easy), 2 (Medium), 3 (Hard)!");
			scanner.close();
			return;
		}

		// Confirm
		System.out.println("\t You chose Level " + level + "!\n");

		// Clear the inputs
		scanner.nextLine();

		// Create the random number
		int randomNum = (int) (Math.random() * 100 + 1);

		// ToDo: using for test, pending delete
		System.out.println("random number: " + randomNum);

		// If user guess wrong, we should provide a hint. ex: The number is too high or
		// too low
		System.out.println("\t\t The random number is created, please guess a number: ");

		switch (level)
		{
		case 1:
			// unlimited guesses
			while (true)
			{
				int inputNum = scanner.nextInt();

				if (guessResult(inputNum, randomNum) == false)
				{
					continue;
				}
				break;
			}
			break;
		case 2:// level, 2 10 chances

			for (int i = 0; i < 10; i++)
			{
				int inputNum = scanner.nextInt();
				if (guessResult(inputNum, randomNum) == false)
				{
					continue;
				}
			}

			break;
		case 3:

			// level 3, 3 chances
			for (int i = 0; i < 3; i++)
			{
				int inputNum = scanner.nextInt();
				if (guessResult(inputNum, randomNum) == true)
				{
					break;
				}
			}
			break;
		default:
			break;
		}

		System.out.println("The randon number is " + randomNum);
		System.out.println("End of the Guess");
		// Close the scanner
		scanner.close();
		System.err.println("Scanner is Close!");
	}

	/**
	 * The guess logic, confirm whether the user input number is correct
	 * 
	 * @param inputNum  user input number
	 * @param randomNum generate number
	 * @return true or false
	 */
	static boolean guessResult(int inputNum, int randomNum)
	{
		if (inputNum < randomNum)
		{
			System.out.println("The number you guess is too small Please guess a bigger one.");
			return false;
		} else if (inputNum > randomNum)
		{
			System.out.println("The number you guess is too big. Please guess a smaller one.");
			return false;
		} else
		{
			System.out.println("You won - you guessed the number correctly!");
			return true;
		}
	}

}
