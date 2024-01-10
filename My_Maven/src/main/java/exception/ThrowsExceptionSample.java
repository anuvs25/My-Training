package exception;

public class ThrowsExceptionSample {
	public void test(int age) throws LicenceException {
		if(age<18) {
			throw new LicenceException("Not eligible for licence");
			
		}else {
			System.out.println("Eligible for licence");
		}
	}

	public static void main(String[] args)  {
		ThrowsExceptionSample ob = new ThrowsExceptionSample();
		try {
			ob.test(15);
		} catch (LicenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); // Method for printing
		}

	}

}
