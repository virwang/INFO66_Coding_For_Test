/**
 * FileName: ShaverTest.java Author: Yun-Jiung Wang Date: April 11,
 * 20254:04:23 PM Description:Test the classes Shaver, BatteryPower and
 * Rechargeable
 */

public class ShaverTest
{

	public static void main(String[] args)
	{
		// 1) Create a BatteryPower object with 2 batteries of type alkaline made by
		// Venus.
		BatteryPower batteryPower = new BatteryPower("Venus", 2, "alkaline");
		// 2) Create a Rechargeable object with a battery type of lithium made by
		// Philips.
		Rechargeable rechargeable = new Rechargeable("lithium", "Philips");

		// 3) Have each object call all of its available getter methods and print out
		// the results to the screen
		System.out.println("Getter Methods Results:\n");
		System.out.println("1.BatteryPower:\n BatteryType: " + batteryPower.getBatteryType() + "; numBatteries:"
				+ batteryPower.getNumBatteries() + "; make: " + batteryPower.getMake() + "; type:"
				+ batteryPower.getType()+"\n");
		System.out.println("2.Rechargeable:\n make:" + rechargeable.getMake() + "; type: " + rechargeable.getType()
				+ "; batteryType:" + rechargeable.getBatteryType() + "\n");

//		4) Have each object call its toString( ) method and print the results to the screen.
		System.out.println("\n\ntoString() Results:");
		System.out.println("1.BatteryPower: " + batteryPower.toString()+"\n");
		System.out.println("2.Rechargeable: " + rechargeable.toString()+"\n");
		
		//5) Change the battery type on the Rechargeable object to “unknown”.
		rechargeable.setBatteryType("unknown");
		
		//6) Now have the Rechargeable object call its getter method to show the change to the batteryType and print that result to the screen 
		System.out.println("\n\nNew Rechargeable Results: \n make:" + rechargeable.getMake() + "; type: " + rechargeable.getType()
			+ "batteryType:" + rechargeable.getBatteryType()+"\n");
		
		//7) Have each object call its getInstruction() method and print the results to the screen.
		System.out.println("Instructions:\n");
		System.out.println("1.BatteryPower: "+ batteryPower.getInstructions()+"\n");
		System.out.println("2.Rechargeable:" + rechargeable.getInstructions());
		

	}

}
