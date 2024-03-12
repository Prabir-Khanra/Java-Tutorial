class Shape {
	Shape () {
		System.out.println("I am a constructor of class shape.");
	}

	void showValue () {
		System.out.println("I am show value method of shape");
	}

}

class Rectangle extends Shape {
	Rectangle () {
		System.out.println("I am a constructor of class rectangle.");
	}

	void showValue () {
		//super.showValue();
		//super();
		System.out.println("I am show value method of rectangle class");
	}

}

public class SuperKeyword {
  public static void main(String[] args) {

	Rectangle rt = new Rectangle();
	rt.showValue();
  }
}