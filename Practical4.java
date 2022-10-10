//This program is run by Dhruv Vekariya(21CE152)
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Practical4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Here is the example of one of the Byte Stream Class : BufferedInputStream
		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		FileInputStream fInputStream=new FileInputStream("p4.txt");
	    BufferedInputStream bin=new BufferedInputStream(fInputStream);    
	    int i;    
	    while((i=bin.read())!=-1){    
	     System.out.print((char)i);    
	    }    
	    bin.close();    
	    fInputStream.close();    
	}
}
