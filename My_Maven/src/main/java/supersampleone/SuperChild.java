package supersampleone;

public class SuperChild extends SuperParent {
	public void print() {
//		if(a>b) 
//		{System.out.println(a+" is greater");}
//		else 
//		{System.out.println(b+" is greater");}
//		
		System.out.println("This is super child");
		System.out.println(super.a);
		super.display();
	}

	public static void main(String[] args) {
		SuperChild ob = new SuperChild();
		//System.out.println(super.b); cannot call in static context
		//ob.display();
		ob.print();
	}

}
