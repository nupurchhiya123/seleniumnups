package PKG1;

public class PrintNum { 
	
	int x=35;
	
	public static void main (String[] args)
	{
		PrintNum test1= new PrintNum();
		
		test1.printData();
		test1.x=77;
//		System.out.println(test1.x);
		System.out.println("The number is " + test1.x);
		
		System.out.println(test1.SumNum(4,6));
		
	}
	
	public void printData()
	
	{
		
		System.out.println("Hello everyone");
	}
	
	public int SumNum(int number1, int number2)
	
	{
		return x = number1+number2;
		
	}
	

}
