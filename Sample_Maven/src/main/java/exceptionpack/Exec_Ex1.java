package exceptionpack;

public class Exec_Ex1 {

	public static void main(String[] args)
	{
		int a=10;
		int b=0;
		try
		{
			int c=a/b;	
			
		}
		catch(ArithmeticException  d)
		{
			
			
			System.out.println("Exception handled");
		}
		finally
		{
			System.out.println("this is finally block");
		}
		
	
		/*int a[]= {1,2,3,4};
		for(int i=0;i<=5;i++)
		{
			System.out.println("The array is "+a[i]);
		}
		String s=null;
		System.out.println(s.length());*/

	}

}
