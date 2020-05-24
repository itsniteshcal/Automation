package keyworddriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib12 {
	public String getCellData(String path,String sheet,int row,int cell) throws Throwable {
	FileInputStream fill=new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fill);
	String exValue = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
	return exValue;

}
	public int getRowCount(String path,String sheet) throws Throwable {
	FileInputStream fill = new FileInputStream(path);
	Workbook wb = WorkbookFactory.create(fill);
	int rowCount = wb.getSheet(sheet).getLastRowNum();
	return rowCount;
	
}
	public String getPropKey(String propPath,String key) throws Throwable {
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propVal = prop.getProperty(key, "not a valid key");
		return propVal;
	}
}
