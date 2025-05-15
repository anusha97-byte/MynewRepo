package assignmentsJava;
import java.util.*;	
public class Address 
{
	String address;
	Student ref;
	public Address(Student ref,String address)
	{
		this.ref=ref;
		this.address=address;
		
	}
	public void display()
	{
		System.out.println("Student details:"+"\nName: "+ref.name+"\nRollno.: "+ref.rollnumber+"\nAddress: "+address+"\n");
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details");
		System.out.println("Name: ");
		String name=sc.nextLine();
		System.out.println("Address: ");
		String address=sc.nextLine();
		System.out.println("Roll no: ");
		int rollnumber=sc.nextInt();
		
		Student obj=new Student(name,rollnumber);
		Address obj1=new Address(obj,address);
		obj1.display();

	}

}
