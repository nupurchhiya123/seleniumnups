package selenium;
import java.util.Scanner;
public class scanner {
	
	public int sum(int a,int b)
	{
		int sumresult=a+b;
		return sumresult;
	}
	public int sub(int a,int b)
	{
		int subresult=a-b;
		return subresult;
	}
	public int mul(int a,int b)
	{
		int mulresult=a*b;
		return mulresult;
	}
	public int division(int a,int b)
	{
		int divisionresult=a/b;
		return divisionresult;
	}
	public static void main(String[] args) {
		scanner obj=new scanner();
		System.out.println("please enter the first value");
		Scanner s=new Scanner(System.in);
		int x1=s.nextInt();
		
		System.out.println("please enter the second value");
		int x2=s.nextInt();
		
		int c=obj.sum(x1, x2);
		
		System.out.println("please enter the third value");
		int x3=s.nextInt();
		int d=obj.sub(c, x3);
		
		System.out.println("please enter the fourth value");
		int x4=s.nextInt();
		int e=obj.sub(d, x4);
		
        System.out.println("please enter the fifth value");
		int x5=s.nextInt();
		int f=obj.mul(e, x5);
		
        System.out.println("please enter the sixth value");
		int x6=s.nextInt();
		int g=obj.division(f, x6);
		
		System.out.println("output"+ g);
	}
	
}
