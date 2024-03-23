class Inherit{

		public void Display(){

				System.out.println("Jayesh Sonar");
			}
	}
class Inheritance extends Inherit{

		public void display(){

				System.out.println("Shubham Gangurde");
			}

		public static void main(String args[]){

				Inheritance inheritance = new Inheritance();
				inheritance.Display();
				inheritance.display();

			}
	}