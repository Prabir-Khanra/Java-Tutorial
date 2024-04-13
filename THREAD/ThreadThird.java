class Example extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
  			System.out.println("First Loop"+i);
		}
	}	

}

class SecondExample extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
  			System.out.println("Second Loop"+i);
		}
	}	

}

class ThirdExample extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
  			System.out.println("Third Loop"+i);
		}
	}	

}

public class ThreadThird {

	public static void main(String [] args) {
		
		Example obj = new Example();
		SecondExample obj2 = new SecondExample();
		ThirdExample obj3 = new ThirdExample();
		obj.start();
		obj2.start();
		obj3.start();

	}
}
