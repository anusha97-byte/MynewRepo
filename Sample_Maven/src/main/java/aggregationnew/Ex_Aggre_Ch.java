package aggregationnew;

public class Ex_Aggre_Ch
{
	String subject;
	int rollnumber;
	Ex_Aggre_Pa ref;
	public Ex_Aggre_Ch(String subject,int rollnumber,Ex_Aggre_Pa ref)
	{
		this.subject=subject;
		this.rollnumber=rollnumber;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println(subject + rollnumber);
		System.out.println(ref.name + ref.mark);
	}
	
	public static void main(String[] args)
	{
		Ex_Aggre_Pa obj1=new Ex_Aggre_Pa("Aadvik",90);
		Ex_Aggre_Ch obj=new Ex_Aggre_Ch("maths",20,obj1);
		obj.display();
	}

}
