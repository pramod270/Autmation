package readDATA;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromXcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
		 FileInputStream file = new FileInputStream("./Data/TestData.xlsx");
			Workbook wb	=WorkbookFactory.create(file);

	    Sheet sheet=wb.getSheet("IPL");
		Row row =sheet.getRow(i);
		  Cell cell =row.getCell(0);
		   String Data = cell.getStringCellValue();//Read the data from cell
		   Thread.sleep(2000);
		   System.out.println(Data);
		}
	
		 
		 
		

	}

}
