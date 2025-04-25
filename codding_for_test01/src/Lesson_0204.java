
/**
*Filename: Lesson_0204.java
*	Author: Yun-Jiung Wang
*		 Date: Feb 4, 2025 4:10:43 p.m.
*Description:
*Practice Array & Math.random() convert into int and start from speSific number to specific number
*/

import java.util.ArrayList;

/**
 * 
 */
public class Lesson_0204
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// If the length is unsure, then List would be more flexible, and it provides
		// tones of API, ex: add, remove, sort, etc.
		ArrayList<Integer> randomIntList = new ArrayList<Integer>();
		// If the length is fix, then use [] would be better, cause it saves the memory
		int[] randomInts = new int[6];

		// Generate six random int number and add them into array
		for (int i = 0; i < 6; i++)
		{
			int randomNum = (int) Math.random() * (49 - 1) + 1;
		
			randomInts[i] = (int) (Math.random() * (49 - 1) + 1);

			//confrim no duplicate number in the array
			while (!randomIntList.contains(randomNum))
			{
				randomIntList.add(randomNum);
			}
		}

		// trying to use int[]
		for (int i = 0; i < randomInts.length; i++)
		{
			System.out.println("int[]: " + randomInts[i]);
		}

		// Sort elements from small to big number
		randomIntList.sort(Integer::compareTo);

		// Read all the numbers
		randomIntList.forEach(it -> System.out.println("ArrayList: " + it));
	}

}
