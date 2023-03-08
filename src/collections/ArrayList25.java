package collections;

import java.util.Stack;

public class ArrayList25 {

	public static void main(String[] args) {
		Stack<Integer> numbers=new Stack<Integer>();
		 numbers.add(10);
		 numbers.add(6);
		 numbers.add(2);
		 numbers.add(5);
		 numbers.add(5);
		 numbers.add(9);
		 numbers.add(15);
		 numbers.add(20);
		 numbers.add(19);
		 System.out.println(numbers);
		 for(Integer i:numbers )
		 {
			 for(Integer j:numbers)
			 {
				 if((i+j)==25)
					 System.out.println(i+","+j);
					 
			 }
		 }
	}

}
