package supersampleconstructor;

public class SuperChildOne extends SuperParentOne {
	
	public SuperChildOne() {
		super(15);
		System.out.println("Constructor in child class");
	}

	public static void main(String[] args) {
		SuperChildOne ob = new SuperChildOne();

	}

}
