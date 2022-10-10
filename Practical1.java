//This program is run by Dhruv Vekariya(21CE152)
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Practical1 {

	public static void main(String[] args) throws IOException {

		File f = new File(".\\\\a1\\\\a2\\\\");
		File f1 = new File("Pra1.txt");

		System.out.println("This program is run by Dhruv Vekariya(21CE152)");
		if (f.exists()) {
			f.delete();
		} else {
			if (f.createNewFile()) {
				System.out.println("File " + f.getName() + " is created Successfully");
			}
		}
		if (f.mkdirs()) {
			f1 = new File(f, "test.txt");
			f1.createNewFile();
		}
		System.out.println("Absolute path is " + f1.getAbsolutePath());
		System.out.println("Path is " + f.getPath());
		System.out.println("Is executable ?? " + f.canExecute());
		System.out.println("Can write ?? " + f.canWrite());
		System.out.println("Can read ?? " + f.canRead());
		if (!f.canWrite()) {
			f.setWritable(true);
		}
		System.out.println("Can write ?? " + f.canWrite());
		System.out.println("Parent directory is " + f.getParent());
		System.out.println("Is directory ?? " + f.isDirectory());
		System.out.println("Is file ?? " + f.isFile());
		System.out.println("last modified at " + new Date(f1.lastModified()));
		System.out.println("Size is " + f1.length() + " bytes");
		f1.renameTo(new File(".\\a1\\a2\\test1.txt"));

		System.out.println(f1.getName());
	}
}
