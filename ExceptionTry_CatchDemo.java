class ExceptionTry_CatchDemo{

	public static void main(String args[]){

			int a = 10;
			int b = 0;
			System.out.println("Starting Program");

			try{

					int c = a/b;
					System.out.println("Division= "+ c);
				}
			catch(ArithmeticException e){

					System.out.println("Can not Divisible By Zero");

				}

			System.out.println("Program Ended");
		}
}