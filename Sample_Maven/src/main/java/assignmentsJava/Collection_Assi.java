package assignmentsJava;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection_Assi {

	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<String>();
		li.add("Red");
		li.add("Blue");
		li.add("Black");
		li.add("Yellow");
		li.add("Pink");
		System.out.println(li);
		//printout the collection
		System.out.println(li.get(3));
		//Iterate thorugh all element in an arraylist using for each loop
		for(String s:li)
		{
			System.out.println(s);
		}
		//Iterate through all element in an array list using interface Iterator
		Iterator <String> i=li.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//remove third element in an array list
		li.remove(2);
		System.out.println(li);
		//Search an element in an array list
		System.out.println(li.contains("Yellow"));
	}

}
