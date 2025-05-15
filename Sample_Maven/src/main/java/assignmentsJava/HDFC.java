package assignmentsJava;

public class HDFC implements RBI {
	@Override
	public double recurringDeposit(double amount, int duration) {
		double total=amount;
		for(int i=1;i<=duration;i++)
		{
			total=total+total*interestRate;
		}
		return total;
	}
	public static void main(String[] args)
	{
		RBI obj=new HDFC();
		double maturedamount=obj.recurringDeposit(900000, 5);
		System.out.println("The matured amount is: "+maturedamount);

	}

}
