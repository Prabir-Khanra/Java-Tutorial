import java.io.*;
public class BRead {

	public static void main(String [] args) throws IOException {

		FileReader file = new FileReader("./test.txt");

		BufferedReader b = new BufferedReader(file);

		int i = 0;

		while((i = b.read()) != -1) {
			
			System.out.print((char)i);
			
		}		

		b.close();

	}
}


// parent---------------child


// OutputStream => FileOutputStream (write to File)
// FileWriter => BufferedWriter




// InputStream => FileInputStream (read from file)
// FileReader => BufferedReader