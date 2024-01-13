package collection;

import java.util.ArrayList;

public class CollectionSample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Anu");
		al.add(125);
		al.add('H');
		al.add(20.35f);
		System.out.println(al);
		
		//ArrayList arrl  =new  ArrayList<String>(); //generic array list
		ArrayList <String> arrl  =new  ArrayList(); //generic array list
		arrl.add("Anu");
		arrl.add("Arya");
		arrl.add("Akshay");
		arrl.add("Appu");
		//arr1.add(20.35f);
		System.out.println(arrl);
		arrl.remove(0);
		System.out.println(arrl);

	}

}
