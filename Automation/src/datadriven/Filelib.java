package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Filelib {
	//1)for non static
	public String getcellData(String path,String sheet,int row,int cell) throws Throwable, Throwable {
		FileInputStream fis=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String excelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return excelValue;
	}
//	public static void main(String[] args) throws Throwable {
//		Filelib flib = new Filelib();
//		String username = flib.getcellData("./data/input.xlsx","practice", 0, 1);
//		String password = flib.getcellData("./data/input.xlsx", "practice", 0, 0);
//		System.out.println(username);
//		System.out.println(password)
//	}
//2)for static method(dont use static bcoz it inbuild method so it will slow down the memory as well as system)
//	public static String getcellData(String path,String sheet,int row,int cell) throws Throwable, Throwable {
//		FileInputStream fis = new FileInputStream(path);
//		Workbook wb = WorkbookFactory.create(fis);
//		String excelValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
//		return excelValue;
//		
//	}
//	public static void main(String[] args) throws Throwable {
//	  String username = Filelib.getcellData("./data/input.xlsx", "practice", 1, 0);
//	  String password = Filelib.getcellData("./data/input.xlsx", "practice", 1, 1);
//	  System.out.println(username);
//	  System.out.println(password);
		
		
//	}

}
