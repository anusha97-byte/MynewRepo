package assignmentsJava;
import java.util.*;
public class User 
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		Bank obj=new Bank();
		System.out.println("Enter the pin");
		int userpin=sc.nextInt();
		obj.setPin(userpin);
		if(obj.getPin())
		{
			System.out.println("The pin number is correct and the amount windrawn : "+obj.amount());
		}
		else
		{
			System.out.println("Entered pin is worng:(");
		}
	}

}
