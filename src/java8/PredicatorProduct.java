package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PredicatorProduct {

	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		
		productlist.add(new Product(1,"icecream",20000f));
		productlist.add(new Product(2,"chocolate",5000f));
		productlist.add(new Product(3,"batterys",10000f));
		
        List<Float> product=productlist.stream().filter(t->t.price>10000).map(t->t.price).collect(Collectors.toList());
        System.out.println(product);
		
		
		
	

	}

}
