import java.util.Scanner;
class ifelseladder{

	public static void main(String args[])
	{
		int marks;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Marks of Student");
		marks=obj.nextInt();

		if(marks>=80){

			System.out.println("Student pass  with A Grade");

		}

		else if(marks>=60){

			System.out.println("Student pass  with B Grade");

		}

		else if(marks>=50){

			System.out.println("Student pass  with C Grade");

		}

		else if(marks>=35){

			System.out.println("Student pass  with D Grade");

		}

		else{

			System.out.println("Student is Fail");

		}
	}
}