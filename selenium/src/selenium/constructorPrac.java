package selenium;

public class constructorPrac {
	
	public constructorPrac()

	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public constructorPrac( int a)
	{
		this();
		System.out.println("one parameter constructor");
	}
	public constructorPrac( int a,int b)
	{
		this(12);
		System.out.println("two parameter constructor");
	}
	
	public constructorPrac( int a,int b,int c)
	{
		this(12,22);
		System.out.println("three parameter constructor");
	}
	public constructorPrac( int a,int b,int c,int d)
	{
		System.out.println("four parameter constructor");
	}
	
	public static void main(String[] args)
	{
		
		constructorPrac obj1=new constructorPrac(22,21,43);
		
		
	}
}
