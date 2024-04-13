class Example implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
  			System.out.println("First Loop"+i);
		}
	}	

}

class SecondExample implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
  			System.out.println("Second Loop"+i);
		}
	}	

}

class ThirdExample implements Runnable {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
  			System.out.println("Third Loop"+i);
		}
	}	

}

public class ThreadSecond {

	public static void main(String [] args) {
		
		Thread t1 = new Thread(new Example());
		Thread t2 = new Thread(new SecondExample());
		Thread t3 = new Thread(new ThirdExample());
		t1.start();
		t2.start();
		t3.start();

	}
}
