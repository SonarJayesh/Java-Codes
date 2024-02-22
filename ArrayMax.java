import java.util.Scanner;
class ArrayMax
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int i,max;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Array Element");
		for(i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max= "+max);
	}
}