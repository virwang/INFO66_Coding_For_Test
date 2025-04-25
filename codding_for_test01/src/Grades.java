import java.util.Scanner;

/**
 * Filename: Grades.java Author: Yun-Jiung Wang 
 * Date: Jan 24, 2025 4:01:02 p.m.
 * Description:
 */

public class Grades
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		double score = 0.0;

		Scanner scanner = new Scanner(System.in);
				
		score = scanner.nextDouble();
		int gradeMath = (int) Math.round(score);
//		int init = gradeMath.intValue();
		

		if (gradeMath >= 90 && gradeMath <= 100)
		{
			System.out.println("A+");
		} else if (gradeMath >= 80 && gradeMath <= 89)
		{
			System.out.println("A");
		} else if (gradeMath >= 75 && gradeMath <= 79)
		{
			System.out.println("B+");
		} else if (gradeMath >= 70 && gradeMath <= 74)
		{
			System.out.println("B");
		} else if (gradeMath >= 65 && gradeMath <= 69)
		{
			System.out.println("C+");
		} else if (gradeMath >= 60 && gradeMath <= 64)
		{
			System.out.println("C");
		} else if (gradeMath >= 55 && gradeMath <= 59)
		{
			System.out.println("D+");
		} else if (gradeMath >= 50 && gradeMath <= 54)
		{
			System.out.println("D");
		} else
		{
			System.out.println("F");
		}

		scanner.close();
	}

}
