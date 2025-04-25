
/**
*Filename: BabyNames.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 7, 2025 4:07:45 p.m.
*Description:
*/

import java.util.Scanner;
//import com.

/**
 * 
 */
public class BabyNames
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner inputScanner = new Scanner(System.in);
		String gender = "";

		System.out.println("\tPlease tell me the gender of your baby.\n\t Please enter boy, girl or unisex.");
		String[] genders =
		{ "boy", "girl", "unisex" };

		gender = inputScanner.nextLine();

		while (true)
		{
			System.out.println("Please enter boy, girl or unisex.");
			gender = inputScanner.nextLine().trim().toLowerCase();

			boolean isValid = false;
			for (String g : genders)
			{
				if (g.equals(gender))
				{
					isValid = true;
					break;
				}
			}

			if (isValid)
			{
				System.out.println("The gender you entered is: " + gender);
				break;
			} else
			{
				System.err.println("Invalid input. Please enter boy, girl, or unisex.");
			}
		}

		System.out.println("End of program.");
		inputScanner.close();
	}

}
