import java.util.Scanner;
public class PrimeNo {
	
	public static void main(String args[])
	{
		int num,i,flag=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Any Number");
		num=obj.nextInt();
		
		if(num==1)
		{
			flag=1;
		}
		else
		{
			for(i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=0;
					break;
				}
			}
		}
		if(flag==1)
		{
			System.out.println(num+" is Prime Number");
		}
		else
		{
			System.out.println(num+" is Not a Prime Number");
		}
	}
}
