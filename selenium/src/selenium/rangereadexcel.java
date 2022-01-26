package selenium;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class rangereadexcel {
	
	
	public void readdata(int a,int b,int c, int d) throws BiffException, IOException
	{

		File f=new File("../selenium/NewWorksheetLatest.xls");
		
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
//	int r=ws.getRows();
	//	int c=ws.getColumns();
		
		for(int i=a;i<=c;i++)
		
	{	
	
		for(int j=b;j<=d;j++)
	{
			
			
				Cell cl=ws.getCell(j, i);
				
				
				System.out.println(cl.getContents());
					
			
	}
	}
		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		
		
		// TODO Auto-generated method stub
		rangereadexcel obj=new rangereadexcel();
		obj.readdata(2, 2, 4, 3);
	}

}
