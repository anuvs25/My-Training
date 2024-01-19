package inheritancemultiple;

public class MultipleInterfaceChild implements MutlipleInterfaceParentOne,MultipleInterfaceParentTwo {
public void print() {
	System.out.println("Interface 1");
}
public void display() {
	System.out.println("Interface 2");
}
	public static void main(String[] args) {
		MultipleInterfaceChild ob = new MultipleInterfaceChild();
		ob.display();
		ob.print();
		
	}

}
