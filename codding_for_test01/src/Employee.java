/**FileName: Employee.java
 * Author: Yun-Jiung Wang, Ekeoma Ike 
* Date:  1 April, 1:16:51 PM
* Description: A functional abstract class which
*  define the require Employee parameters and methods for different types of Employees
 */

public abstract class Employee
{

	private String firstName;
	private String lastName;
	private String sinNumber;

	public Employee(String firstName, String lastName, String sinNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName()
	{
		return lastName;
	}

	/**
	 * @return the sinNumber
	 */
	public String getSinNumber()
	{
		return sinNumber;
	}

	/**
	 * @param name the firstName to set
	 */
	public void setFirstName(String name)
	{
		this.firstName = name;
	}

	/**
	 * @param name the lastName to set
	 */
	public void setLastName(String name)
	{
		this.lastName = name;
	}

	/**
	 * 
	 * Method: getEmployeeDetails
	* Purpose:  Get an Employee Details
	* Accepts: none
	* Return: return a String that lists the first name, last name and SIN number of an employee.
	 */
	public String getEmployeeDetails()
	{
		return getFirstName() + getLastName() + getSinNumber();
	}

	
	/**
	 * 
	 * Method: getEarnings
	*  Purpose: Get earnings for different types of employees.
	*  Accepts: none
	*  Return: double earnings
	 */
	abstract public double getEarnings();
}
