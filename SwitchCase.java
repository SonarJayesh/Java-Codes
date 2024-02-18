import java.util.Scanner;
class SwitchCase{

	public static void main(String args[])
	{
		int a,b,c,op;
		Scanner obj =  new Scanner(System.in);
		System.out.println("*** CALCULATOR *** ");
		System.out.println(" 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Divisionn ");
		System.out.println("Enter The Operation Number:");
		op=obj.nextInt();

		System.out.println("Enter the Two Number");
		a=obj.nextInt();
		b=obj.nextInt();

		switch(op)
		{
			case 1:
				c=a+b;
				System.out.println("Addition= "+ c);
			break;

			case 2:
				c=a-b;
				System.out.println("Subtraction= "+ c);
			break;

			case 3:
				c=a*b;
				System.out.println("Mulltiplication= "+c);
			break;

			case 4:
				c=a/b;
				System.out.println("Division= "+c);
			break;

			default:
				System.out.println("Invalid Operation Number");
			break;
		}

	}
}