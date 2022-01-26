package selenium;
import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class rangereadfile{
	
	
public void readdata(int rowno1,int rowno2) throws IOException
{
	rangereadfile obj=new rangereadfile();
	File f=new File("../selenium/new.txt");
	String line;
    FileReader fr=new FileReader(f);
    BufferedReader b=new BufferedReader(fr);
	
    for(int i=0;i<=rowno2;i++)
	{
    	if(i>=rowno1 && i<rowno2)
    	{
    		line=b.readLine();
    		System.out.println(line);
    	}
    	else
    	{
    		b.readLine();
    	}    	
    		
	}
    fr.close();	
	
}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		rangereadfile r=new rangereadfile();
		r.readdata(0,2);
	}
      
        
	}


