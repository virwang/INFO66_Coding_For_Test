import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Filename: Lesson_0304.java Author: Yun-Jiung Wang Date: Mar 4, 2025
 * 4:26:25 p.m. Description: A txt file create/read practice
 */

public class Lesson_0304
{
	static final String FILE_PATH = "";
	static final String FILE_NAME = "message.txt";

	public static void main(String[] args)
	{

		File myFiles = new File(FILE_NAME);

		try
		{
			myFiles.createNewFile();
			FileWriter writer = new FileWriter(myFiles);

			writer.write("Hello World! HIWHOAREYOU?");
			writer.close();
			Scanner fileReader = new Scanner(myFiles);

			fileReader = new Scanner(myFiles);
			fileReader.useDelimiter("\\Z");
			while (fileReader.hasNext())
			{
				//String word = fileReader.nextLIne();
				//System.out.println(word);
				System.out.println(fileReader.nextLine());
				
			}
			String contentString = fileReader.next();
			System.out.println(FILE_NAME + "\n" + contentString);
			fileReader.close();
		} catch (IOException e)
		{

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
