package exception;

public class ThrowExceptionSample {
	public static void test(int age) {
	
		if(age<18) {
			throw new ArithmeticException ("Not eligible");
			
		} else {
			System.out.println("Eligible for voting");
		}
	}
	

	public static void main(String[] args) {
		ThrowExceptionSample.test(15);
		

	}

}
