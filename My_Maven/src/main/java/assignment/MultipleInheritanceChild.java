package assignment;

public class MultipleInheritanceChild extends MultipleInheritanceParent{
	public void product() {
		int prd = num1*num2;
		System.out.println("The product is "+prd);
	}

	public static void main(String[] args) {
		MultipleInheritanceChild ob = new MultipleInheritanceChild();
		ob.add();
		ob.sub();
		ob.product();

	}

}
