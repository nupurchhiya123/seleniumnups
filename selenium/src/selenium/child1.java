package selenium;

public class child1 extends Parentclass {
	
	public child1()
	{
		this(4,5,6);
		System.out.println("Child default parameter");
	}
	public child1(int a)
	{
		this(1,4);
		System.out.println("Child 1 parameterized constructor");
	}
	public child1(int a,int b)
	{
		this();
		System.out.println("Child 2 parameterized constructor");
	}
	public child1(int a,int b,int c)
	{
		super(1,2,3,4);
		System.out.println("Child 3 parameterized constructor");
	}
	public child1(int a,int b,int c,int d)
	{
		this(10);
		System.out.println("Child 4 parameterized constructor");
	}
	public static void main(String[] args) 
	{
		child1 obj=new child1(1,2,3,4);
	}
}
