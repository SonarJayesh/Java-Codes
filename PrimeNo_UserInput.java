import java.util.Scanner;

public class PrimeNo_UserInput{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();

		boolean isPrime = true;

		if(n<=1) isPrime = false;

		for(int i = 2; i <=Math.sqrt(n); i++){

			if(n % 2 == 0){
				isPrime = false;
				break;
			}
		} 
		System.out.println(isPrime ? "Prime" : "Not Prime");
	}
}