package assingment;

public class Customer {
	
	private String regid;
	private String name;
	private String phonenumber;
	private String emailid;
	private String location;
	

	@Override
	public String toString() {
		return "Customer [regid=" + regid + ", name=" + name + ", phonenumber=" + phonenumber + ", emailid=" + emailid
				+ ", location=" + location + "]";
	}


	public Customer(String regid, String name, String phonenumber, String emailid, String location) {
		this.regid = regid;
		this.name = name;
		this.phonenumber = phonenumber;
		this.emailid = emailid;
		this.location = location;
	}


	public String getRegid() {
		return regid;
	}


	public void setRegid(String regid) {
		this.regid = regid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
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


	public static void add(Customer customer) {
		// TODO Auto-generated method stub
		
	}
	

}
