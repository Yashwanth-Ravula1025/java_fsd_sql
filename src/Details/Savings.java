package Details;

public class Savings extends Account {
	private double minimumBalance;
	

	public Savings(int accountNumber, Customer customerObj, double balance, double minimumBalance) {
		super(accountNumber, customerObj, balance);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public boolean withdraw(double amount) {
	    if(balance-amount>minimumBalance)
	    {
	    	balance=balance-amount;
	    	return true;
	    }
	    else {
	    	return false;
	    }
	    
		
	}

}



