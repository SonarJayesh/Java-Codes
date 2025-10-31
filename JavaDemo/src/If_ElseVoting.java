import java.util.Scanner;

public class If_ElseVoting {
	
	public static void main(String args[])
	{
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your Age :");
		age=obj.nextInt();
		{
			if(age>=18)
			{
				System.out.println("Allowed For Voting");
			}
			else
			{
				System.out.println("Not Allowed For Voting");
			}
		}
	}
}
