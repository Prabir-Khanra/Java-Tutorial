import java.io.*;
public class BWrite {

	public static void main(String [] args) throws IOException {

		FileWriter file = new FileWriter("./test.txt");

		BufferedWriter b = new BufferedWriter(file);

		b.write("Sidhart Malhotra");

		b.close();

	}
}


// parent---------------child


// OutputStream => FileOutputStream (write to File)
// FileWriter => BufferedWriter




// InputStream => FileInputStream (read from file)
// FileReader => BufferedReader