class Student{

		int roll,marks;
		String name;
		void Input(){
				System.out.println("Enter the Roll No ,Marks,Name");
			}
	}

class SingleInheritance extends Student{

		void Display(){

			roll = 21; marks = 89; name = " Jayesh";
			System.out.println(roll+ " " + marks +" " + name);
			}
			public static void main(String args[]){

				SingleInheritance singleinheritance = new SingleInheritance();
			    	singleinheritance.Input();
				singleinheritance.Display();
			}
	}