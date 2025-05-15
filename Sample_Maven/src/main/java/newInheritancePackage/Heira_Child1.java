package newInheritancePackage;

public class Heira_Child1 extends Heira_Parent {
	public void display1() {
		System.out.println("This is First child");
	}

	public static void main(String[] args) {
		Heira_Child1 obj=new Heira_Child1();
		obj.display1();
		obj.display();

	}

}
