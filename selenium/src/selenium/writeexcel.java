package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class writeexcel {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		// TODO Auto-generated method stub
File f=new File("../selenium/NewWorksheetLatest1.xls");
WritableWorkbook wk=Workbook.createWorkbook(f);
WritableSheet ws=wk.createSheet("sheet1", 0);
scanner sc=new scanner();
System.out.println("please enter the starting row no.");
Scanner s=new Scanner(System.in);
int x1=s.nextInt();

System.out.println("please enter the ending row no.");
Scanner s1=new Scanner(System.in);
int x2=s1.nextInt();

System.out.println("please enter the column no.");
Scanner g=new Scanner(System.in);
int x3=g.nextInt();

System.out.println("please enter the last column no.");
Scanner g1=new Scanner(System.in);
int x4=g1.nextInt();


for(int i=x1;i<=x2;i++)
{
	for(int j=x3;j<=x4;j++)
	{
		Label L=new Label(j,i,"Nupur");
		ws.addCell(L);
		
		
	}
}
wk.write();
wk.close();
	}

}
