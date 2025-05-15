package interfacepack;

public class Interface_Class implements Interface_Ex
{

	public static void main(String[] args)
	{
		Interface_Class obj=new Interface_Class();
		Interface_Ex obj1=new Interface_Class();//reference of interface
		obj.display();
		System.out.println(obj1.num);
		System.out.println("Sum is: "+obj.sum(10, 11));
		obj.show();
		obj1.display();
	}

	@Override
	public void display() {
		System.out.println("This is a abstract method in interface");
		System.out.println(num);
	}

	@Override
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public void show()
	{
		System.out.println("this is a method from class");
	}

}
