package collectionMethodpack;

import java.util.HashSet;
import java.util.Set;

public class Set_Ex {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("red");
		s.add("black");
		s.add("green");
		s.add("yellow");
		s.add("pink");
		System.out.println(s);
		System.out.println(s.contains("yellow"));
		Set<String> s1=new HashSet<String>();
		s1.add("add");
		s1.add("sub");
		s1.add("mul");
		s1.add("div");
		s1.add("rem");
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("yellow"));
		System.out.println(s.containsAll(s1));
		s.remove("sub");
		System.out.println(s);
		System.out.println(s.isEmpty());
		s.clear();
		System.out.println(s);
		System.out.println(s.size());

	}

}
