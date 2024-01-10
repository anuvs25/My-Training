package exception;

public class ExceptionHandlingSample {
	public void display() {
		int a = 36;
		try {
		int b = a/0; //Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(b); //Exception code
		}
		catch(Exception e) {
			System.out.println("Exception handled");
			System.out.println(e);
			
		}
	}


	public static void main(String[] args) {
		ExceptionHandlingSample ob = new ExceptionHandlingSample();
		ob.display(); //Exception code
		System.out.println("End of statement");

	}

}
