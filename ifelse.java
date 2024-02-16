import java.util.Scanner;
class ifelse{

	public static void main(String args[])
		{
			int age;
			System.out.print("Enter your Age :");
			Scanner obj = new Scanner(System.in);
			age=obj.nextInt();

			if(age>=18){
				System.out.println("Allowed for Voting");

				}
			else
			{
				System.out.println("Not Allowed for Voting");
			}
		}

	}