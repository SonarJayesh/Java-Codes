import java.util.Scanner;

public class MinMaxArrayElement_UserInput{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Size of Array: ");
		int n = sc.nextInt();

		int[] arr = new int[5];
		System.out.println("Enter the Array Element: ");
		
		for(int i=0; i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int min = arr[0], max = arr[0];

		for(int num : arr){
			
			if(num < min) min = num;
			if(num > max) max = num;
		}

		System.out.println("Smallest: "+min);
		System.out.println("Largest: "+ max);
		
	}
}