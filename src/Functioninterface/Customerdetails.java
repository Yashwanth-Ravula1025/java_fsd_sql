package Functioninterface;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

class Customer {
int registerid;
String name;
String pnum;
String emailid;
String location;

public Customer(int registerid, String name, String pnum, String emailid, String location) {
	super();
	this.registerid = registerid;
	this.name = name;
	this.pnum = pnum;
	this.emailid = emailid;
	this.location = location;
}



	public int getRegisterid() {
		return registerid;
	}

	public void setRegisterid(int registerid) {
		this.registerid = registerid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
	public class Customerdetails{

	public static void main(String[] args) {
		Customer c1=new Customer(123,"Meenakshi","9995076030","meenakshi2@gmail.com","Thodupuzha");
		Customer c2=new Customer(234,"Devika","9645066040","devika3@gmail.com","Muvattupuzha");
		Customer c3=new Customer(456,"Amitha","9746467576","amitha4@gmail.com","Ernakulam");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the registered id");
	    int i=sc.nextInt();
		List<Customer>c=Arrays.asList(c1,c2,c3);
		List<Customer>details=c.stream().filter(t->t.getRegisterid()==i).collect(Collectors.toList());
		for(Customer j:details ) {
			System.out.println("Id" +j.getRegisterid());		
		    System.out.println("name" + j.getName());
		    System.out.println("phonenumber" + j.getPnum());
		    System.out.println("Email" + j.getEmailid());
		    System.out.println("Location" + j.getLocation());
		
	}
		// TODO Auto-generated method stub

	}
	}


