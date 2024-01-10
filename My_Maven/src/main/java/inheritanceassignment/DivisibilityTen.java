package inheritanceassignment;

public class DivisibilityTen extends AdditionResult {
	public void divisible() {
		System.out.println("The sum of two numbers is "+super.sum);
		if(sum%10==0) {
			System.out.println("The number is divisible by 10");
		}
		else {
			System.out.println("The number is not divisible by 10");
		}
		
	}

	public static void main(String[] args) {
		DivisibilityTen ob = new DivisibilityTen();
		ob.divisible();

	}

}
