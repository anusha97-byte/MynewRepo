package assignmentsJava;

public class Div_Sup_Child extends Add_Sup_Parent
{
	public void division(int a, int b)
	{
		int result= super.addition(a, b);
		System.out.println("The result of addition is: "+result);
		if(result%10==0)
		{
			System.out.println("The result is divisible by 10");
		}
		else
		{
			System.out.println("The result is not divisible by 10");
		}
	}
	public static void main(String[] args)
	{
		Div_Sup_Child obj=new Div_Sup_Child();
		obj.division(10,58);

	}

}
