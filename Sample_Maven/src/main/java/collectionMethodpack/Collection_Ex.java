package collectionMethodpack;

import java.util.ArrayList;
import java.util.List;

public class Collection_Ex {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		//add method add element in the collection
		obj.add("Red");
		obj.add("Apple");
		obj.add("Round");
		obj.add("Green");
		System.out.println(obj);
		//set method to replace a new element in a particular position
		obj.set(2, "Green");
		System.out.println(obj);
		//indexOf() method 
		System.out.println(obj.indexOf("Apple"));
		//lastIndexOf() method if element is same then last index will be shown
		System.out.println(obj.lastIndexOf("Green"));
		//contains() to check a element is present or not 
		System.out.println(obj.contains("Apple"));
		//isEmpty()  check if collection is empty or not
		System.out.println(obj.isEmpty());
		//get() is used to get a element using an index
		System.out.println(obj.get(3));
		//remove() to delete a particular element
		System.out.println(obj.remove(3));
		System.out.println(obj);
		//size() to find the length of an array
		System.out.println(obj.size());
		for(int i=0;i<obj.size();i++) 
		{
			System.out.println(obj.get(i));
		}
		for(String colour:obj)
		{
			System.out.println(colour);
		}
		

	}

}
