/**
 * 
 */
package collections;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author Administrator
 *
 */
public class StackList {
	
	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(5);
		stack.push(6);
		stack.push(2);
		stack.push(8);
		stack.push(5);
		stack.push(9);
		stack.push(2);
		stack.pop();
		stack.pop();
		
		for(int i:stack)
		{
			System.out.println(i);
		}
		
		
	}

}
