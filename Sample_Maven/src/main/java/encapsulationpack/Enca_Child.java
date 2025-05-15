package encapsulationpack;

public class Enca_Child {

	public static void main(String[] args) {
		Enca_Parent obj=new Enca_Parent();
		obj.setName("Adarsh");
		String s=obj.getName();
		System.out.println("Name: "+s);
		obj.setMark(80);
		System.out.println("Mark: "+obj.getMark());

	}

}
