package Functioninterface;
import java.util.*;
import java.util.stream.Collectors;
public class Uniquenames {

	public static void main(String[] args) {
		System.out.println("enter students article");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String arr[]=str.split("[, ; : . ? !]");
		List<String>s=Arrays.asList(arr);
		List<String>words=s.stream().filter(val->!val.isEmpty()).collect(Collectors.toList());
		List<String>uniquewords=words.stream().map(val->val.toLowerCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println("Number of words:" +words.size());
		System.out.println("Number of Unique words:" +uniquewords.size());
		System.out.println(uniquewords);
		
		// TODO Auto-generated method stub

	}

}
