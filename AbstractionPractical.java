// ======= Notes:
	// must be declred with an abstract keyword
	// it can have abstract or non-abstract methods
	// can not be instantiated


abstract class Shape {
	abstract void draw(); // abstract method
	void erase () {
		System.out.println("Remove all the line");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing");
	}
	void paint() {
		System.out.println("Painting");
	}
}

public class AbstractionPractical {
  public static void main(String[] args) {
	Rectangle rt = new Rectangle();
	// Shape rt = new Rectangle();
	rt.draw();
	rt.paint();
	// Rectangle rt = new Shape() // ===================> error
  }
}