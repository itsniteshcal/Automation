package datadriven;

import java.io.FileInputStream;


//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {
	public static void main(String[] args) throws Throwable {
		//open the file in read mode
		FileInputStream fis = new FileInputStream("./data/input.xlsx");
		//keep file ready to use
		Workbook wb = WorkbookFactory.create(fis);
		//go to particular sheet to use
		Sheet sheet = wb.getSheet("Practice");
		Row r = sheet.getRow(1);
		//keep the cell ready to use 
		Cell c = r.createCell(1);
		c.setCellValue("raghav sir");
		 // wb.getSheet("Practice").getRow(4).createCell(4).setCellValue("raghu");
		
		//open the file in write mode
		FileOutputStream fos = new FileOutputStream("./data/input.xlsx");
		wb.write(fos);
		//close the excel virtually
		wb.close();
		System.out.println("done madi....");
		
		
		
	}

}
