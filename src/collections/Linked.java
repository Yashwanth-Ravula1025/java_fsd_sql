package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("yashwanth");
		list.add("mahesh");
		list.add("char");
		list.add("sharath");
		list.add("bunny");
		list.add("sunny");
		list.add("bunty");
		list.add("chinnu");
		
		for(String i:list)
		{
			System.out.println(i);
		}
	}

}

