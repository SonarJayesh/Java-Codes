import java.util.Scanner;
public class EvenOdd {

	public static void main(String args[])
	{
		int num;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Any Number");
		num=obj.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" is Even No");
		}
		else
		{
			System.out.println(num+" is Odd Number");
		}
		
	}
}
