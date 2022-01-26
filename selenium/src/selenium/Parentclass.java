package selenium;

public class Parentclass {
	
	public Parentclass()
	{
		this(2,3,4);
		System.out.println("Parent Default Constructor");
	}
	public Parentclass(int a)
	{
		this();
		System.out.println("Parent 1 parameterized Constructor");
	}
	public Parentclass(int a,int b)
	{
		this(1);
		System.out.println("Parent 2 parameterized Constructor");
	}
	public Parentclass(int a,int b,int c)
	{
		System.out.println("Parent 3 parameterized Constructor");
	}
	public Parentclass(int a,int b,int c,int d)
	{
		this(4,5);
		System.out.println("Parent 4 parameterized Constructor");
	}
}
 