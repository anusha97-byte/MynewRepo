package aggregationnew;

public class Aggre_Child
{
	String housename;
	int housenumber;
	Aggre_Parent ref;
	public Aggre_Child(String housename, int housenumber,Aggre_Parent ref)
	{
		this.housename=housename;
		this.housenumber=housenumber;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(housename+"\t"+housenumber+"\t"+ref.cityname+"\t"+ref.pincode);
	}
	public static void main(String[] args) {
		Aggre_Parent obj=new Aggre_Parent("Trivandrum",695005);
		Aggre_Child obj1=new Aggre_Child("Nilayam",28,obj);
		obj1.display();
	}

}
