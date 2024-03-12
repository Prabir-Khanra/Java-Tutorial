// ===> Abstract class must be declared with an abstract keyword. This type of class is used to achieve Abstraction.


abstract class Shape {
	abstract void showValue ();
}

class Rectangle extends Shape {
	void showValue () {
		System.out.println("I am show value method of Rectangle");
	}

}
public class AbstractClass {
  public static void main(String[] args) {

	Rectangle rt = new Rectangle();
	rt.showValue();
  }
}