package xlread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlFileCode {

public static FileInputStream f;
public static XSSFWorkbook w;
public static XSSFSheet s;

public static String readStringData(int i,int j) throws IOException {
	f = new FileInputStream("D:\\EmployeeDetails.xlsx");
	w = new XSSFWorkbook(f);
	s = w.getSheet("Employees");
	XSSFRow r = s.getRow(i);
	XSSFCell c = r.getCell(j);
	return c.getStringCellValue();
}

public static double readIntegerData(int i,int j) throws IOException {
	f = new FileInputStream("D:\\EmployeeDetails.xlsx");
	w = new XSSFWorkbook(f);
	s = w.getSheet("Employees");
	XSSFRow r = s.getRow(i);
	XSSFCell c = r.getCell(j);
	
	return c.getNumericCellValue();
}

}
