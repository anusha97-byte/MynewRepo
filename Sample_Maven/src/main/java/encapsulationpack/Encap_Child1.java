package encapsulationpack;

public class Encap_Child1 {

	public static void main(String[] args) {
		Encap_Parent1 obj= new Encap_Parent1();
		obj.setUsername("Anu12@");
		obj.setPassword(623858);
		System.out.println("Username: "+obj.getUsername()+"\n"+"Password: "+obj.getPassword());

	}

}
