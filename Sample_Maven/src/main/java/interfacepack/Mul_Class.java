package interfacepack;
//multiple inheritance
public class Mul_Class implements Mulinter1,Mulinter2 {

	public static void main(String[] args)
	{
		Mul_Class obj=new Mul_Class();
		obj.display();
		obj.show();
	}

	@Override
	public void display() 
	{
		System.out.println("This a method from interface 2 ");
		
	}

	@Override
	public void show()
	{
		System.out.println("This is a method from interface 1");
		
	}

}
