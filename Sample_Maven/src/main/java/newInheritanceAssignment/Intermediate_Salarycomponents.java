package newInheritanceAssignment;

public class Intermediate_Salarycomponents extends Parent_Pay_Console {
	double hra,pf;
	public void calculate()
	{
		hra=0.05*basicpay;
		pf=0.20*basicpay;
	}

}
