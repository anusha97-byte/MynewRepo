package newStringPackage;

public class Buffer_Example {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("Hello");
		System.out.println(sb);
		StringBuilder sb1=new StringBuilder("Hello World");
		System.out.println(sb1);
		//append
		System.out.println(sb.append(" Good morning"));
		System.out.println(sb.append(sb1));
		System.out.println(sb.insert(5, "hi"));
		//replace()
		System.out.println(sb.replace(8, 12, "ever"));
		//delete()
		System.out.println(sb.delete(8, 12));
		System.out.println(sb1.append(" how are you"));
		System.out.println(sb1.insert(11, " Im Anusha"));
		System.out.println(sb1.replace(22, 33, " from trivandrum"));
		System.out.println(sb1.delete(6, 11));
	}

}
