package inheritance;

public class HierarchialInheritanceChildTwo extends HierarchialInheritanceParent {
	public void esi() {
		if (sal>=15000) {
			System.out.println("The employee is eligible for ESI");
		}else {
			System.out.println("The employee is not eligible for ESI");
		}
	}

	public static void main(String[] args) {
		HierarchialInheritanceChildTwo obj = new HierarchialInheritanceChildTwo();
		obj.employee();
		obj.esi();
	}

}
