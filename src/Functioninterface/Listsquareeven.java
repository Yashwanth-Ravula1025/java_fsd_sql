package Functioninterface;

import java.util.*;
import java.util.stream.Collectors;


public class Listsquareeven {

	public static void main(String[] args) {
		List<Integer>s=Arrays.asList(1,2,3,4,5);
		List<Integer>square=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(square);

	}

}
