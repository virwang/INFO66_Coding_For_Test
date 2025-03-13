package com.example;

import java.text.DecimalFormat;

public class Temp
{

	public static void main(String[] args)
	{
		int res = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("What is the day today?");
		int first = 17;
		int second = 5;

		DecimalFormat dFormat = new DecimalFormat("0.####");
		DecimalFormat df2 = new DecimalFormat("#,###.####");
//		while (res==0 || res<5)
//		{
//			res++;
//			System.out.println("print while loop; "+res);
//		} 
//		
//		do
//		{
//			res--;
//			System.out.println("print once; "+res);
//		} while (res<0 && res>-3);

		String responsString = responseString();
		System.out.println("Response String");

		Temp temp = new Temp();
		temp.noResponse();

//		for (int i = 0; i < 1; i++)
//		{
////			int radom = 15 + (int) (Math.random() * (100 - 15+1));
//			double tempDouble = 1000 + (Math.random() * (2150 - 1000+1));
////			System.out.println("i= " + i + " ;Random: " + radom);
//			System.out.println("df1:"+dFormat.format(tempDouble));
//			System.out.println("Format2: "+ df2.format(tempDouble));
//			System.out.println("Floor: "+Math.floor(tempDouble));
//			System.out.println("Ceil: "+Math.ceil(tempDouble));
//			System.out.println("Round: "+Math.round(tempDouble));			
//		}

//		double results = (double) first / second;
//		System.out.println("Original result: " + results);
//		System.out.println(dFormat.format(results));
//		System.out.println(Math.pow(results, 5));

//		if ((second > 10 && second == 5) || first > second)
//		{
//			System.out.println("true!");
//		} else
//		{
//			System.out.println("false!");
//		}

//		if ((second > 10 || second < 2) && (second == 5 || first > second))
//		{
//			System.out.println("true!");
//		} else
//		{
//			System.out.println("false!");
//		}

//		int[][] testArray = new int[2][3];

//		System.out.println(testArray.length);

//		int testRam = (int) (Math.random() * ((20.5 - 10.0) + 10.0));
//		System.out.println(testRam);
//		double random = Math.random() * ((20.5 - 10.1) + 10.1);
//		System.out.println(random);
		// 小數點第二位
//		double ransomFormtat = Math.round(random * 100.0) / 100.0;
//		System.out.println(ransomFormtat);
//		// 小數點第三位
//		double randomFormat1 = Math.round(random * 1000.0) / 1000.0;
//		System.out.println(randomFormat1);

//		int[] arr1 =
//		{ 1, 2, 35, 7, 12, 0 };
//		String[] fruiteArray =
//		{ "Banana", "Apple", "Tomato", "Coco" };
		// Mon - Milk tea
//		String[] foodStrings =
//		{ "Milk Tea", "Bobba", "tea", "Hot Coco", "Macha" };

//		int[][] templateArrays = new int[15][11];
//		int a = 1;
//		int b = 1;

//		for (int i = 0; i < templateArrays.length; i++)
//		{
//			++a;
//			for (int j = 0; j < templateArrays[j].length; j++)
//			{
//				b++;
//				templateArrays[i][j] = a * b;
//			}
//		}

	}

	/**
	 * 
	 */
	public static String responseString()
	{
		return "Hello";
	}

	public void noResponse()
	{
		System.out.println("No Response");
	}

}
