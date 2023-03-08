package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("yashwanth");
		list.add("mahesh");
		list.add("char");
		list.add("sharath");
		list.add("bunny");
		list.add("sunny");
		list.add("bunty");
		list.add("chinnu");
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
