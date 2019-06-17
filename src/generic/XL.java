package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class XL {
	
	public static int getRowCount(String path, String sheet)
	{
		int rc=0;
		try
		{
			rc=WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getLastRowNum();
			/*Cell cc = WorkbookFactory.create(new FileInputStream(path)).getSheet(sheet).getRow(0).getCell(0);
			if(cc==null) {
				
			}*/
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
	
	public static String getData(String path, String sheet, int r, int c) throws EncryptedDocumentException, FileNotFoundException, IOException {
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		String v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
		
		
		return v;
	}

}
