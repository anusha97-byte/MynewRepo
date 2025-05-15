package superkeywordpack;
//refer parent class instant variable
public class Super_Child extends Super_Parent
{
	String color="blue";
	public void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
	public static void main(String[] args) 
	{
		Super_Child obj=new Super_Child();
		//System.out.println(obj.color);
		obj.displaycolor();
	}

}
