package bankaccountapp;

public class Checking extends Account{
	//properties specific to a checking account
	private int debitCardNum;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDep) {
		super(name, sSN, initDep);
		accountNum = "2" + accountNum;
		setDebitCard();
		
		
	}
	public void setRate() {
		rate = getBaseRate() * .15;
	}
	
	private void setDebitCard() {
		debitCardNum = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
		
	}

	// methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"CHECKING ACCOUNT FEATURES:" +
		        "\nDebit Card Number: " +debitCardNum +
		        "\nDebit Card PIN: " +debitCardPin
		        );
	}

}
