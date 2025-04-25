/**
 * FileName: CommissionEmployee.java 
 * Author: Yun-Jiung Wang,Ekeoma Ike 
 * Date: 1 April, 2025 2:40:53 PM 
 * Description: This is a type of employee who don't have baseSalary. 
 * Their earning are based on their sales amount and with commission rate
 */

public class CommissionEmployee extends Employee
{

	private double commRate;
	private double salesMade;

	/**
	 * @param firstName
	 * @param lastName
	 * @param sinNumber
	 * @param commRate
	 * @param salesMade
	 */
	public CommissionEmployee(String firstName, String lastName, String sinNumber, double commRate, double salesMade)
	{
		super(firstName, lastName, sinNumber);

		this.salesMade = salesMade;
		this.commRate = commRate;
	}

	/**
	 * Method Name: getEarnings 
	 * Accept: None Purpose: Get Commission Employee
	 * Earnings Return: double
	 */
	@Override
	public double getEarnings()
	{
		return getCommRate() * getSalesMade();
	}

	/**
	 * Method Name: getEmployeeDetails Accept: None Purpose: Get Employee Details
	 * Return: double
	 */
	@Override
	public String getEmployeeDetails()
	{
		return getFirstName() + getLastName() + getSinNumber() + " This is a commissioned employee.";
	}

	/**
	 * @return the commRate
	 */
	public double getCommRate()
	{
		return commRate;
	}

	/**
	 * @param commRate the commRate to set
	 */
	public void setCommRate(double commRate)
	{
		this.commRate = commRate;
	}

	/**
	 * @return the salesMade
	 */
	public double getSalesMade()
	{
		return salesMade;
	}

	/**
	 * @param salesMade the salesMade to set
	 */
	public void setSalesMade(double salesMade)
	{
		this.salesMade = salesMade;
	}

}
