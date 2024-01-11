package xlread;

import java.io.IOException;

public class XlMain {

	public static void main(String[] args) throws IOException {
		 int i;
		 int j;
		 for(i=0;i<10;i++) {
			 j =0;
			System.out.print(XlFileCode.readIntegerData(i,j)+" ");
			System.out.print(XlFileCode.readStringData(i, j+1)+" ");
			System.out.println(XlFileCode.readIntegerData(i,j+2));
			 
		 }
		
		
		

	}

}
