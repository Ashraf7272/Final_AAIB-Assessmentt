package Utilities;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProvider {

	@org.testng.annotations.DataProvider(name = "LoginData")
	public Object[][] getUserCredentials() throws IOException {
	    String excelFilePath = "C:\\Users\\ashraf.khalil\\eclipse-workspace\\Final_AAIB-Assessment\\Data\\Data.xlsx";
	    FileInputStream fileInputStream = null;
	    Workbook workbook = null;
	    Object[][] data = null;

	    try {
	        fileInputStream = new FileInputStream(excelFilePath);
	        workbook = WorkbookFactory.create(fileInputStream);
	        Sheet sheet = workbook.getSheet("Login");

	        int rowCount = sheet.getPhysicalNumberOfRows();
	        data = new Object[rowCount - 1][2];

	        for (int i = 1; i < rowCount; i++) {
	            data[i - 1][0] = sheet.getRow(i).getCell(0).toString();
	            data[i - 1][1] = sheet.getRow(i).getCell(1).toString();
	        }

	    } finally {
	        if (workbook != null) {
	            workbook.close();
	        }
	        if (fileInputStream != null) {
	            fileInputStream.close();
	        }
	    }

	    return data;
	    
	    

}
	@org.testng.annotations.DataProvider(name = "PaymentData")
	public Object[][] getCardDetails() throws IOException {
	    String excelFilePath = "C:\\Users\\ashraf.khalil\\eclipse-workspace\\Final_AAIB-Assessment\\Data\\Data.xlsx";
	    FileInputStream fileInputStream = null;
	    Workbook workbook = null;
	    Object[][] data = null;

	    try {
	        fileInputStream = new FileInputStream(excelFilePath);
	        workbook = WorkbookFactory.create(fileInputStream);
	        Sheet sheet = workbook.getSheet("Payment");

	        int rowCount = sheet.getPhysicalNumberOfRows();
	        data = new Object[rowCount - 1][5]; 

	        for (int i = 1; i < rowCount; i++) {
	            data[i - 1][0] = sheet.getRow(i).getCell(0).toString();
	            data[i - 1][1] = sheet.getRow(i).getCell(1).toString();
	            data[i - 1][2] = sheet.getRow(i).getCell(2).toString();
	            data[i - 1][3] = sheet.getRow(i).getCell(3).toString();
	            data[i - 1][4] = sheet.getRow(i).getCell(4).toString();
	        }

	    } finally {
	        if (workbook != null) {
	            workbook.close();
	        }
	        if (fileInputStream != null) {
	            fileInputStream.close();
	        }
	    }

	    return data;
	}
	

}
