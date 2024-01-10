package abstractsample;

public class AbstractSampleTwo extends AbstractSampleOne {
	public void print() {
		System.out.println("This is abstract method");
	}

	public static void main(String[] args) {
		AbstractSampleTwo ob = new AbstractSampleTwo();
		ob.print();
		ob.display();

	}

}
 