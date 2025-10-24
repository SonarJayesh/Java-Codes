import java.util.Scanner;
public class SwitchCase_Calculator {

	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int a,b,c,op;
		System.out.println("*** CALCULATOR ***");
		System.out.println(" 1.Addition \n 2.Subtraction \n 3.Division \n 4.Multiplication");
		
		System.out.println("Enter the Operation Number:");
		op=obj.nextInt();
		
		System.out.println("Enter the 2 Numbers:");
		a=obj.nextInt();
		b=obj.nextInt();
		
		switch (op)
		{
		case 1:
			c=a+b;
			System.out.println("Addition= "+c);
			break;
			
		case 2:
			c=a-b;
			System.out.println("Subtraction= "+c);
			break;
			
		case 3:
			c=a/b;
			System.out.println("Division= " +c);
			break;
			
		case 4:
			c=a*b;
			System.out.println("Multiplication= "+c);
			break;
			
		default:
			System.out.println("Invalid Operation Number");
			break;	
			
		
		}
	}
}
