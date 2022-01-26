package selenium;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reversed="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string/number to be reversed");
		original =s.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--)	
		{
			
			reversed = reversed +original.charAt(i);
		}
		if(original.equalsIgnoreCase(reversed))
		{
			
			System.out.println("Entered string /number is palindrome");
		}
		else 
		{
			
			System.out.println("Number/string is not palindrome");
		}
	}
	

}
