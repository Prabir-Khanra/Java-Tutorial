class Example {

	void value () {
		for (int i = 0; i < 5; i++) {
  			System.out.println("First Loop"+i);
		}

		for (int j = 0; j < 5; j++) {
  			System.out.println("Second Loop"+j);
		}

		for (int m = 0; m < 5; m++) {
  			System.out.println("Third Loop"+m);
		}

	}

}

public class ThreadFirst {

	public static void main(String [] args) {
		
		Example obj = new Example();
		obj.value();

	}
}