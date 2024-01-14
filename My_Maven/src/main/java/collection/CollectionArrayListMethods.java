package collection;

import java.util.ArrayList;

public class CollectionArrayListMethods {

	public static void main(String[] args) {
		//Non Generic List
		ArrayList arr = new ArrayList();
		arr.add("Welcome");
		arr.add("to");
		arr.add("the");
		arr.add("World");
		arr.add("of");
		arr.add("Java");
		arr.add(2024);
		System.out.println(arr);
		
		ArrayList arr1 = new ArrayList();
		arr1.add("Anu");
		arr1.add(56);
		arr1.add("May");
		arr1.add(25);
		arr1.add(589.245);
		arr1.add("Program");
		arr1.add(78);
		System.out.println(arr1);
		
		//addAll method
		arr.addAll(arr1);
		System.out.println(arr);
		
		//get
		System.out.println(arr1.get(0));
		System.out.println(arr1.get(2));
		System.out.println(arr1.get(3));
		
		//contains
		boolean a = arr1.contains("May");
		boolean b = arr.contains("August");
		System.out.println(a);
		System.out.println(b);
		
		//size
		System.out.println(arr.size());
		System.out.println(arr1.size());
		
		//removeAll
		arr1.removeAll(arr1);
		System.out.println(arr1);

	}

}
