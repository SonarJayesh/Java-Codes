import java.util.Scanner;
class SolidRectanglePattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Rows");
		int row=sc.nextInt();
		System.out.println("Enter the Column");
		int col=sc.nextInt();
		for(int i=0; i<row ;i++){

			for(int j=0; j<col; j++){

				System.out.print(" *");
			}
			System.out.println();
		}
	}
}