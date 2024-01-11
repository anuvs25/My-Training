package xlread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		System.out.println(ExcelCode.readStringData(0, 0));
		System.out.println(ExcelCode.readIntegerData(0, 1));
		

	}

}
