package bankaccountapp;

public class Savings extends Account {
	// List the properties specific to a savings account
	private int depID;
	private int depKey;
	
	//Constructor to initialize savings account properties
	public Savings(String name, String sSN, double initDep) {
		super(name, sSN, initDep);
		accountNum = "1" + accountNum;
		setSafetyDepositBox();
		
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
		
	}
		
	private void setSafetyDepositBox() {
		depID = (int) (Math.random() * Math.pow(10, 3));
		depKey = (int) (Math.random() * Math.pow(10, 4));
		
		
	}

	// List methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"SAVING ACCOUNT FEATURES:" +
		        "\nSafety Deposit ID:" +depID +
		        "\nSafety Deposit Key:" +depKey
		        );
	}

	

}
