package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicatorCity {

	public static void main(String[] args) {
		List<String> s=Arrays.asList("Hyderabad","nalgonda","Trivandrum","Narkatpelli");
		List<String> city=s.stream().filter(t-> t.toLowerCase().startsWith("n")).collect(Collectors.toList());
		System.out.println(city);
	}
}


