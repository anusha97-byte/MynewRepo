package newInheritanceAssignment;
import java.util.*;
public class Parent_Pay_Console 
{
	double basicpay, deduction, bonus;
	public void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Basic pay");
		basicpay= sc.nextDouble();
		System.out.println("Enter the deduction amount");
		deduction=sc.nextDouble();
		System.out.println("Enter the bonus");
		bonus=sc.nextDouble();
	}
}