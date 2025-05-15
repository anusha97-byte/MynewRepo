package collectionMethodpack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ex
{

	public static void main(String[] args)
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Apple");
		list.add("Orange");
		list.add("Pineapple");
		list.add("Banana");
		list.add("Strawberry");
		System.out.println(list);
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("Red");
		list1.add("Yellow");
		list1.add("Orange");
		list1.add("Green");
		list1.add("Pink");
		System.out.println(list1);
		//addAll() to combine two arraylist/collection
		System.out.println(list.addAll(list1));
		System.out.println(list);
		//containsAll() to check a list is present in another list
		System.out.println(list.containsAll(list1));
		Iterator <String> i=list.iterator();
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(list);
		
		

	}

}
