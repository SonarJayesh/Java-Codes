import java.util.Scanner;
class ReverseNo{
public static void main(String args[])
{
	int n,r,sum=0;
	Scanner obj = new Scanner(System.in);
	System.out.println("\n Enter the Number:");
	n = obj.nextInt();
	do{
		r=n%10;
		System.out.print(r);
		n=n/10;
		sum=sum+r;
	}
	while(n>0);
	System.out.println("\nsum=" + sum);

	}
}