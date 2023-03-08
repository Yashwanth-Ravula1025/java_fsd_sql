package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PredictorFrequency {
	public static void main(String[] args) {
		List<String> s=Arrays.asList("Hyderabad","Hyderabad","Trivandrum","Narkatpelli");
		
		Map<String,Long> names=s.stream().map(city->city.toLowerCase()).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(names);
		
	}

}
