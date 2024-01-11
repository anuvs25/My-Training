package xlread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	// Static variables
public static FileInputStream f;
public static XSSFWorkbook w;
public static XSSFSheet s;

public static String readStringData(int i, int j) throws IOException {
	// i for row j for column
	f= new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\names.xlsx");
	w = new XSSFWorkbook(f);
	s = w.getSheet("Names");
	XSSFRow r = s.getRow(i);
	XSSFCell c = r.getCell(j);
	
	return c.getStringCellValue();
}
public static double readIntegerData(int i, int j) throws IOException {
	f= new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\names.xlsx");
	w = new XSSFWorkbook(f);
	s = w.getSheet("Names");
	XSSFRow r = s.getRow(i);
	XSSFCell c = r.getCell(j);
	
	return  c.getNumericCellValue();
	
}
}
/*FileInputStream --file fetch chyan
XSSFWorkbook --- workbook fetch chyan
XSSFSheet --- find out sheet*/