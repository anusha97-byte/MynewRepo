package superkeywordpack;

public class Sup_Cons_Child extends Sup_Cons_Parent
{
	public Sup_Cons_Child()
	{
		super(5,10);
		System.out.println("This is child class Constructor");
	}

	public Sup_Cons_Child(int a, int b)
	{
		super(3.4f);
		System.out.println("a= "+a+ " b= "+b);
	}

	public static void main(String[] args)
	{
		Sup_Cons_Child obj=new Sup_Cons_Child();
		Sup_Cons_Child obj1=new Sup_Cons_Child(4,5);
		//Sup_Cons_Parent obj1=new Sup_Cons_Parent();
        //use this keyword for refer current class constructor
	}

}
