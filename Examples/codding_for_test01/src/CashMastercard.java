import java.util.Scanner;

/**
 * Filename: CashMastercard.java 
 * Author: Yun-Jiung Wang 
 * Date: Jan 31, 2025 3:06:34 p.m. 
 * Description: This program will determine the cash back amount of
 * any purchases made using your visa.
 */

public class CashMastercard
{
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount you purchase: $");

		double purchase = scanner.nextDouble();
		double creditAmt = 0.0;	
		String decition = "";
//		DecimalFormat dFormat = new DecimalFormat("");

		// Credit amount Logic
		if (purchase < 500.00)
		{
			//			System.out.println("credit 2%");
			creditAmt = purchase * (2.00 / 100);

		} else if (purchase >= 500.00 && purchase < 2500.00)
		{
			//			System.out.println("credit 2.4%");
			creditAmt = purchase * (2.40 / 100);
		} else
		{
			//			System.out.println("received 3.55%");
			creditAmt = purchase * (3.55 / 100);
		}

		System.out.println("Your total cash amount earned is $" + creditAmt);
		
		//Clean up the input line
		scanner.nextLine();

		System.out.println("Would you like to apply the money to your purchase or save it for a future credit?"
				+ "(y) got purchase (n) for futire credit:");
	
		
		// Avoid Exception
		try
		{
			decition = String.valueOf(scanner.nextLine().charAt(0));
		} catch (Exception e)
		{
			System.err.println("Input error. Message: " + e.getMessage());
			scanner.close();
			return;
		}

		// Make sure user only input n or y
		if (!decition.equals("n") && !decition.equals("y"))
		{
			System.err.println("Input error. Please enter either (y) got purchase or (n) for futire credit.");
			scanner.close();
			return;
		}

		//Whether user wants to apply cash credit now
		if (decition.equals("y"))
		{
			double finalAmt = purchase - creditAmt;
			System.out.println("You have decided to apply your cash credit to your purchase of $" + purchase);			
			System.out
					.println("Your final bill after applying your cash credit amount of $" + creditAmt + " is now " + finalAmt);
			System.out.println("Thank you for your purchase.");
		} else
		{
			System.out
					.println("You have opted to save your cash credit for future purchases.\tYour current purchase amount is $"
							+ purchase + ".");
			System.out.println("You have a credit of $" + creditAmt + " that you may use for future purchases.");
		}

		//Close the scanner
		scanner.close();
	}
}
