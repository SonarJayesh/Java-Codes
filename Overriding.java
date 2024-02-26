class Overriding extends c
{
	void show()
	{
		System.out.println("Parents Show");
	}
}

class child extends Overriding
{
	void Show()
	{
		System.out.println("Child Show");
	}
}
class c
{
	public static void main(String[] args)
	{

		child s = new child();
		s.Show();

	}
}