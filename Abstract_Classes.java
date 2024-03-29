abstract class Bike{

		abstract void run();
	}

	class Abstract_Classes extends Bike{

			void run(){

					System.out.println("Running Safely");
				}
			public static void main(String args[]){

					Abstract_Classes abstract_classes	= new Abstract_Classes();
					abstract_classes.run();
			}
	}