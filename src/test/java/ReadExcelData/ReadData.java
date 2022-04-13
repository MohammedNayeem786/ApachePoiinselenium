package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {

    @Test
    public void testdata() throws Exception {
    	
    	File src = new File("C:\\Users\\user\\eclipse-workspace\\ApachePoiinSelenium\\TestDataOrangeHrm\\testdataorangeHrm.xlsx");
    	FileInputStream fis = new  FileInputStream(src);
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	XSSFSheet sheet1 = wb.getSheetAt(0);
    	
    	String data0 = sheet1.getRow(0).getCell(0).getStringCellValue();
    	System.out.println("Data from Excel Sheet1 is ...." + data0);
    	
    	String data1 = sheet1.getRow(0).getCell(1).getStringCellValue();
    	System.out.println("Data from Excel Sheet1 is ...." + data1);
    	
    	wb.close();
    	
    	
    	
    	
    	
    	
    }
}
