public class MinMaxArrayElement{

	public static void main(String[] args){

		int[] arr = {5,2,9,1,6};
	
		int min = arr[0];
		int max = arr[0];

		for(int num : arr){
			
			if(num < min) min = num;
			if(num > max) max = num;
		}

		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}
}