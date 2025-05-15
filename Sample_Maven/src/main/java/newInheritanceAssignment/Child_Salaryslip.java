package newInheritanceAssignment;

public class Child_Salaryslip extends Intermediate_TotalSalary {
	public void salarySlip()
	{
		System.out.println("---SALARY SLIP---");
		System.out.println("Basic pay: "+basicpay);
		System.out.println("Deduction from basic pay: "+deduction);
		System.out.println("Bonus: "+bonus);
		System.out.println("hra: "+hra);
		System.out.println("pf: "+pf);
		System.out.println("Total salary given: "+totalsalary);
	}
	public static void main(String[] args) 
	{
		Child_Salaryslip obj= new Child_Salaryslip();
		obj.getinput();
		obj.calculate();
		obj.calculatetotal();
		obj.salarySlip();

	}

}
