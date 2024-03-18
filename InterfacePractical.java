// ======= Notes:
// Like abstract classes, interfaces cannot be used to create objects (we can not create any object of shape )
// An interface cannot contain a constructor (as it cannot be used to create objects)
// you must override all of its methods
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
// ======= Notes:
// why to use Interface: to achieve security and multiple inheritance

interface Shape {
	String name = "Sahid Kapoor"; //public static final String name = "Sahid Kapoor";
	void draw();  // public abstract void draw();
	void erase(); // public abstract void draw();

}

class Rectangle implements Shape {
	public void draw() {
	     System.out.println("Drawing");
	}
	public void erase() {
	     System.out.println("Removing");
	}
}

public class InterfacePractical {
  public static void main(String[] args) {
	Shape sh = new Rectangle();
	sh.draw();
	sh.erase();
  }
}