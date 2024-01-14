package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionSetMethods {

	public static void main(String[] args) {
		Set one = new LinkedHashSet();
		one.add("Welcome");
		one.add("to");
		one.add("the");
		one.add("World");
		one.add("of");
		one.add("Java");
		one.add(2024);
		System.out.println(one);

		Set two = new HashSet();
		two.add("Anu");
		two.add(56);
		two.add("May");
		two.add(25);
		two.add(589.245);
		two.add("Program");
		two.add(78);
		System.out.println(two);

		// addAll method
		one.addAll(two);
		System.out.println(one);

		// get method not for set
//		System.out.println(two.get(0));
//		System.out.println(two.get(2));
//		System.out.println(two.get(3));

		// contains
		boolean a = two.contains("May");
		boolean b = one.contains("August");
		System.out.println(a);
		System.out.println(b);

		// size
		System.out.println(one.size());
		System.out.println(two.size());

		// removeAll
		two.removeAll(two);
		System.out.println(two);

	}

}
