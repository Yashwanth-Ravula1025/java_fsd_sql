package collections;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		
		HashMap<Integer,Emp> map=new HashMap<>();
		Emp e1=new Emp(245098,"Yashwanth",22,"IT");
		Emp e2=new Emp(245096,"sowjanya",23,"cse");
		Emp e3=new Emp(245111,"medhana",21,"ece");
	
		map.put(1,e1);
		map.put(2,e2);
		map.put(3,e3);
		
		
		int s=e1.hashCode();
		int s1=e2.hashCode();
		int s2=e3.hashCode();
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		
		
	}

}
