package readDATA;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteFileData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
		 FileInputStream file = new FileInputStream("./Data/TestData.xlsx");
			Workbook wb	=WorkbookFactory.create(file);

	    Sheet sheet=wb.getSheet("IPL");
		
	    Row row =sheet.getRow(1);
		  Cell cell =row.createCell(2);
		   cell.setCellValue("ಬೆಳಗಾವಿ");//Read the data from cell
		   
		   FileOutputStream files = new FileOutputStream("./Data/TestData.xlsx");
		   wb.write(files);
		}
	}

}
