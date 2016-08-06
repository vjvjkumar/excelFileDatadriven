	
package Pack1;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLfile_TestNG_Annotations {
	
		
@Test	(dataProvider = "SetofNumericalValues")
	public void Addition(String Value1, String Value2, String Value3) {
		int a = Integer.parseInt(Value1);
		int b = Integer.parseInt(Value2);
		int c = Integer.parseInt(Value3);
		int result = a + b + c;
		System.out.println("Value of 3 cells  "+result);
		}
	
@DataProvider	(name = "SetofNumericalValues")
	public Object [] [] readExcel() throws BiffException, IOException {
			
		File f 		= new File("V:/WorkSpace/testfile/mytestdata.xls");
		Workbook w	= Workbook.getWorkbook(f); 
		Sheet s		= w.getSheet(2);
			
		int rows	= s.getRows();
		int cols	= s.getColumns();
			
		System.out.println(rows);
		System.out.println(cols);
			
String Inputdata[][]= new String [rows][cols];
	for (int i=1; i<=rows; i++){
		for (int j=0; j<=cols; j++){
			
	Cell c			= s.getCell(rows, cols);
	Inputdata[i][j] = c.getContents();
	System.out.println(Inputdata[i][j]);
	}
	}
	return Inputdata;
	}
	}


