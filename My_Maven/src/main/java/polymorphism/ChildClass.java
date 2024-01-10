package polymorphism;

public class ChildClass extends ParentClass {
	
	@Override
	public void display() {
		System.out.println("Child Class");
		//super.display(); to display parent class o/p
	}

	public static void main(String[] args) {
		ChildClass ob = new ChildClass();
		ob.display();
		//ParentClass ob1 = new ParentClass();
		//ob1.display(); to display parent class o/p
		
	}

}
