package facingproblem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataIntoExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream ifie=new FileInputStream("./data/output.xlsx");
		Workbook wb = WorkbookFactory.create(ifie);
		wb.getSheet("Nit").createRow(3).createCell(3).setCellValue("Raghu");
		FileOutputStream fo = new FileOutputStream("./data/output.xlsx");
		wb.write(fo);
		
		
	}

}
