import java.io.File;
import java.io.IOException;
public class Myfile {

	public static void main(String [] args) throws IOException {

		File obj = new File("C:/Users/Prabir Khanra/Desktop/JAVA/File/test.txt"); // absolute path

		if(obj.exists()) {

			System.out.println("File name: "+obj.getName());

			System.out.println("Is write: "+obj.canWrite());

			System.out.println("is read: "+obj.canRead());

		}else{
			obj.createNewFile();

		}
	}
}