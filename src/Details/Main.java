package Details;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customer v1=new Customer(12345,"Meenakshi","meenu@gmail.com");
		Savings u1=new Savings(12,v1,5000.9,2000);
		
		
		System.out.println(u1.withdraw(4000));
		
	}
	
	
	

}
