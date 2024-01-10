package exception;

public class NullPointerExceptionSample {
	public void print() {
		String a = null;
		try {
			int b = a.length();
			System.out.println("The length of string is "+b);
		}
		catch(Exception e){
			System.out.println("Exception handled");
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		NullPointerExceptionSample ob = new NullPointerExceptionSample();
		ob.print();
	}

}
