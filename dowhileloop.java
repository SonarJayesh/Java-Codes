import java.util.Scanner;
class dowhileloop{

	public static void main(String args[])
	{

		int n=0,i=0;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Any Number");
		n=obj.nextInt();

		do{
			System.out.println(i);
			i++;
		 }
		while(i<=n);
	}
}