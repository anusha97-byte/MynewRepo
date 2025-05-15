package newInheritancePackage;

public class Single_Child extends Example_Inheritance {
	public void display1() 
	{
		System.out.println("this is a child class: ");
	}

	public static void main(String[] args) {
		Single_Child obj=new Single_Child();
		obj.display1();
		obj.display();

	}

}
