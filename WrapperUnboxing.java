class WrapperUnboxing{

	public static void main(String args[]){

		//Wrapper to Premative
			Integer obj = new  Integer(10);
			int a = obj.intValue();
			int b = obj;				//Unboxing
			System.out.println(a+b);

		}

	}