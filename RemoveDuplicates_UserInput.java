import java.util.Scanner;
import java.util.*;
//import java.util.LinkedHashSet;

public class RemoveDuplicates_UserInput{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the Array Elements: ");
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		
		}
		
		Set<Integer> set = new LinkedHashSet<>();

		for(int num : arr){
			
			set.add(num);
		}
		System.out.println("After removing duplicates: "+set);
	}
}