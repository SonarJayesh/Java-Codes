import java.util.Scanner;
class nestedifelse{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Number of A:");
		a=obj.nextInt();

		System.out.println("Enter the Number of B:");
		b=obj.nextInt();

		System.out.println("Enter the Number of C:");
		c=obj.nextInt();

		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is a BIG");
			}
			else
			{
				System.out.println("C is a BIG");
			}
		}
		else{

			if(b>c)
			{
				System.out.println("B is A BIG");
			}
			else
			{
				System.out.println("C is a BIG");
			}

			}

	}
}