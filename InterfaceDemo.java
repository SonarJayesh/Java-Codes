interface MyInterface{

	int a=10;
	void func1();
	void func2();
}

class MyClass implements MyInterface{

	public void func1(){
		System.out.println("This is Func1");
	}
	public void func2(){
		System.out.println("This is Func2");
	}	
}

class InterfaceDemo{
	
	public static void main(String[] args){

		//MyClass m = new MyClass();
		MyInterface m = new MyClass();
		m.func1();
		m.func2();		
	}
}