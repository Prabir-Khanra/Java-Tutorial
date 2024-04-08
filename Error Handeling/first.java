public class First {

	public static void main(String [] args) {
		int balance = 5000;

		int withdrawl = 6000;

		String name = null;

		System.out.println(name.length()); //NullPointer Exception

		int result = 3/0; // Arithmetic Exception

		int [] data = {3, 5, 90};

		System.out.println(data[10]); // ArrayIndexOutOfBoundException
	}
}


// javac First.java => First.class

// java First