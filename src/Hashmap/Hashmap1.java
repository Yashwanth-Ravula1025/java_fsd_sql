package Hashmap;
import java.util.*;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<String,Integer>map=new HashMap<>();
		map.put("Sharath", 32);
		map.put("Ravi", 35);
		map.put("Davi", 40);
		int age=map.get("Sharath");//getting the value
		System.out.println("Age of Sharath is:" +age);
		boolean containshash=map.containsKey("Ravi");
		System.out.println("Ravi present in map");
		for(String name:map.keySet()) {
			int value=map.get(name);
			System.out.println(value);
		}
		
		
		// TODO Auto-generated method stub

	}

}
