package Pack1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excelfile_datadriven {

public Object[][] readExcel() throws BiffException, IOException {
		
		File f 		= new File("V:/WorkSpace/testfile/mytestdata.xls");
		Workbook w	= Workbook.getWorkbook(f); 
		Sheet s		= w.getSheet(2);
		
		int rows	= s.getRows();
		int cols	= s.getColumns();
		
		System.out.println(rows);
		System.out.println(cols);
		
String Inputdata[][]= new String [rows][cols];
	for (int i=0; i<=rows; i++){
		for (int j=0; j<=cols; j++){
		
	Cell c			= s.getCell(rows, cols);
	Inputdata[i][j] = c.getContents();
	System.out.println(Inputdata[i][j]);
	}
	}
	return Inputdata;
	}
	
	

}
