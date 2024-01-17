package accessmodifierprotectedone;

import accessmodifierprotected.ProtectedSampleOne;

public class ProtectedSampleThree extends ProtectedSampleOne{

	public static void main(String[] args) {
		ProtectedSampleOne.add();
		ProtectedSampleThree ob = new ProtectedSampleThree();
		System.out.println(ob.a);
	}

}
