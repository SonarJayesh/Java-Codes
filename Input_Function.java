import java.util.Scanner;
class Input_Function
{
	Scanner obj=new Scanner(System.in);
	
	int Rollno;
	String Name;
	double Fees;	
	void input()
	{
		System.out.println("Enter the RollNo:");
		Rollno=obj.nextInt();
		System.out.println("Enter the Name:");
		Name=obj.next();
		System.out.println("Enter the Fees:");
		Fees=obj.nextDouble();
	}
	void output()
	{
		System.out.println("RollNo= "+Rollno);
		System.out.println("Name= "+Name);
		System.out.println("Fees= "+Fees);

	}
	public static void main(String args[])
	{
		Input_Function IF=new Input_Function();
		IF.input();
		IF.output();
	}
}