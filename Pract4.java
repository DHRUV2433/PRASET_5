import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Pract4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Here is the example of Character Stream classes : CharArrayReader and CharArrayWriter
		System.out.println("*****************************");
		System.out.println("\tName: Shivang Dave");
		System.out.println("\tID: D21CS106");
		System.out.println("*****************************");
		char[] array = { 'S','h','i','v','a','n','g' };  
	    CharArrayReader reader = new CharArrayReader(array);  
	    CharArrayWriter writer=new CharArrayWriter();   
	    FileWriter f = new FileWriter("C:\\Users\\hemangini\\Documents\\Pract4.txt");
	    int i = 0;  
	    while ((i= reader.read()) != -1) {  
	      char ch = (char) i;  
	      writer.write(ch);
	      System.out.print(ch);   
	    }
	    writer.write(array);
	    f.close();
	}
}
