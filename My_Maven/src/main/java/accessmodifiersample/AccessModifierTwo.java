package accessmodifiersample;

public class AccessModifierTwo extends AccessModifierOne  {
	

	public static void main(String[] args) {
		add();
		AccessModifierTwo ob = new AccessModifierTwo();
		//ob.add();
		System.out.println(ob.a);
	}

}
