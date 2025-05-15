package newInheritanceAssignment;

public class Intermediate_TotalSalary extends Intermediate_Salarycomponents
{
	double totalsalary;
	public void calculatetotal()
	{
		totalsalary=basicpay +hra+bonus-pf-deduction;
	}
}
