import java.util.Scanner;
class FindCube
{
	public static void main(String args[])
	{
		int num,Cube;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Any Number:");
		num=obj.nextInt();

		Cube=num*num;

		System.out.println("Cube ="+Cube*num);

	}
}