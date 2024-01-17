package finalkeyword;


public class ChildClass extends ParentClass {
	final int b =60;
	
	@Override
	public void display() {
		System.out.println("Child Class");
		//super.display(); //to display parent class o/p
		//b=50; // we can't change the value final keyword
	}

	public static void main(String[] args) {
		ChildClass ob = new ChildClass();
		ob.display();
		//ParentClass ob1 = new ParentClass();
		//ob1.display(); to display parent class o/p
		
	}

}
