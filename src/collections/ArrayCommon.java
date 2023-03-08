package collections;

import java.util.Arrays;
import java.util.HashSet;

public class ArrayCommon {

	public static void main(String[] args) {
		
		Integer[] arr1=new Integer[] {1,2,3,4,5};
		Integer[] arr2=new Integer[] {4,5,6,7};
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
		set.addAll(Arrays.asList(arr1));
		set2.addAll(Arrays.asList(arr2));
		System.out.println();

		if(set.retainAll(set2))
		{
			System.out.println(set);
		}
		else
		{
			System.out.println("no");
		}
}
}
