import java.util.Scanner;
class whileloop{

	public static void main(String args[])
	{

		Scanner obj = new Scanner(System.in);
		int n=0;
		System.out.println("Enter the Any Number");

		n=obj.nextInt();
		int i=0;
		while(i<=n)
		{
			System.out.println(i);
			i++;
		}


	}

}