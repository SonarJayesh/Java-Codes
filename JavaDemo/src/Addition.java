import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,add;
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter the 2 Numbers:");
		
		a=obj.nextInt();
		b=obj.nextInt();
		
		add=a+b;
		
		System.out.println("Addition= "+add);
		
	}

}
