/**
 * FileName: TestEmployee.java 
 * Author: Yun-Jiung Wang, Ekeoma Ike  
 * Date: 4 April 2025 11:10 am
 * Description:
 * This program is a driver class called TestEmployee.java 
 * to test your methods created in the Employee,Salaried, Commission, SalpulsCommEmployee classes.
 */

public class TestEmployee
{

	public static void main(String[] args)
	{

		/**
		 * Comment 1 Create an array of type Employee named employeeArray and size it to
		 * hold 3 employees.
		 */
		Employee[] employeeArray = new Employee[3];

		/**
		 * Comment 2 You are going to instantiate three workers. Do not use super class
		 * reference variables to create the three objects. Make the type of each
		 * reference variable of the same class as the object they will hold. We will
		 * see polymorphic behavior by storing the objects in an array of the super
		 * class type. You will assign each employee object you create to an element of
		 * your Employee array. Just use a straight assignment statement to do this as
		 * you create the object. Don’t bother setting up a loop to enter the objects
		 * into the array
		 */
		SalariedEmployee employee1 = new SalariedEmployee("Amit", "Badwal", "678-376-111", 4900);
		CommissionEmployee employee2 = new CommissionEmployee("Vishal", "Kumar", "945-445-392", 0.08, 65000);
		SalPlusCommEmployee employee3 = new SalPlusCommEmployee("Bruno", "Parmar", "877-434-357", 0.06, 0, 2300);

		employeeArray[0] = employee1;
		employeeArray[1] = employee2;
		employeeArray[2] = employee3;

		/**
		 * Comment 3 Set up a loop that will call the getEmployeeDetails( ) method on
		 * each of the objects in the array by referencing the array element i.e.
		 * employeeArray[0].getEmployeeDetails. Since each element holds a different
		 * type of object, this will show polymorphism in action.
		 */
		for (int index = 0; index < employeeArray.length; index++)
		{
			System.out.println(employeeArray[index].getEmployeeDetails());
		}

		/**
		 * Comment 4 Set up another loop that will call the getEarnings( ) method for
		 * each employee and print out the following: ”For employee last name earnings
		 * are 'amount-goes here'.”
		 */
		for (int index1 = 0; index1 < employeeArray.length; index1++)
		{
			System.out.println("\nFor employee " + employeeArray[index1].getLastName() + " earnings are:"
					+ employeeArray[index1].getEarnings());
		}

		/**
		 * Comment 5 Now, instantiate the three employees again as individual objects,
		 * but don’t put them in an array. Just create each one as an object on its own
		 * in your main method. This time, use the employee’s last name to name each
		 * object’s reference variable, and set the type of the variable to the same
		 * class as the type of employee you are creating.
		 **/
		SalariedEmployee badwal = new SalariedEmployee("Amit", "Badwal", "678-376-111", 4900);
		CommissionEmployee kumar = new CommissionEmployee("Vishal", "Kumar", "945-445-392", 0.08, 65000);
		SalPlusCommEmployee parmar = new SalPlusCommEmployee("Bruno", "Parmar", "877-434-357", 0.06, 0, 2300);

		/**
		 * Comment 6 Use the setter methods to make the following changes to each of the
		 * three employee objects that you just created above in Step 5
		 */
		badwal.setSalary(5400);
		badwal.setLastName("Kattara-Badwal");
		kumar.setSalesMade(80000);
		kumar.setCommRate(0.12);
		parmar.setSalesMade(60000);
		parmar.setBaseSalary(1800);

		/**
		 * Comment 7 Call the getEarnings( ) method on each employee and print the
		 * results to the screen to see the changes that you made to their salaries and
		 * commission rates.
		 */
		System.out.println("\nUpdated Employee Earnings:");
		System.out.println("Badwal:" + badwal.getEarnings());
		System.out.println("Kumar:" + kumar.getEarnings());
		System.out.println("Parmar:" + parmar.getEarnings());

		/**
		 * Comment 8 Call the getDetails( ) method on each one to see the other changes
		 * that you have made.
		 */
		System.out.println("\nUpdated Employee Information:");
		System.out.println("Badwal: " + badwal.getEmployeeDetails());
		System.out.println("Kumar: " + kumar.getEmployeeDetails());
		System.out.println("Parmar: " + parmar.getEmployeeDetails());
	}

}
