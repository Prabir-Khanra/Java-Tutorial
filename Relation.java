class Dad {
	String hair_color="brown";
	String skin_color="dark";
	void interest () {
		System.out.println("like to play PIANO");
	}
}

class Mom {
	String hair_color="black";
	String skin_color="fair";
	String education = "H.S Fail";
}

class Katrina extends Dad, Mom {
	String proffession = "Actress";
}

public class Relation {
  public static void main(String[] args) {
	Arun obj = new Arun();
	System.out.println(obj.education);
	System.out.println(obj.skin_color);
	obj.interest();
  }
}