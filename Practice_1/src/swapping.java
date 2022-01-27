import java.util.Scanner;
public class swapping {
	
	
	public void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("the value of after swapping is "+a+" " +b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int x=s.nextInt();
		System.out.println("Enter 2nd value");
		int y=s.nextInt();
		System.out.println("values before swapping is "+x+" " +y);
		swapping abc=new swapping();
		abc.swap(x, y);
	}

}
