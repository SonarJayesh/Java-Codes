import java.util.List;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;

class Vector_HashMapClass{

	public static void main(String[] args){
		
		System.out.println("Vector Class in List Interface Example \n");
		List<String> nameVector = new Vector<>();
		nameVector.add("Jayesh");
		nameVector.add("Ritesh");
		nameVector.add("Shubham");
		nameVector.add(2,"Yogesh");
		nameVector.remove("Yogesh");

		for(String str : nameVector){
			System.out.println("Name Vector= "+str);
		}


		System.out.println("\n HashMap Class in Map Interface Example");

		Map<String,String> nameStudent = new HashMap<>();	
		nameStudent.put("Jayesh","Sonar");
		nameStudent.put("Yogesh","Badgujar");
		nameStudent.put("Ritesh","Badgujar");

		System.out.println("All Keys= "+nameStudent.keySet());

		for(String keys : nameStudent.keySet()){
	
			System.out.println("Keys: "+keys+"\t Value: "+nameStudent.get(keys));
		}

		for(Map.Entry<String, String> entry : nameStudent.entrySet()){

			System.out.println(entry.getKey()+ "\t"+ entry.getValue());
		}

		System.out.println("is Map Contain key Sachin? :"+nameStudent.containsKey("Jayesh"));
		System.out.println("is Map Contain Value? :"+nameStudent.containsValue("sonar"));
				
	}
}