import java.util.Scanner;

/**
 * Filename: Lesson_2011.java Author: Yun-Jiung Wang Date: Feb 11, 2025
 * 4:05:18 p.m. Description:
 */

public class Lesson_0211
{
	static String fileName = "Lesson_0211.java";
	final static int userAge = 15;

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Scanner scanner = new Scanner(System.in);
////		myPrint("Shelley is very lazy!");
////		myPrint("She won't even type System.out!");
//		fileName = "";
//		System.out.println("FileName: " + fileName);
//		System.out.println("Num1: ");
//
//		int num1 = scanner.nextInt();
//		scanner.nextLine();
//		System.out.println("Num2:");
//		int num2 = scanner.nextInt();
//		System.out.println("Sum: " + addNum(num1, num2));
		scanner.close();

		int[][][] threeDArray = new int[6][4][5];
		int[][] twoD = new int[3][4];
		System.out.println("twoD: " + twoD.length);
		System.out.println(threeDArray.length);
//		• In the two-dimensional array we had ROWS and COLUMNS.
//		• The third dimension in a 3D array is called a PAGE.
//		• In the above declaration, the [3] would indicate the number of PAGES, and the [4]
//		would be the ROWS, and the [5] would be the columns.
//		• To process all the values in a 3D array, we just add another for loop outside of our
//		nested for loop that we used for a 2D array.
	}

	public static void myPrint(String message)
	{
		System.out.println(message);

	}

	public static void temp(String input, Integer number)
	{
		System.out.println("temp method: " + input + "\t" + number);
	}

	public static Integer addNum(int num1, int num2)
	{
		return num1 + num2;
	}

	protected static void name(String input)
	{
		System.out.println(input);
	}

}
