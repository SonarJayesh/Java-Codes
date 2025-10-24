import java.util.Scanner;
public class ArithmaticOperations {
	public static void main(String args[])
	{
		int num1,num2,add,sub,div,mul;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Two Numbers:");
		num1=obj.nextInt();
		num2=obj.nextInt();
		
		add=num1+num2;
		sub=num1-num2;
		div=num1/num2;
		mul=num1*num2;
		
		System.out.println("Addition= "+add);
		System.out.println("Subtraction= "+sub);
		System.out.println("Division= "+div);
		System.out.println("Multiplication= "+mul);
	}
}
