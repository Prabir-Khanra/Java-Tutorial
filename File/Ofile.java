import java.io.*;
public class Ofile {

	public static void main(String [] args) throws IOException {

		FileOutputStream fout = new FileOutputStream("./test.txt"); // relative path of file

		int i;

		String value = "Bekaar Dil";
		
		char ch[] = value.toCharArray();

		for (i=0; i<value.length() ; i++) {
			
			fout.write(ch[i]);
		
		}

		fout.close();

	}
}



// OutputStream => FileOutputStream (write to File)

// InputStream => FileInputStream (read from file)