package KthLargestNumber;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class LargestNumberList {

	public static void main(String[] args) {
		
		
		
		List<Integer> l=new LinkedList<Integer>();
		
		l.add(240);
		l.add(50);
		l.add(65);
		l.add(20);
		l.add(689);
		int k=1;
		Optional<Integer> largest=l.stream()
				.distinct()
				.sorted(Collections.reverseOrder())
				.skip(k-1)
				.findFirst();
		System.out.println(largest);
	
	}

}
