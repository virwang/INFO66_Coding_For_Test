/**
*Filename: Moon.java
*	Author: Yun-Jiung Wang
*		 Date: April 25, 2025 1:09:04 PM
*Description: subclass of HeavenlyObject
*/

/**
 * 
 */
public class Moon extends HeavenlyObject
{

	public double orbitDistance;

	/**
	 * @param type
	 * @param radius
	 */
	public Moon(double radius, double orbitDistance)
	{
		super("Moon", radius);
		// TODO Auto-generated constructor stub
		this.orbitDistance = orbitDistance;
	}

	/**
	 * @param type
	 * @param radius
	 * @param name
	 */
	public Moon(double radius, String name, double orbitDistance)
	{
		super("Moon", radius, name);
		this.orbitDistance = orbitDistance;
	}

	/**
	 * @return the orbitDistance
	 */
	public double getOrbitDistance()
	{
		return orbitDistance;
	}

	/**
	 * @param orbitDistance the orbitDistance to set
	 */
	public void setOrbitDistance(double orbitDistance)
	{
		this.orbitDistance = orbitDistance;
	}

	/**
	 * Method: findPerimeter Purpose:find perimeter of a moon by using a double
	 * formula circumference of a circle. C = 2 * PI * radius Accepts: None Return:
	 * double
	 */
	@Override
	public double findPerimeter()
	{

		return 2 * Math.PI * getRadius();
	}

	/**
	 * Method: findSurfaceArea Purpose: find the surface area of a moon via using a
	 * double formula surface area = 4* PI * radius*radius Accepts: None Return:
	 * double
	 */
	@Override
	public double findSurfaceArea()
	{
		return 4 * Math.PI * Math.pow(getRadius(), 2);
	}

	/**
	 * Method: findSizeCategory Purpose: determines whether the moon is considered a
	 * small, medium, or large planet based on its surface area. Accepts: None
	 * Return: String
	 */
	@Override
	public String findSizeCategory()
	{
		String categorySize = "";
		double surfaceArea = findSurfaceArea();
		if (surfaceArea < 10000000)
		{
			categorySize = "small";
		}

		if (10000000 <= surfaceArea && surfaceArea <= 50000000)
		{
			categorySize = "medium";
		}

		if (surfaceArea > 50000000)
		{
			categorySize = "large";
		}

		return categorySize;
	}

	/**
	 * Method: toStrings Purpose: method return a string Accepts: None
	 * 
	 * @return Return: String
	 */
	@Override
	public String toString()
	{

		return super.toString() + " This moon is " + this.orbitDistance + " kilometers from its nearest planet.";
	}

}
