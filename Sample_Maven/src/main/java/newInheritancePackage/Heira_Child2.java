package newInheritancePackage;

public class Heira_Child2 extends Heira_Parent{
	public void display3()
	{
		System.out.println("This is Second child");
	}

	public static void main(String[] args) {
		Heira_Child2 obj=new Heira_Child2();
		obj.display3();
		obj.display();
	}

}
