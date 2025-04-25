/**
 * FileName: SalPlusCommEmployee.java 
 * Author: Yun-Jiung Wang, Ekeoma Ike 
 * Date:  1 April, 2025 5:31:53 PM 
 * Description:This is a subclass of CommissionEmployee, 
 * which means new employee who has both baseSalary and commission rate for earnings.
 *
 */

public class SalPlusCommEmployee extends CommissionEmployee
{

	private double baseSalary;

	/**
	 * @param firstName
	 * @param lastName
	 * @param sinNumber
	 * @param commRate
	 * @param salesMade
	 */
	public SalPlusCommEmployee(String firstName, String lastName, String sinNumber, double commRate, double salesMade,double baseSalary)
	{
		super(firstName, lastName, sinNumber, commRate, salesMade);
		this.baseSalary = baseSalary;
	}

	@Override
	public String getEmployeeDetails()
	{
		return getFirstName() + getLastName() + getSinNumber() + " Who also gets a base salary.";
	}

	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary()
	{
		return baseSalary;
	}

	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary(double baseSalary)
	{
		this.baseSalary = baseSalary;
	}

	/**
	 * 
	 * Method: getEarnings
	*  Purpose: Get earnings for SalPlusComm type employees.
	*  Accepts: none
	*  Return: double earnings + baseSalary
	 */
	@Override
	public double getEarnings()
	{
		return super.getEarnings() + getBaseSalary();
	}

}
