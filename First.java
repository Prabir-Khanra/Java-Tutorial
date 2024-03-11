class Rectangle {
	int length;
	int width;

	Rectangle() {
		System.out.println("This is a constructor without parameter");
	}

	Rectangle(int value) {
		System.out.println("This is a constructor with perameter");
	}

	Rectangle(int length, int width) {
		this(34);
		this.length = length;
		this.width = width;	
	}

	void areaValue (int length, int width) {
		this.length = length;
		this.width = width;
	}

	void calculateArea () {
		System.out.println(length * width);
	}

}

public class First {
  public static void main(String[] args) {
	
	Rectangle rt1 = new Rectangle(20, 10);

	// rt1.areaValue(20, 10);
	rt1.calculateArea();

  }
}