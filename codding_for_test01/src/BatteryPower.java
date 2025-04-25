/**
 * FileName: BatteryPower.java Author: Yun-Jiung Wang Date: April 11, 2025
 * 3:15:53 PM Description: A subclass of Shaver, implement methods for Shaver 
 * and specifically describe the usage of a battery shaver
 */

public class BatteryPower extends Shaver
{
	private int numBatteries;
	private String batteryType;

	public BatteryPower()
	{
		super("battery power");
		this.numBatteries = 4;
		this.batteryType = "Heavy Duty";
	}

	/**
	 * 
	 * @param make
	 * @param batteries
	 * @param batteryType
	 */
	public BatteryPower(String make, int batteries, String batteryType)
	{
		super("battery power");
		setMake(make);
		this.numBatteries = batteries;
		this.batteryType = batteryType;
	}

	/**
	 * @return the numBatteries
	 */
	public int getNumBatteries()
	{
		return numBatteries;
	}

	/**
	 * @param numBatteries the numBatteries to set
	 */
	public void setNumBatteries(int numBatteries)
	{
		this.numBatteries = numBatteries;
	}

	/**
	 * @return the batteryType
	 */
	public String getBatteryType()
	{
		return batteryType;
	}

	/**
	 * @param batteryType the batteryType to set
	 */
	public void setBatteryType(String batteryType)
	{
		this.batteryType = batteryType;
	}

	/**
	 * Purpose: describe how to use the battery powered shaver
	 */
	@Override
	public String getInstructions()
	{
		return "\nSince I am a women, I don't really know how to use a shaver.\n But I will try my best to destribe."
				+ "\n There are a few steps we need to do to start using a " + this.numBatteries + " " + this.batteryType
				+ " batteries shaver:" + "\n 1. Press the button " + "\n 2. Put the shaver to your target place "
				+ "\n 3. Start moving it till your beard is shaved" + 
				"\n 4. Turn off the shaver and clean it"
				+ "\n 5. Done";
	}

	@Override
	public String toString()
	{
		return super.toString() + " This shaver will perform for six months on " + this.numBatteries + " "
				+ this.batteryType + " batteries.";
	}

}
