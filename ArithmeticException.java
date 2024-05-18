import java.util.Scanner;

public class ArithmeticException{

	public static void main(String[] args){

		int a,b,c=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Two Numbers :");
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		try{
			c=a/b;
			System.out.println("Division="+c);
		}
		catch(ArithmeticException ex){
			
			System.out.println("Can not Divisible by Zero");
		}
		finally{
			System.out.println("Code Block is Done");

		}
		
	}
}