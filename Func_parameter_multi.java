class Func_parameter_multi
{
	static void multi(int a, int b)
	{
		int mul = a * b;
		System.out.println("Multiplication= "+mul);
	}
	static void Add(int p, int q)
	{
		int add = p + q;
		System.out.println("Addition= "+ add);
	}
	public static void main(String args[])
	{
		multi(10,20);
		Add(200,2);
	}
}