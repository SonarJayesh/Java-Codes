import java.util.Scanner;
public class FactorialNo {
	
	public static void main(String args[])
	{
		int num,fact=1;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		num=obj.nextInt();
		
		while(num!=0)
		{
			fact=fact*num;
			
			num--;
		}
		System.out.println("Factrial= "+fact);
	}
}
							