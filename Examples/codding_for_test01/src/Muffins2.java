
/**
*Filename: Muffins.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 4, 2025 3:31:57 p.m.
*Description: 
* This java code is for a muffin backing company, using for their order system.
* Customers will have to provide their name, size of tray, MUFFIN_TYPE (only 1 type per order) and number of order
* With the more order numbers, customer will receive more discount.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Muffins2
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		// Display formatter
		DecimalFormat df = new DecimalFormat("0.##");

		// User Input Informations, should not be changed
		final String CUSTOMER_NAME, MUFFIN_TYPE, TRAY_SIZE;
		final int MAX_MUFFIN_PER_TRAY, AVALIABLE_TRAYS,ORDER_NUM;

		// Calculated number
		double price = 0.0;
		int affordableMuffins = 0;
		// Minimum Trays that requires to complete the order
		int minRequireTray = 0;

		int actualMadeMuffins = 0;

		// Instructions for User to provide
		System.out.println("Please provide informations below:\n");
		System.out.println("Please enter the customer name:");
		CUSTOMER_NAME = userInput.nextLine();

		if (!validInputString(CUSTOMER_NAME, "customer name", userInput))
		{
			return;
		}

		System.out.println("Enter the type of muffin " + CUSTOMER_NAME + " would like us to bake:");
		MUFFIN_TYPE = userInput.nextLine();
		if (!validInputString(CUSTOMER_NAME, "Muffin Type", userInput))
		{
			return;
		}

		System.out.println("Enter the size of tray the company should use for this order: ");
		TRAY_SIZE = userInput.nextLine();
		if (!validInputString(TRAY_SIZE, "Size of Tray", userInput))
		{
			return;
		}

		// prevent error
		try
		{
			System.out.println("Please state that how many muffins " + CUSTOMER_NAME + " would like to order: ");
			ORDER_NUM = userInput.nextInt();

			if (!validInputInteger(ORDER_NUM, "order number", userInput))
			{
				return;
			}

			// Clear buffer
			userInput.nextLine();

			System.out.println("Enter the maximum number of muffins per tray:");
			MAX_MUFFIN_PER_TRAY = userInput.nextInt();

			if (!validInputInteger(MAX_MUFFIN_PER_TRAY, "maximum number of muffins per tray", userInput))
			{
				return;
			}

			// Clear buffer
			userInput.nextLine();

			System.out.println("Enter the number of muffin trays that are available:");
			AVALIABLE_TRAYS = userInput.nextInt();
			if (!validInputInteger(AVALIABLE_TRAYS, "AVALIABLE_TRAYS", userInput))
			{
				return;
			}

		} catch (Exception e)
		{
			System.err.println("Input Error! Please enter Integer. Message:" + e);
			userInput.close();
			return;
		}

		// Close Scanner
		userInput.close();

		// Define each Muffins' price by the ordered amount of Muffin
		if (ORDER_NUM < 100)
		{
			price = 1.25;
		} else if (ORDER_NUM >= 100 && ORDER_NUM < 200)
		{
			price = 1.10;
		} else
		{
			price = .95;
		}

		minRequireTray = (int) Math.ceil((double) ORDER_NUM / MAX_MUFFIN_PER_TRAY);
		affordableMuffins = MAX_MUFFIN_PER_TRAY * AVALIABLE_TRAYS;

		// Order Information
		System.out.println("\t\tHere are the results......");
		System.out.println("\nCustomer Name is: " + CUSTOMER_NAME);
		System.out.println("Muffin type is: " + MUFFIN_TYPE);
		System.out.println("Size of tray is: " + TRAY_SIZE);
		System.out.println("Maximum muffins per tray: " + MAX_MUFFIN_PER_TRAY);
		System.out.println("We need at least: " + minRequireTray + " trays to meet the order number of muffins.");
		System.out.println("Avaliable trays: " + AVALIABLE_TRAYS);
		System.out.println("Customer " + CUSTOMER_NAME + " ordered " + ORDER_NUM + " muffins.");
		System.out.println("Based on the order number, price of each muffin is $" + price);

		// All of the trays are occupied
		if (AVALIABLE_TRAYS < 1)
		{
			System.err.println("All of the muffin Trays are occupied. Sorry, we cannot take your order.");
			System.out.println("We will refun $" + df.format(ORDER_NUM * price) + " to customer " + CUSTOMER_NAME);
			System.out.println("Number of unmade muffins: " + ORDER_NUM);
			System.out.println("Percentage of unmade Muffins: 100%");
			System.out.println("Percentage of fullfillment: 0%");
			System.out.println("\n\t\t -- fine-tune --");
			return;
		}

		if (affordableMuffins > ORDER_NUM)
		{
			actualMadeMuffins = ORDER_NUM;
		} else if (affordableMuffins < ORDER_NUM)
		{
			actualMadeMuffins = affordableMuffins;
		} else
		{
			actualMadeMuffins = ORDER_NUM;
		}

		// Can't filled the order
		if (ORDER_NUM > affordableMuffins)
		{
			System.out.println("Company cannot offer more than " + affordableMuffins + " muffins.\nCompany will refund $"
					+ df.format(price * (ORDER_NUM - affordableMuffins)) + " to customer " + CUSTOMER_NAME + ".");
			System.out.println("Numbers of unmade muffines: " + (ORDER_NUM - affordableMuffins));
			System.out.println("Toal Price (before refund): $" + df.format(ORDER_NUM * price));
			System.out.println("Refund Amount: $" + df.format(price * actualMadeMuffins));
			System.out.println("Total Price (after refund): $" + df.format(actualMadeMuffins * price));
			System.out.println("Percentage of unmade muffins: "
					+ df.format(((ORDER_NUM - actualMadeMuffins) / (double) ORDER_NUM) * 100) + "%");
			System.out.println(
					"Percentage of order fullfillment is " + df.format((actualMadeMuffins / (double) ORDER_NUM) * 100) + "%");

			System.out.println("\n\t\t -- fine-tune --");
			return;
		}

		// Able to fill the order
		System.out.println("Company has made " + actualMadeMuffins + " muffins.");
		System.out.println("Percentage of order fullfillment is 100%");
		System.out.println("Total price is $" + df.format(price * actualMadeMuffins));
		System.out.println("\n\t\t -- fine-tune --");
	}

	/**
	 * Validate input String
	 * 
	 * @param inputString
	 * @param paramName
	 * @param uScanner
	 * @return
	 */
	public static boolean validInputString(String inputString, String paramName, Scanner uScanner)
	{
		if (inputString == null || inputString.isBlank())
		{
			System.err.println("Please enter " + paramName);
			uScanner.close();
			return false;
		}
		return true;
	}

	
	/**
	 * Method Name: validInputInteger
	 * Purpose: To valid the input Integer
	 * Accepts:int,int,Scanner
	 * Returns:
	 * @param inputInt
	 * @param paramName
	 * @param scanner
	 * @return
	 */
	public static boolean validInputInteger(int inputInt, String paramName, Scanner scanner)
	{
		if (inputInt <= 0 && !paramName.equals("AVALIABLE_TRAYS"))
		{
			System.err.println(paramName + " should be positive integer");
			scanner.close();
			return false;
		} else if (paramName.equals("AVALIABLE_TRAYS") && inputInt < 0)
		{
			System.err.println(paramName + " should not lesser than 0");
			scanner.close();
			return false;
		}
		return true;
	}
	
}