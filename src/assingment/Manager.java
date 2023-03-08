package assingment;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.*;
public class Manager {

	public static void main(String[] args) {
		
		List<Customer> cus=new ArrayList<>();
		cus.add(new Customer("2456889","yashu","2683280782","yashwanth@gmail.com","hyderabad"));
		cus.add(new Customer( "2456882","meggu","2683280783","megha@gmail.com","kodad"));
	    cus.add(new Customer( "2456883","sowji","2683280741","sowjan@gmail.com","andra"));
	    cus.add(new Customer( "2456885","meena","2683280791","mennakshi@gmail.com","kerala"));		
	
	    System.out.println(cus);
	    
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the customer id:");
	    String lookid=sc.nextLine();
	    
	    List<Customer> list=cus.stream()
	    		.filter(id->id.getRegid().equals(lookid))
	    		.collect(Collectors.toList());
	    if(list.isEmpty())
	    {
	    	System.out.println("No records found");
	    }
	    else
	    {
	    	System.out.println(list);
	    	
	    }
	}

}
