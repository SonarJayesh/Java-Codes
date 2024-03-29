class Exception_ArrayIndex{

		public static void main(String args[]){

			int[] a = new int[2];
			a[0] = 10;
			a[1] = 20;
			int i;
			System.out.println("Starting Program");

			for(i = 0; i < 3; i++ ){

				try{

					System.out.println(a[i]);

		   		}
		   		catch(ArrayIndexOutOfBoundsException e){

					System.out.println("Can not given the Array Element");

			}
		}
	}
}