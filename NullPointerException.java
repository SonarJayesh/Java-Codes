
public class NullPointerException{

	public static void main(String[] args){
	
		String Name =null;	

		try{
			System.out.println("Length="+Name.length());
		}
		catch(NullPointerException ex){
			System.out.println("Please Enter the Name");
		}
		finally{
			System.out.println("Code Block is Done");
		}
	
	}
}