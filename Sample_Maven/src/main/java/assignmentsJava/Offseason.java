package assignmentsJava;
import java.util.*;
public class Offseason extends Onseason
{
	public void dicount(double amount)
	{
		double dis=amount*0.15;
		double finalamount=amount-dis;
		System.out.println("Actual amount: "+amount);
		System.out.println("Discount: "+dis);
		System.out.println("Final amount: "+finalamount);
	}
	
	public static void main(String[] args) 
	{
		Offseason obj=new Offseason();
		Onseason obj1=new Onseason();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer purchased total amount: ");
		double amount=sc.nextDouble();
		System.out.println("Enter the season (on/off)");
		String season=sc.next();
		if(season.equals("on"))
		{
			obj1.discount(amount);
		}
		else if(season.equals("off"))
		{
			obj.dicount(amount);
		}
		else
		{
			System.out.println("Invalid entry :(");
		}
	}

}
