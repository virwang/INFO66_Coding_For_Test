public class Lesson_0117
{
	public static void main(String[] args)
	{
		int count1 = 15;
		int count2 = 15;
		int count3 = 15;

		System.out.println("The value of count1 is " + count1);
		System.out.println("The value of count2 is " + count2);
		System.out.println("The value of count2 post increment is " + count2++);
		System.out.println("The value of count3 pre increment is " + ++count3);
		
		int num1 = 15;
		int num2 = num1++ + ++num1;

		System.out.println("The value if num2 is " + num2);
		System.out.println("num1++ = " + num1++);
		System.out.println("++num1 = " + ++num1);

		/**
		 * Scanner practice
		 */
//		Scanner saScanner = new Scanner(System.in);
//		Scanner inputScanner = new Scanner(System.in)
//		String firstName = "";
//		char likePizza;
//
//		saScanner.nextLine();

//		System.out.println("Enter your first name");
//		firstName = saScanner.nextLine();
//		System.out.println("My first Name is " + firstName);
//
//		System.out.println("Enter your last name");
//		String lastName = saScanner.nextLine();
//		System.out.println("My last Name is " + lastName);
//
//		System.out.println("Enter your address:");
//		String address = saScanner.nextLine();
//		System.out.println("My address is " + address);
//
//		System.out.println("Do u like pizza?");
//		likePizza = saScanner.next().charAt(0);
//		System.out.println("I " + likePizza + " pizza");

		double result = 8 / 16 * 13;
		System.out.println(result);
	}

}
