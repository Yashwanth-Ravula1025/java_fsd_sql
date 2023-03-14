package Functioninterface;

import java.util.*;
import java.util.stream.Collectors;

public class Listofnames {
	public static void main(String[] args) {
	List<String>s=Arrays.asList("Meenakshi","Devika","Devika","Amitha","Amitha");
	List<String>freq=s.stream().filter(i->Collections.frequency(s, i)>1).collect(Collectors.toList());
	long total=freq.stream().count();
    System.out.println(total);
	
		// TODO Auto-generated method stub

	}

}
