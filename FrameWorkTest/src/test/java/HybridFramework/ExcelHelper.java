package HybridFramework;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelHelper {
	
	public String[][] gettingData(String excelfileName, String SheetName)throws Exception
	{
		String[][] data=null;
		File file=new File(excelfileName);
		FileInputStream fileinputstream=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fileinputstream);
		
		Sheet sheet=workbook.getSheet(SheetName);
		
		int rows=sheet.getPhysicalNumberOfRows();
		int colmns=sheet.getRow(0).getPhysicalNumberOfCells();
		
		data=new String[rows][colmns];
		
		for(int rowindex=0;rowindex<sheet.getPhysicalNumberOfRows();rowindex ++)
		{
			for(int colmnIndex=0;colmnIndex<sheet.getRow(rowindex).getPhysicalNumberOfCells();colmnIndex ++)
			{
				data[rowindex][colmnIndex]=sheet.getRow(rowindex).getCell(colmnIndex).toString();
			}
		}
		return data;
	}

}
