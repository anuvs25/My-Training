package accessmodifiersample;

public class AccessModifierOne {
	public int a = 10; //instance variable
	 public static void add() {
		 int b= 10;
		 int c=20;
		 System.out.println("Sum is "+(b+c));
		 
	 }

	public static void main(String[] args) {
		AccessModifierOne.add();
		AccessModifierOne ob = new AccessModifierOne();
		System.out.println(ob.a);

	}

}
