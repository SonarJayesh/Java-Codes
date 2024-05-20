import java.util.Scanner;
public class Exceptions_Handling{

	public static void main(String[] args){

		int a,b,c=0;
		String Name = null;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of A and B");

		a=scanner.nextInt();
		b=scanner.nextInt();

		try{
			c=a/b;
			System.out.println("Length= "+Name.length());
		}
		catch(Exception ex){
			System.out.println("Exception Occured: "+ex.getMessage());
		}
		finally{
			System.out.println("Code Block is Done");
		}
		System.out.println("Division= "+c);
	}
}