
// ===> We can not change the value of a final variable
// ===> Final method can not be overridden
// ===> Final class can not be inherited
final class Shape {

	//final void showValue () {
	//	System.out.println("I am show value method of shape");
	//}

}

class Rectangle extends Shape {

	//void showValue () {
	//	System.out.println("I am show value method of Rectangle");
	//}

}
public class FinalKeyword {
  public static void main(String[] args) {
	final int AGE = 22;
	System.out.println(AGE);
	//AGE = 30;
	//System.out.println(AGE);

	Rectangle rt = new Rectangle();
	rt.showValue();
  }
}