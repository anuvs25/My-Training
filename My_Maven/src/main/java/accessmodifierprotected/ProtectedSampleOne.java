package accessmodifierprotected;

public class ProtectedSampleOne {
	protected int a =2000;
	protected int b = 3000;
	
	protected static void add() {
		int x =30;
		int y = 20;
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		ProtectedSampleOne.add();
		ProtectedSampleOne ob = new ProtectedSampleOne();
		System.out.println(ob.a);
		
	}

}
