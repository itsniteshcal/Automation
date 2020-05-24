package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Login {
	public String login(String path,String sheet,int row,int cell) throws Throwable  {
		FileInputStream fis = new FileInputStream(path);
		 Workbook wb = WorkbookFactory.create(fis);
		String excelVal = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelVal;
		
		
	}
	public static void main(String[] args) throws Throwable {
		Login log= new Login();
		String username = log.login("./data/input.xlsx","practice", 1, 0);
		String pass = log.login("./data/input.xlsx","practice", 1, 0);	
		
	}
	
		
	}


