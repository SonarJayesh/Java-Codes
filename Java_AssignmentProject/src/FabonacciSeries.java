import java.util.Scanner;
public class FabonacciSeries {
	
	public static void main(String args[])
	{
		int a=0,b=1,c,level,i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Level Number");
		level=obj.nextInt();
		System.out.println(a+"\n"+b);
		for(i=1;i<=level;i++)
		{
			c=a+b;
			
			System.out.println(c);
			
			a=b;
			b=c;
		}
	}
}
