package Functioninterface;

import java.util.*;
import java.util.stream.Collectors;

public class Placeslist {

	public static void main(String[] args) {
		List<String>s=Arrays.asList("Idukki","Hyderabad","Thodupuzha","Muvatupuzha");
		List<String>places=s.stream().filter(t->t.startsWith("T")||t.startsWith("t")).collect(Collectors.toList());
        System.out.println(places);
		
		// TODO Auto-generated method stub

	}

}
