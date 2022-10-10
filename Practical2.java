//This program is run by Dhruv Vekariya(21CE152)
import java.io.*;
public class Practical2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("input.txt");
		File f1 = new File("output.txt");
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		if (!f.exists()) {
			f.createNewFile();
		}
		if (!f1.exists()) {
			f1.createNewFile();
		}
		FileInputStream input = new FileInputStream("input.txt");
		FileOutputStream output = new FileOutputStream("output.txt");
		int a;
		while((a = input.read()) != -1)
		{
			System.out.print((char)a);
			output.write((char)a);
		}		
		input.close();
		output.close();
	}
}
