package supersampleconstructor;

public class SuperConstructorChild extends SuperConstructorParent{
	public SuperConstructorChild() {
		super();
		System.out.println("This is super child");
	}

	public static void main(String[] args) {
		SuperConstructorChild ob = new SuperConstructorChild();

	}

}
