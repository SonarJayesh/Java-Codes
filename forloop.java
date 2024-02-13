import java.util.Scanner;
class forloop{

	public static void main(String args[])
	{
		int n,i;
		System.out.println("Enter the Any Number");
		Scanner obj = new Scanner(System.in);
		n=obj.nextInt();

		for(i=0;i<=n;i++)
		{
			System.out.println(i);
		}
	}

}