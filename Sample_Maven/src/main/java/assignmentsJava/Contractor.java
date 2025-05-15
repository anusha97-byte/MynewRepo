package assignmentsJava;

public class Contractor extends Employee 
{ 
	String name;
	double paymentPerHour;
	int workingHour;
	public Contractor(String name,double paymentPerHour, int workingHour)
	{
		this.name=name;
		this.paymentPerHour=paymentPerHour;
		this.workingHour=workingHour;
	}
	@Override
	public double calculateSalary()
	{
		return paymentPerHour*workingHour;
			
	}
	

}
