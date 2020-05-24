package qsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
//		FileInputStream fis = new FileInputStream("./data/input.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("practice");
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(1);
//		String excelValue = c.getStringCellValue();
//		System.out.println(excelValue);
		// method 2 by method chaining:-
  System.out.println(WorkbookFactory.create(new FileInputStream("./data/input.xlsx")).getSheet("practice").getRow(1).getCell(1));
		
		
		
	
	}

}
