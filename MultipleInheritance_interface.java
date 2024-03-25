interface A{
		void Show();
	}
interface B{
		void Disp();
	}

class MultipleInheritance_interface implements A,B{

		public void Show(){
				System.out.println("InterFace A");
			}
		public void Disp(){
				System.out.println("InterFace B");
			}

		public static void main(String[] args){
					MultipleInheritance_interface multipleinheritance = new MultipleInheritance_interface();
					multipleinheritance.Show();
					multipleinheritance.Disp();

			}

	}