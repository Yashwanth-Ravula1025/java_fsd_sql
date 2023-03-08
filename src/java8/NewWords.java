package java8;

import java.util.*;
import java.util.stream.Collectors;

public class NewWords {

	public static void main(String[] args) {
		
		String str="welcome to the ust the world best place to work";
		
		String[] strToWord = str.split("[ ,:;.?!]");
		
		List<String> theWords=Arrays.stream(strToWord)
				.filter(val->!val.isEmpty())
				.collect(Collectors.toList());
		
		
		List<String> uniqueWords=theWords.stream()
				.map(val->val.toLowerCase())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("number of words:" +theWords.size());
		System.out.println("number of unique words:" +uniqueWords.size());
		
		System.out.println(uniqueWords);
	}

}
