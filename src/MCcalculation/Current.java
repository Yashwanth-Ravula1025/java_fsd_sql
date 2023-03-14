package MCcalculation;

public class Current extends Account implements Maintenance {

	public Current(String accountNumber, String customerName, double balance) {
		super(accountNumber, customerName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calculateMaintenanceCharge(float noofyears) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
