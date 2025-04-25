
/**
*Filename: Muffins.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 4, 2025 3:31:57 p.m.
*Description: 
* This java code is for a muffin backing company, using for their order system.
* Customers will have to provide their name, size of tray, muffinType (only 1 type per order) and number of order
* With the more order numbers, customer will receive more discount.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Muffins
{

	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		// Display formatter
		DecimalFormat df = new DecimalFormat("0.##");

		// User Input Informations
		String customerName, muffinType, traySize = "";
		int maxMuffinPerTray, availableTrays, orderNum = 0;

		// Calculated number
		double price = 0.0;
		int affordableMuffins = 0;
		// Minimum Trays that requires to complete the order
		int minRequireTray = 0;

		int actualMadeMuffins = 0;

		// Instructions for User to provide
		System.out.println("Please provide informations below:\n");
		System.out.println("Please enter the customer name:");
		customerName = userInput.nextLine();

		if (!validInputString(customerName, "customer name", userInput))
		{
			return;
		}

		System.out.println("Enter the type of muffin " + customerName + " would like us to bake:");
		muffinType = userInput.nextLine();
		if (!validInputString(customerName, "Muffin Type", userInput))
		{
			return;
		}

		System.out.println("Enter the size of tray the company should use for this order: ");
		traySize = userInput.nextLine();
		if (!validInputString(traySize, "Size of Tray", userInput))
		{
			return;
		}

		// prevent error
		try
		{
			System.out.println("Please state that how many muffins " + customerName + " would like to order: ");
			orderNum = userInput.nextInt();

			if (!validInputInteger(orderNum, "order number", userInput))
			{
				return;
			}

			// Clear buffer
			userInput.nextLine();

			System.out.println("Enter the maximum number of muffins per tray:");
			maxMuffinPerTray = userInput.nextInt();

			if (!validInputInteger(maxMuffinPerTray, "maximum number of muffins per tray", userInput))
			{
				return;
			}

			// Clear buffer
			userInput.nextLine();

			System.out.println("Enter the number of muffin trays that are available:");
			availableTrays = userInput.nextInt();
			if (!validInputInteger(availableTrays, "availableTrays", userInput))
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
		if (orderNum < 100)
		{
			price = 1.25;
		} else if (orderNum >= 100 && orderNum < 200)
		{
			price = 1.10;
		} else
		{
			price = .95;
		}

		minRequireTray = (int) Math.ceil((double) orderNum / maxMuffinPerTray);
		affordableMuffins = maxMuffinPerTray * availableTrays;

		// Order Information
		System.out.println("\t\tHere are the results......");
		System.out.println("\nCustomer Name is: " + customerName);
		System.out.println("Muffin type is: " + muffinType);
		System.out.println("Size of tray is: " + traySize);
		System.out.println("Maximum muffins per tray: " + maxMuffinPerTray);
		System.out.println("We need at least: " + minRequireTray + " trays to meet the order number of muffins.");
		System.out.println("Avaliable trays: " + availableTrays);
		System.out.println("Customer " + customerName + " ordered " + orderNum + " muffins.");
		System.out.println("Based on the order number, price of each muffin is $" + price);

		// All of the trays are occupied
		if (availableTrays < 1)
		{
			System.err.println("All of the muffin Trays are occupied. Sorry, we cannot take your order.");
			System.out.println("We will refun $" + df.format(orderNum * price) + " to customer " + customerName);
			System.out.println("Number of unmade muffins: " + orderNum);
			System.out.println("Percentage of unmade Muffins: 100%");
			System.out.println("Percentage of fullfillment: 0%");
			System.out.println("\n\t\t -- fine-tune --");
			return;
		}

		if (affordableMuffins > orderNum)
		{
			actualMadeMuffins = orderNum;
		} else if (affordableMuffins < orderNum)
		{
			actualMadeMuffins = affordableMuffins;
		} else
		{
			actualMadeMuffins = orderNum;
		}

		// Can't filled the order
		if (orderNum > affordableMuffins)
		{
			System.out.println("Company cannot offer more than " + affordableMuffins + " muffins.\nCompany will refund $"
					+ df.format(price * (orderNum - affordableMuffins)) + " to customer " + customerName + ".");
			System.out.println("Numbers of unmade muffines: " + (orderNum - affordableMuffins));
			System.out.println("Toal Price (before refund): $" + df.format(orderNum * price));
			System.out.println("Refund Amount: $" + df.format(price * actualMadeMuffins));
			System.out.println("Total Price (after refund): $" + df.format(actualMadeMuffins * price));
			System.out.println("Percentage of unmade muffins: "
					+ df.format(((orderNum - actualMadeMuffins) / (double) orderNum) * 100) + "%");
			System.out.println(
					"Percentage of order fullfillment is " + df.format((actualMadeMuffins / (double) orderNum) * 100) + "%");

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
		if (inputInt <= 0 && !paramName.equals("availableTrays"))
		{
			System.err.println(paramName + " should be positive integer");
			scanner.close();
			return false;
		} else if (paramName.equals("availableTrays") && inputInt < 0)
		{
			System.err.println(paramName + " should not lesser than 0");
			scanner.close();
			return false;
		}
		return true;
	}
	
}