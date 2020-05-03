package bankaccountapp;

public interface IRate {
	
	// write a method that returns interest rate
	default double getBaseRate() {
		return 2.5;
	}

}
