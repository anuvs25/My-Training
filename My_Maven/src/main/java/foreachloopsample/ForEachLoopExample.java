package foreachloopsample;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoopExample {

	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50,60};
		for(int i:numbers) {
			System.out.print(i+" ");
		}
		System.out.println();
		ArrayList <Integer> integers = new ArrayList();
		integers.add(25);
		integers.add(35);
		integers.add(45);
		integers.add(25);
		
		for(Integer i:integers) {
			System.out.print(i+" ");
		}
		System.out.println();
		List <String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Apricoat");
		
		for(String s:fruits) {
			System.out.print(s+" ");
		}
	}

}
