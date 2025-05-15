package accessspecifier;

public class Access_Ex2 extends Access_Spe_Ex
{

	public static void main(String[] args) 
	{
	Access_Ex2 obj= new Access_Ex2();
	obj.pubmethod();
	obj.promethod();
	obj.defmethod();
	//obj.primethod();//private method have no accessibility in another class

	}

}
