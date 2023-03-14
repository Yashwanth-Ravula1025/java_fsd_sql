package Details;

abstract public class Account {
	protected int accountNumber;
	protected Customer customerObj;
	protected double balance;
	public Account(int accountNumber, Customer customerObj, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerObj = customerObj;
		this.balance = balance;
		
		 
		
	}
	 abstract public boolean withdraw(double amount);
	 
	 

}
