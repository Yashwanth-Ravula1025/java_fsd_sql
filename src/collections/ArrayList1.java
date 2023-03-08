/**
 * 
 */
package collections;

import java.util.ArrayList;

/**
 * @author Administrator
 *
 */
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("mango");
		names.add("apple");
		names.add("grapes");
		names.add("banana");
			System.out.println("returning element" +names.get(1));
			names.set(1, "dates");
			for(String fruits:names)
				System.out.println(fruits);
			
	}

}
