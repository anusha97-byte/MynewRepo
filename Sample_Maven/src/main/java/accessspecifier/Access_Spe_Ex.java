package accessspecifier;

public class Access_Spe_Ex 
{
	public void pubmethod()
	{
		System.out.println("This is a public method");
	}
	private void primethod()
	{
		System.out.println("This is a Private method");
	}
	protected void promethod()
	{
		System.out.println("This is a portected method");
	}
	void defmethod()
	{
		System.out.println("This is a default method");
	}
	public static void main(String[] args)
	{
		Access_Spe_Ex obj=new Access_Spe_Ex();
		obj.pubmethod();
		obj.primethod();
		obj.promethod();
		obj.defmethod();
	

	}

}
