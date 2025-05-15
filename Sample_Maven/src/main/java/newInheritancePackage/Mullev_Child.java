package newInheritancePackage;

public class Mullev_Child extends Mullev_Intermediate {
	public void display2() {
		System.out.println("This is a child class");
	}

	public static void main(String[] args) {
		Mullev_Child obj= new Mullev_Child();
		obj.display();
		obj.display1();
		obj.display2();

	}

}
