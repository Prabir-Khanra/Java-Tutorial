import java.io.*;
public class Ifile {

	public static void main(String [] args) throws IOException {

		FileInputStream fin = new FileInputStream("./test.txt"); // relative path of file
		
		int i = 0; //.....

		while((i = fin.read()) != -1) {

		     System.out.print((char)i);

		     // System.out.print((char)i);

		}

		fin.close();

	}
}



// OutputStream => FileOutputStream (write to File)

// InputStream => FileInputStream (read from file)