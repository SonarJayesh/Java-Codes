class Inheritance_superKeyword extends c
{
	void Show()
	{
		System.out.println("Parent Show");
	}
}
class Child extends Inheritance_superKeyword
{
	void Show()
	{
		super.Show();

			System.out.println("Child Show");

	}
}
class c
{
	public static void main(String[] args)
	{
		Child s = new Child();
		s.Show();
	}
}