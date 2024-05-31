interface Calc{

	int add(int a,int b);
}
class Functional_InterfaceDemo{
	
	public static void main(String[] args){
	
		Calc calc = new Calc(){
			
				public int add(int a, int b){

					return a+b;
				}
		};
		int sum = calc.add(5,2);
		System.out.println("Addition: "+sum);
	}
}
