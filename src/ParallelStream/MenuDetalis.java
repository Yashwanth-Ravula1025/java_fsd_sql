package ParallelStream;

public class MenuDetalis {
	private int id;
	private String food;
	protected double price;
	
	
	public MenuDetalis(int id, String food, double price) {
		this.id = id;
		this.food = food;
		this.price = price;
	}



	public MenuDetalis(int id2, String name) {
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}


	public String getFood() {
		return food;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	




}
