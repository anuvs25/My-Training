package accessmodifiersampleone;

import accessmodifiersample.AccessModifierOne;

public class AccessModifierThree extends AccessModifierOne {

	public static void main(String[] args) {
		AccessModifierThree ob = new AccessModifierThree();
		add();
		System.out.println(ob.a);
	}

}
