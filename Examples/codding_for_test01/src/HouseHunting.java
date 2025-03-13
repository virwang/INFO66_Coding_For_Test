import java.util.Scanner;

/**
 * FileName: HouseHunting Author: Yun-Jiung Wang Date: 2025-01-23 3:04 p.m.
 * Description:The goal of this code is to find an ideal place to buy using
 * Scanner
 */
public class HouseHunting
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		int bedrooms;
		int bathrooms;
		String homeType;
		float minPrice;
		float maxPrice;
		char hasGarage;
		boolean pool;
		String whichCity;

		// Title the program
		System.out.println("\t\t\t\tWelcome my Information Gathering Session!");
		System.out.println("\t\t\t\t*****************************************");

		System.out.println("What kind of house you want? Single Family, Duplex, Condo, etc.?");
		homeType = scanner.nextLine();
		System.out.println("Number of bedrooms? Please type a number.");
		bedrooms = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Number of bathrooms? Please type a number.");
		bathrooms = scanner.nextInt();
		scanner.nextLine();
		System.out.println("What is the minimum price you would like to pay?");
		minPrice = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("What is the maximum price you would like to pay?");
		maxPrice = scanner.nextFloat();
		scanner.nextLine();
		System.out.println("Would you like to have a garage? Please type 'Y' or 'N'.");
		hasGarage = scanner.next().charAt(0);
		System.out.println("Should houses have pool? Please use True or False.");
		pool = scanner.nextBoolean();
		scanner.nextLine();
		System.out.println("Where should the the house be located – What city?");
		whichCity = scanner.nextLine();
		scanner.close();

		// Words to print out
//		String resultString = "My ideal home is " + homeType + " has " + bedrooms + " bedrooms, " + bathrooms
//				+ " bathrooms," + " and the mininum price is " + minPrice + " the maximum price is " + maxPrice + " garage is ";
//
//		if (String.valueOf(hasGarage).equals("Y"))
//		{
//			resultString += "required.";
//		} else
//		{
//			resultString += "optional.";
//		}
//
//		resultString += " Pool is ";
//
//		if (pool)
//		{
//			resultString += "needed.";
//		} else
//		{
//			resultString += " optional.";
//		}
//
//		resultString += " And the home should be located in " + whichCity;
//		System.out.println(resultString);

		System.out.println("Here is your perfect house:\n");
		System.out.println("Type of house: " + homeType);
		System.out.println("min price of house: " + minPrice);
		System.out.println("max price of house: " + maxPrice);
		System.out.println("hasGarage : " + hasGarage);
		System.out.println("hasPool: " + pool);
		System.out.println("Location: " + whichCity);
	}

}
