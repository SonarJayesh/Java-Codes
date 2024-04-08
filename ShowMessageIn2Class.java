class ShowMessageIn2Class
{
	public static void main(String args[])
	{
		System.out.println("Jayesh Sonar...!!");
		Sample s = new Sample();
		s.Show();
		OP add =new OP();
		add.Add();
	}
}
class Sample
{
	void Show()
	{
		System.out.println("By User...!!");
	}
}
class OP
{
	void Add()
	{
		int a=10,b=20,c=0;
		c=a+b;
		System.out.println("ADDITION= "+c);
	}
}