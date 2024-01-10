package inheritance;

public class ChildClass extends ParentClass{
	int b= 20;
	public void add() {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		ChildClass ob = new ChildClass();
		ob.print();
		ob.add();
		

	}

}
