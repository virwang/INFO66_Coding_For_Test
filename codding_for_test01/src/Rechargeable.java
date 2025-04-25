/**
 * FileName: Rechargeable.java Author: Yun-Jiung Wang Date: April 11, 2025
 * 3:51:39 PM Description: usage of re chargeable shaver
 */

public class Rechargeable extends Shaver
{
	private String batteryType;

	public Rechargeable()
	{
		super("rechargeable");
		this.batteryType = "Nickle Cadmium";
	}

	public Rechargeable(String make, String batteryType)
	{
		super("rechargeable", make);
		this.batteryType = batteryType;
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

	@Override
	public String getInstructions()
	{

		return "\nSince I am a women, I don't really know how to use a shaver.\n But I will try my best to destribe."
				+ "\n There are a few steps we need to do to start using a rechargeable shaver."
				+ " And batteryType is " + this.batteryType + " batteries shaver:" + "\n 1. Press the button "
				+ "\n 2. Put the shaver to your target place " + "\n 3. Start moving it till your beard is shaved"
				+ "\n 4. Turn off the shaver and clean it" + "\n 5. Done!";
	}

	@Override
	public String toString()
	{
//		if (this.batteryType != null && this.batteryType.equals("Nickle Cadmium"))
//		{
//			return super.toString() + " This shaver will run for 60 days on a single charge.";
//		}
		return super.toString()+ " This shaver will run for 60 days on a single charge.";
	}

}
