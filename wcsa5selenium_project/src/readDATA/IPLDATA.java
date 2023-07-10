package readDATA;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class IPLDATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		// READ Data from IPL SHIT in XSL
		// Implemeantion of read the data from EXCEl
		
		FileInputStream file	=new FileInputStream("./Data/TestData.xlsx.xlsx");
		Workbook wb	=WorkbookFactory.create(file);

    Sheet sheet=wb.getSheet("IPL");
   Row row =sheet.getRow(1);
  Cell cell =row.getCell(0);
   String Data = cell.getStringCellValue();//Read the data from cell
   System.out.println(Data);
	}

}
