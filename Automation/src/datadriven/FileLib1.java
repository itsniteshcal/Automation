package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib1 {
	public String getCellData(String path,String sheet,int row,int cell) throws Throwable {
	FileInputStream fill=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fill);
	//String exValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
  Sheet	sh=wb.getSheet(sheet);
      Row r = sh.getRow(row);
     Cell c = r.getCell(cell);
     String exValue = c.toString();
     return exValue;

}
	public int getRowCount(String path,String sheet) throws Throwable {
	FileInputStream fill = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fill);
	int rowCount = wb.getSheet(sheet).getLastRowNum();
	return rowCount;
	
}
}
