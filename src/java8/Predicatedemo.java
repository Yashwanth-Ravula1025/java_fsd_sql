package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicatedemo {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(2,5,8,7);
		List<Integer> power=s.stream().filter(t-> t%2==0).map(t->t*t).collect(Collectors.toList());
		System.out.println(power);

	}

}
