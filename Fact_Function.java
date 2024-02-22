import java.util.Scanner;
class Fact_Function
{
	public static void PrintFactorial(int n)
	{
		int i,fact=1;
		for(i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(n+" Factorial ="+fact);
		return;
	}

	public static void main(String args[])
	{
	//	System.out.println("Enter Any Number");
	//	Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();

		PrintFactorial(5);
	}
}


