package com.example;
/**
*Filename: SwimmingAnalyzer.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 28, 2025 3:15:12 p.m.
*Description: For user to prepare for the swimming 100m free-style race.
*	User Input: gender (male or female), swimming times
*/

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public class SwimmingAnalyzer_v_Midterm
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.##");

		// User input
		String gender = "";
		int swimmingTimesNumber = 0;
		ArrayList<Double> swimmintTimesArr = new ArrayList<Double>();

		/**
		 * Double compare same: 0 larger: 1 smaller: -1
		 */

		// Caculate
		double avgSwimtimes = 0.0;
		double fastestSwimtime = 0.0;
		double slowestSwimTime = 0.0;
		double differSwimTime = 0.0;

		System.out.println("Yun-Jiung Wang's Swimming Time Analyzer!");
		System.out.println("*************************************************************************");

		System.out.println("Please enter the gender:");
		gender = scanner.nextLine();
		if (!gender.equals("male") && !gender.equals("female"))
		{
			scanner.close();
			System.err.println("Gender only allows male and female. Please enter again! Note: case mattters!");
			return;
		}

		System.out.println("Please enter the swim times you will be recording:");
		swimmingTimesNumber = scanner.nextInt();
		if (swimmingTimesNumber < 2)
		{
			scanner.close();
			System.err.println("SwimmingTimesNumber should enter integer and larger or equal to 2. Please enter again!");
			return;
		}

		// add value into swimmingTimes array
		for (int i = 0; i < swimmingTimesNumber; i++)
		{
			System.out.println("Enter swimming time in sec for time " + (i + 1) + " and press enter:");
			scanner.nextLine();
			swimmintTimesArr.add(i, scanner.nextDouble());
		}

		swimmintTimesArr.forEach(it -> System.out.println("swim time: " + it));
		for (int i = 0; i < swimmintTimesArr.size(); i++)
		{
			if (swimmintTimesArr.get(i) <= 0)
			{
				System.err.println("Swim time should be grater than 0.");
				scanner.close();
				break;
			}
		}

		scanner.close();

		avgSwimtimes = caculateAvergeSwimtime(swimmintTimesArr);
		fastestSwimtime = cacluateFastestSwimtime(swimmintTimesArr);
		slowestSwimTime = cacluateSlowestSwimtime(swimmintTimesArr);
		differSwimTime = caculateSwimtimeRange(swimmintTimesArr);

		System.out.println("Here are your results:\n");
		System.out.println("Your average number of calories in a day is: " + df.format(avgSwimtimes));
		System.out.println("Your fastest time was: " + df.format(fastestSwimtime));
		System.out.println("Your slowest time was: " + df.format(slowestSwimTime));
		System.out.println("Your range (difference between fastest and slowest) was: " + df.format(differSwimTime));

		switch (gender)
		{
		case "male":
			if (fastestSwimtime < 51.71)
			{
				System.out.println("Your fastesr time is better than the" + gender + "'s world record! Wow!");
			} else if (fastestSwimtime == 51.71)
			{

			}

			break;

		default:
			if (fastestSwimtime < 51.71)
			{
				System.out.println("Your fastesr time is better than the" + gender + "'s world record! Wow!");
			} else if (fastestSwimtime == 51.71)
			{
				System.out.println("");
			}
			break;
		}

		System.out.println("\nYour fastest time is the same as the " + gender + "'s world record!");
	}

	/**
	 * First method, caculateAvergeSwimtime
	 * 
	 * @param inputArr
	 * @return Method Name:cacluateSwimTime Purpose: Accepts: SwimmingAnalyzer
	 *         Returns:double
	 *         
	 *        Methods: week 6
	 */
	public static double caculateAvergeSwimtime(ArrayList<Double> inputArr)
	{
		double sumSwimtime = 0.0;

		for (int i = 0; i < inputArr.size(); i++)
		{
			sumSwimtime += inputArr.get(i);
		}

		return sumSwimtime / inputArr.size();
	}

	// Second method, accept array
	public static double cacluateFastestSwimtime(ArrayList<Double> inputArr)
	{
		double fastestSwimtime = inputArr.get(0);

		for (int i = 0; i < inputArr.size(); i++)
		{
			// if fastestSwimtime is larger than the coming swim time
			if (Double.compare(fastestSwimtime, inputArr.get(i)) > 0)
			{
				fastestSwimtime = inputArr.get(i);
			}
		}
		return fastestSwimtime;
	}

//Third method, accept array
	public static double cacluateSlowestSwimtime(ArrayList<Double> inputArr)
	{
		double slowestSwimtime = inputArr.get(0);

		for (int i = 0; i < inputArr.size(); i++)
		{
			// if fastestSwimtime is smaller than the coming swim time
			if (Double.compare(slowestSwimtime, inputArr.get(i)) < 0)
			{
				slowestSwimtime = inputArr.get(i);
			}
		}
		return slowestSwimtime;
	}

	// Fourth method, accept array
	public static double caculateSwimtimeRange(ArrayList<Double> inputArr)
	{
		double fastestSwimtime = inputArr.get(0);
		double slowestSwimtime = inputArr.get(0);

		for (int i = 0; i < inputArr.size(); i++)
		{
			// if minSwim is smaller than the coming swim time
			if (Double.compare(fastestSwimtime, inputArr.get(i)) > 0)
			{
				fastestSwimtime = inputArr.get(i);
			}

			if (Double.compare(slowestSwimtime, inputArr.get(i)) < 0)
			{
				slowestSwimtime = inputArr.get(i);
			}
		}

		return slowestSwimtime - fastestSwimtime;
	}

}
