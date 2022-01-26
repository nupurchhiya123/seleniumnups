package selenium;

public class THISMethod {
	
	public void Method1()
	{
		
		System.out.println("Default method");
		this.Method2(12);
	}
	public void Method2(int a)
	{
		System.out.println("one parameter method");
		this.Method5(2,3,4,5);
	}
	public void Method3(int a,int b)
	{
		
		System.out.println("two parameter method");
	}
	public void Method4(int a,int b,int c)
	{
		System.out.println("Three parameter method");
		this.Method1();
	}
	public void Method5(int a,int b,int c,int d)
	{
		System.out.println("Four Parameter method");
		this.Method3(4,6);
	}
	public static void main(String args[])
	{
		THISMethod obj=new THISMethod();
		obj.Method4(1,2,3);
	}

}
