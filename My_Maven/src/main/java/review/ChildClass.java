package review;

public class ChildClass extends ParentClass{
	public void display() {
		System.out.println("This is child class");
		super.display();
	}

	public static void main(String[] args) {
		ChildClass ob = new ChildClass();
		ob.display();

	}

}
