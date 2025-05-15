package exceptionpack;

public class Custom_Excep {

	public static void main(String[] args) throws VotingException 
	{
		int age=17;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException ("Not eligible ");
		}

	}

}
