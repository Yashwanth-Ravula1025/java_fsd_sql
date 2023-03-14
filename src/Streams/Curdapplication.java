package Streams;
import java.util.*;

import java.util.Arrays;

class Customerdetails{
	private int uid;
    private String name;
	public Customerdetails(int uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
class Fooddetails {
	String foodid;
	String name;
	int price;
	@Override
	public String toString() {
		return "Fooddetails [foodid=" + foodid + ", name=" + name + ", price=" + price + "]";
	}
	public Fooddetails(String foodid, String name, int price) {
		super();
		this.foodid = foodid;
		this.name = name;
		this.price = price;
	}
	public String getFoodid() {
		return foodid;
	}
	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
public class Curdapplication {

	public static void main(String[] args) {
		System.out.println("Enter Uid");
		Scanner sc=new Scanner(System.in);
	    String e=sc.nextLine();
	    System.out.println("Enter name");
	    Scanner sc1=new Scanner(System.in);
	    String n=sc1.nextLine();
	
		Fooddetails f1=new Fooddetails("123","Veg meals",80);
		Fooddetails f2=new Fooddetails("345","Fish curry meals",120);
		Fooddetails f3=new Fooddetails("567","Chappathi vegcurry",80);
		Fooddetails f4=new Fooddetails("789","Chappathi chicken",120);
		Fooddetails f5=new Fooddetails("912","veg fried rice",60);
		Fooddetails f6=new Fooddetails("234","Chicken fried rice",150);
		
		if(e!=null && n!=null) {
			List<Fooddetails>f=Arrays.asList(f1,f2,f3,f4,f5,f6);
			System.out.println(f);
		
		
		// TODO Auto-generated method stub

	

		}
	}
}
