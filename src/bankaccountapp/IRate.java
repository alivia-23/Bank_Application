package bankaccountapp;

public interface IRate {
	
	// method returns interest rate
	default double getBaseRate() {
		return 2.5;
	}

}
