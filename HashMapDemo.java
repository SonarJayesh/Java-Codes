import java.util.HashMap;
import java.util.Map;

class HashMapDemo{

public static void main(String[] args){
		
		Map<String,String> nameTeam = new HashMap<>();
		nameTeam.put("Sachin","India");
		nameTeam.put("Anderson","England");
		nameTeam.put("Sachin","MI"); // a Same Keys are OverRide in 1st Same Keys.
		nameTeam.put(null,"West Indies"); //Not Allowed Multiple null keys.
		nameTeam.put(null,"Bangladesh");  //Allowed a Single null Keys. 
		nameTeam.put("AB De V",null);
		nameTeam.put("Ms Dhoni",null);	//Multiple null Values are Allowed.

		System.out.println("All Keys="+nameTeam.keySet());
		
		for(String keys : nameTeam.keySet()){

			System.out.println("Keys: "+keys+"\t Value: "+nameTeam.get(keys));		
		}

		for(Map.Entry<String , String> entry : nameTeam.entrySet()){

			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println("is Map contain Key Sachin? :"+nameTeam.containsKey("sachin"));
       		System.out.println("is Map contain Value England? :"+nameTeam.containsValue("England"));
	}
}