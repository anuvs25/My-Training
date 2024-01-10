package exception;

public class ArrayIndexOutofBoundExceptionSample {
	public void arraydisplay() {
		int array[] = {0,1,2,3,4,5,6};
		try {
			for (int i =0; i<=8;i++) {
				System.out.println(array[i]);
			}
			
		}
		catch(Exception e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
		
	}
	
	public static void main(String[] args) {
		ArrayIndexOutofBoundExceptionSample ob = new ArrayIndexOutofBoundExceptionSample();
		ob.arraydisplay();

	}

}
