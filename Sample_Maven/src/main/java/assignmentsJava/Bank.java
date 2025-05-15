package assignmentsJava;

public class Bank
{
	private int pin;
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public boolean getPin()
	{
		return (pin==1001||pin==1234||pin==1212);
	}
	public double amount()
	{
		double cash=7000;
		return cash;
	}
	
}
