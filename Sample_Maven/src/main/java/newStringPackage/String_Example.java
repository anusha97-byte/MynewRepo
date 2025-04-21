package newStringPackage;

public class String_Example {

	public static void main(String[] args) {
		String s="Hello World";
		System.out.println("The string is: "+s);
		String s1=new String("Good Morning");
		System.out.println(s1);
		char ch[]= {'A','B','C'};
		String s2=new String(ch);
		System.out.println(s2);
		//length method()
		System.out.println(s.length());
		//concat();
		System.out.println(s.concat(s2));
		//touppercase()
		System.out.println(s.toUpperCase());
		//tolowercase()
		System.out.println(s.toLowerCase());
		String a="java";
		String d="java";
		String b="Java";
		String c="selenium";
		//equals()
		System.out.println(a.equals(d));
		System.out.println(a.equals(b));//case sensitive 
		System.out.println(b.equals(c));
		//equalignorecase()
		System.out.println(a.equalsIgnoreCase(b));//ignore the case of letter
		//isempty
		String p="";
		System.out.println(p.isEmpty());
		int h=10;
		String s10="";
		System.out.println(s10.valueOf(h));
		int num=23;
		String s11=String.valueOf(num);
		System.out.println(s11);
		//contains()
		String s12="Hi this is Anusha.";
		System.out.println(s12.contains("this"));
		System.out.println(s12.contains("good"));
		String s13=new String("java");
		System.out.println(a==d);
		System.out.println(a==s13);//here it checks the refernce
		System.out.println(a.equals(s13));
	
	}

}
