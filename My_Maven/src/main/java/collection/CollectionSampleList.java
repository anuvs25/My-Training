package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionSampleList {

	public static void main(String[] args) {
		
		// Non generic List
		List animal = new ArrayList();
		animal.add("dog");
		animal.add("cat");
		animal.add("lion");
		animal.add("tiger");
		System.out.println(animal);
		
		//Generic List
		List <Integer> numbers = new ArrayList();
		numbers.add(20);
		numbers.add(78);
		numbers.add(155);
		numbers.add(245);
		numbers.add(458);
		numbers.add(125);
		System.out.println(numbers);
		
	}

}
