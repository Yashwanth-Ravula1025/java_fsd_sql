package Functioninterface;
import java.util.*;
import java.util.stream.Collectors;

 class Productdetails {
	String name;
	int id;
	int price;
	

	public Productdetails(String name, int id, int price) {
		super();
		this.name = name;
		this.id = id;
		this.price = price;
	}
 }
    public class Listofproduct{

	public static void main(String[] args) {
		Productdetails p=new Productdetails("Rice",12345,1000);
		Productdetails a=new Productdetails("Mango",56789,20000);
		Productdetails b=new Productdetails("Orange",12354,3000);
		List<Productdetails>s=Arrays.asList(p, a, b);
		List<Integer>details=s.stream().filter(t->t.price>10000).map(t->t.price).collect(Collectors.toList());
		System.out.println(details);
		
	}
		// TODO Auto-generated method stub

	}


