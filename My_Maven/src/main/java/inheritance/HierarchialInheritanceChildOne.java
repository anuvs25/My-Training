package inheritance;

public class HierarchialInheritanceChildOne extends HierarchialInheritanceParent  {
	public void pf() {
		if (sal>=15000) {
			System.out.println("The employee is eligible for PF");
		}else {
			System.out.println("The employee is not eligible for PF");
		}
	}

	public static void main(String[] args) {
		HierarchialInheritanceChildOne ob = new HierarchialInheritanceChildOne();
		ob.employee();
		ob.pf();

	}

}
