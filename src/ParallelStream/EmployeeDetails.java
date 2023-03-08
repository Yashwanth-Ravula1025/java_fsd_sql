package ParallelStream;

public class EmployeeDetails extends MenuDetalis {
	private int id;
	private String name;
	
	

	public EmployeeDetails(int id, String name) {
		super(id, name);
		this.id = id;
		this.name = name;
	}



	public int getUid() {
		return id;
	}



	public void setUid(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
     


}
