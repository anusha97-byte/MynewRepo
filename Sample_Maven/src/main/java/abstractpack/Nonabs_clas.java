package abstractpack;

public class Nonabs_clas extends Abs_clas
{
	
	public static void main(String[] args) 
	{
		Abs_clas obj=new Nonabs_clas();
		Nonabs_clas obj1=new Nonabs_clas();
		System.out.println("Sum is: "+obj.sum(5, 10));
		obj.show();
		//System.out.println("Reuslt is: "+obj.mul(4,2));//we cannot get the child class  property when abstract class refernce is declared.
		System.out.println("Result is: "+obj1.mul(4, 2));
	}

	@Override
	public int sum(int a, int b) 
	{
		
		int c=a+b;
		return c;
	}
	public int mul(int a, int b)
	{
		
		int c=a*b;
		return c;
	}

}
