/**
 * FileName: SalariedEmployee.java 
 * Author: Yun-Jiung Wang, Ekeoma Ike 
 * Date: 1 April, 2025 9:32:43 PM 
 * Description: Salaried Employee required
 * arguments,variables, methods A type of employee earns only from salary
 */

public class SalariedEmployee extends Employee
{

	private double salary;

	/**
	 * 
	 * @param firstName
	 * @param lastName
	 * @param sinNumber
	 * @param salary
	 */
	public SalariedEmployee(String firstName, String lastName, String sinNumber, double salary)
	{
		super(firstName, lastName, sinNumber);

		this.salary = salary;
	}

	/**
	 * @return the salary
	 */
	public double getSalary()
	{
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	/**
	 * Method Name: getEmployeeDetails() Accept: None Purpose: Get Salaried Employee
	 * Details Return: return a String that lists the first name, last name and SIN
	 * number of an employee
	 */
	@Override
	public String getEmployeeDetails()
	{
		// TODO Auto-generated method stub
		return super.getEmployeeDetails() + " This is a salaried Employee.";
	}

	/**
	 * Method Name: getEarnings() Accept: None Purpose: Get Salaried Employee
	 * Earnings Return: salary with dataType double
	 */
	@Override
	public double getEarnings()
	{
		return getSalary();
	}

}
