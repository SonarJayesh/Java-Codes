import java.util.List;
import java.util.Vector;
class CollectionDemo{

	public static void main(String[] args){

		List<String> nameVector = new Vector<>();
		nameVector.add("Jayesh");
		nameVector.add("Shubham");
		nameVector.add("Yogesh");
		nameVector.add(1,"Ritesh"); // Add the name in 1st Index.
		nameVector.remove("Ritesh"); // Remove the Name

		System.out.println("Name Vector="+nameVector);
		System.out.println("2nd Element="+nameVector.get(1));

		//for(int i=0;i<nameVector.size();i++){
		//	System.out.println(nameVector.get(i));
		//}
		
		//for(int i=0;i<nameVector.size();i++){
		//	String str = nameVector.get(i);
		//	System.out.println(str);
		//}

		for(String str : nameVector){
			System.out.println(str);
		}
	}
}