package Functioninterface;

class search{
	int hotelid;
	String name;
	String idproof;
	String email;
	String location;
	
	public search(int hotelid, String name, String idproof, String email, String location) {
		super();
		this.hotelid = hotelid;
		this.name = name;
		this.idproof = idproof;
		this.email = email;
		this.location = location;
	}

	public int getHotelid() {
		return hotelid;
	}

	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdproof() {
		return idproof;
	}

	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
public class Searchhotels {

	public static void main(String[] args) {
		search h1=new search(123,"SFS","124A","saravana1@gmail.com","Thodupuzha");
		search h2=new search(345,"Flemingo","123A","woodland1@gmail.com","Muvattupuzha");
		search h3=new search(223,"Leela","122A","aryas@gmail.com","Vazhakulam");
		search h4=new search(334,"Skyline","125A","malabar1@gmail.com","Trivandrum");
		List<>
		// TODO Auto-generated method stub

	}

}
