public class FirstError {

	public static void main(String [] args) {

		try {
			System.out.println(3/0);
			System.out.println("AFTER");
		}catch(Exception e) {
			System.out.println("In catch block"+e.getMessage());
		}
		System.out.println("Complete");
	}
}


// javac FirstError.java => FirstError.class

// java First