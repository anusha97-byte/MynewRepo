package override;

public class Override_Child extends Override_Parent
{
	public void display(int a, int b)
	{
		super.display(4,6);
		int c=a+b;
		System.out.println("The sum in overrided child is "+c);
	}
	public void show()
	{
		super.show();
		System.out.println("this is a over ride child class method");
	}
	public static void main(String[] args) 
	{
		Override_Child obj=new Override_Child();
		obj.display(10, 5);
		obj.show();

	}

}
