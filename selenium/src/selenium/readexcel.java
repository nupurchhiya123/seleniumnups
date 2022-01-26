package selenium;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class readexcel {
	
	public void readdata(int a,int b) throws BiffException, IOException
	{
		File f=new File("../selenium/NewWorksheetLatest.xls");
	
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	int r=ws.getRows();
	int c=ws.getColumns();
		for(int i=0;i<r;i++)
		
	{	
	
		for(int j=0;j<c;j++)
	{
			
			if(a==i && b==j)
			{
				Cell cl=ws.getCell(j, i);
				
				
				System.out.println(cl.getContents());
					
			}
	
			else
			{
				System.out.println(" ");
		
	
			}
	}
	}
	}
	

	public static void main(String[] args) throws BiffException, IOException 
	{
		// TODO Auto-generated method stub
		
readexcel obj=new readexcel();
obj.readdata(1, 3);

	}
}
