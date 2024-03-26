class A{

		int a,b,c;
		void add(){
				a = 10;
				b = 20;
				c=a+b;
				System.out.println("Addition of Two Numbers: "+ c);
			}
	}
class B extends A{
		void sub(){
				a = 10;
				b = 20;
				c=a-b;
				System.out.println("Subtraction of Two Numbers: "+ c);
		}
	}
class C extends B{
		void multi(){
				a = 10;
				b = 20;
				c=a*b;
				System.out.println("Multiplication of Two Numbers: "+ c);
			}
	}
class MultiLevel_Inheritance extends C{
		void div(){
				a = 10;
				b = 20;
				c=a/b;
				System.out.println("Division of Two Numbers: "+ c);

			}
		public static void main(String args[]){

				MultiLevel_Inheritance multiLevel_inheritance = new MultiLevel_Inheritance();
				multiLevel_inheritance.add();
				multiLevel_inheritance.sub();
				multiLevel_inheritance.multi();
				multiLevel_inheritance.div();
			}
	}