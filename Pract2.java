//This program is run by Dhruv Vekariya(21CE152)
import java.io.*;
public class Pract2 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		FileReader reader = new FileReader("input.txt");
		FileWriter writer = new FileWriter("output.txt");

		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		int c;
		while ((c = reader.read()) != -1 ) {
			writer.write(c);
			System.out.print((char)c);
		}
		reader.close();
		writer.close();
	}
}
