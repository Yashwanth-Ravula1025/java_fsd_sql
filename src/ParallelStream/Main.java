package ParallelStream;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		
		List<MenuDetalis> food=new ArrayList<>();
		
		food.add(new MenuDetalis(1,"vegmeals",24.67));
		food.add(new MenuDetalis(2,"fishfry",120));
		food.add(new MenuDetalis(3,"chappathi",60));
		food.add(new MenuDetalis(4,"chickennoodles",60));
		
		 
		List<EmployeeDetails> emp=new ArrayList<>();
		
		emp.add(new EmployeeDetails(1,"yashwanth"));
		emp.add(new EmployeeDetails(2,"sunny"));
		emp.add(new EmployeeDetails(3,"ravi"));
		emp.add(new EmployeeDetails(4,"bunty"));
		
		
	    //update the price of food item
		MenuDetalis f=(MenuDetalis) food.stream().map(t->t.getFood()).collect(Collectors.toList());
				
	
		
		System.out.println("list of food details");
		food.forEach(t->System.out.println(f.getId()+ " " +f.getFood()+ " " +f.getPrice()));
	
	
	}

}