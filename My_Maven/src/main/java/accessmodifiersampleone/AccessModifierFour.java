package accessmodifiersampleone;

import accessmodifiersample.AccessModifierOne;

public class AccessModifierFour {

	public static void main(String[] args) {
		AccessModifierOne.add();
		//AccessModifierFour ob = new AccessModifierFour();
		//System.out.println(ob.a);
		
		AccessModifierOne ob = new AccessModifierOne();
		System.out.println(ob.a);
		

	}

}
