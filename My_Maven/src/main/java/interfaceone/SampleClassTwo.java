package interfaceone;

public class SampleClassTwo implements SampleOne {
	public void display() {
		System.out.println("Abstract method one");
	}
	
	public void add() {
		System.out.println(a+b);
	}
	
	public void print() {
		System.out.println("Child Class Method");
	}

	public static void main(String[] args) {
		SampleClassTwo ob = new SampleClassTwo();
		//SampleOne ob = new SampleClassTwo(); //only to execute elements of interface only
		ob.display();
		ob.add();
		ob.print();
		System.out.println(ob.a);

	}

}
