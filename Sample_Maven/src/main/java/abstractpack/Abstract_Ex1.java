package abstractpack;

public class Abstract_Ex1 extends Abstract_Ex
{

	public static void main(String[] args)
	{
		Abstract_Ex1 obj=new Abstract_Ex1();
		obj.display();
		obj.show();
		System.out.println("sum is: "+obj.sum(4, 5));
		System.out.println("Result is: "+obj.mul(4, 5));
	}

	@Override
	public void display() 
	{
		System.out.println("This is a abstract class display method");
		
	}
	public void show()
	{
		System.out.println("This is a abstract class show method");
	}
	public int mul(int a, int b)
	{
		int c=a*b;
		return c;
	}

}
