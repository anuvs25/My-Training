package exception;

public class ExceptionClassSample {
	public void display() {
		int a = 36;
		int b = a/0; //Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(b); //Exception code
	}

	public static void main(String[] args) {
		ExceptionClassSample ob = new ExceptionClassSample();
		ob.display(); //Exception code
		System.out.println("End of statement");
		

	}

}
