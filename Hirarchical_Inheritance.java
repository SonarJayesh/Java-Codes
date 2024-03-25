class A{
		void input(){
				System.out.println("User Name Is: ");
			}
	}
class B extends A{
		void Show(){
				System.out.println("My Name is Jayesh");
			}
	}
class C extends A{
		void Disp(){
				System.out.println("My Name is Shubham");
			}
	}
class Hirarchical_Inheritance extends A{

	public static void main(String args[]){

		B b = new B();
		C c = new C();

		b.input();
		b.Show();
		c.input();
		c.Disp();


		}

	}