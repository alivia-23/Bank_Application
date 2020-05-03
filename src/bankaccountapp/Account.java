package bankaccountapp;

public abstract class Account implements IRate{
	// List common properties for savings and checking account
	private String name;
	private String sSN;
	private double balance;
	private static int id = 10000;
	protected String accountNum;
	protected double rate;
	
	// Constructor to set base properties and initialize the account
	public Account(String name, String sSN, double initDep) {
		this.name = name;
		this.sSN = sSN;
		balance = initDep;
		
		//set account number
		id++;
		this.accountNum = setAccountNum();
		
		setRate();
		
		
	}
	
	public abstract void setRate();
	
	private String setAccountNum() {
		String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = id;
		int randomNum = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoSSN + uniqueID + randomNum;
	}
	
	public void compound() {
		double accruedInterest = balance * (rate/100);
		balance = balance + accruedInterest;
		System.out.println("accrued Interst: $" +accruedInterest);
		printBalance();
	}
	
	//List common methods
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositting $" +amount);
		printBalance();
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" +amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transferring $" +amount + "to" +toWhere);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: $" +balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME:" +name +
				"\nAccount Number:" +accountNum +
				"\nBalance: " +balance +
				"\nRATE:" +rate + "%"
				);
	}

}
