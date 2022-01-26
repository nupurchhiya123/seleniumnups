package selenium;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readfile{
	
	
public void readdata(int rowno1) throws IOException
{
	readfile obj=new readfile();
	File f=new File("../selenium/new.txt");
	String line;
    FileReader fr=new FileReader(f);
    BufferedReader b=new BufferedReader(fr);
	
    for(int i=0;i<=rowno1;i++)
	{
    	if(i==rowno1)
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
		
		readfile r=new readfile();
		r.readdata(1);
        
      
        
	}

}
