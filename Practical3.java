//This program is run by Dhruv Vekariya(21CE152)
import java.io.*;
import java.util.Scanner;
public class Practical3 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		System.out.print("Enter your source file name : ");
		File a = new File(sc.nextLine());
		if(!a.exists())
		{
			System.out.println(a.getName()+" doesn't exist");
			if(a.createNewFile())
			{
				System.out.println(a.getName()+" file is created successfully");
			}
		}
		System.out.print("Enter your destination file name : ");
		File b = new File(sc.nextLine());
		if(!b.exists())
		{
			System.out.println(b.getName()+" doesn't exist");
			if(b.createNewFile())
			{
				System.out.println(b.getName()+" file is created successfully");
			}
		}
		copyData(a, b);
		sc.close();
	}
	static void copyData(File f1,File f2) throws FileNotFoundException,IOException
	{
		FileReader reader = new FileReader(f1);
		FileWriter writer = new FileWriter(f2);
		int c;
		while ((c = reader.read()) != -1) {
			writer.write((char)c);
			System.out.print((char)c);
		}
		reader.close();
		writer.close();
	}
}
