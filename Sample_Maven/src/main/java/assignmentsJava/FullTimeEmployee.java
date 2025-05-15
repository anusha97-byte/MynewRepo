package assignmentsJava;

public class FullTimeEmployee extends Employee 
{
	String name;
	double paymentPerHour;
	public FullTimeEmployee(String name,double paymentPerHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	@Override
	public double calculateSalary() 
	{
		
		return paymentPerHour*8;
	}
	
	public static void main(String[] args) 
	{
		Employee obj=new FullTimeEmployee("Vishnu",200);
		Employee obj1=new Contractor("Neelima",100,6);
		System.out.println("The salary for FullTimeEmployee "+obj.calculateSalary());
		System.out.println("The salary for Contract Employee is: "+obj1.calculateSalary());
	}


	

}
