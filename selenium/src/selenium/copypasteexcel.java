package selenium;
import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.Cell;
import jxl.Sheet;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class copypasteexcel {

	public static void main(String[] args) throws BiffException, IOException {
		
		// TODO Auto-generated method stub
		File f=new File("../selenium/NewWorksheetLatest.xls");
		File f1=new File("../selenium/NewWorksheetLatest1.xls");
		
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		WritableWorkbook wk1=Workbook.createWorkbook(f1);
		WritableSheet ws1=wk1.createSheet("sheet1", 0);
		int r=ws.getRows();
		int c=ws.getColumns();
		String sourcedata=null;
			for(int i=0;i<r;i++)
			
		{	
		
			for(int j=0;j<c;j++)
		{
				
				
					Cell cl=ws.getCell(j, i);
					
					
				sourcedata=cl.getContents();
				cl.getRow();
				
				
				System.out.println(sourcedata);
				
				Label L=new Label(j,i,sourcedata);
				ws.addCell(L);
				
				
		}
				
				
		}		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				}
	}
			
	/*while(sourcedata!=null);
	{
		
	
	}*/
}
}