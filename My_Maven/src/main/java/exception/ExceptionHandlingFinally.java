package exception;

public class ExceptionHandlingFinally {
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
		finally {
			System.out.println("Exception handled finally");
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingFinally ob = new ExceptionHandlingFinally();
		ob.display(); //Exception code
		System.out.println("End of statement");

	}

}
