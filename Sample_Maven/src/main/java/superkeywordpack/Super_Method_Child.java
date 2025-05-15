package superkeywordpack;

public class Super_Method_Child extends Super_Method_Parent
{
	public void show1()
	{
		this.show();
		super.display();
		super.sum(5, 10);
		System.out.println("Super");
	}
	public void show()
	{
		System.out.println("This is child class with super keyword");
	}
	public static void main(String[] args) 
	{
		Super_Method_Child obj=new Super_Method_Child();
		//obj.display();
		obj.show1();
	}

}
