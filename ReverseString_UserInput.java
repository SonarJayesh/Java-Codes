import java.util.Scanner;
public class ReverseString_UserInput{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.next();
		
		String rev = "";
		for(int i = str.length()-1; i>=0; i--){
			
			rev += str.charAt(i);
		}
		
		System.out.println("Reverse String is: " + rev);
	
	}
}