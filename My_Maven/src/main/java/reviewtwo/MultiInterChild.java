package reviewtwo;

import review.MultiInherParentOne;
import review.MultiInherParentTwo;

public class MultiInterChild implements MultiInherParentOne,MultiInherParentTwo{
	public void display() {
		System.out.println("Parent Class One Method");
	}
	
	public void print() {
		System.out.println("Parent Class Two Method");
	}

	public static void main(String[] args) {
		MultiInterChild ob = new MultiInterChild();
		ob.display();
		ob.print();

	}

}
