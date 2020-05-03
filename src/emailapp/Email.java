package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "abycompany.com";
	
	//constructor to receive the firstname and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method asking for that dept - return the dept
		this.department = setDepartment();
		System.out.println("Department: "+ this.department);
		
		//call a method that return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
		System.out.println("Your email is:" + email);
	}
	    
	//ask for the dept
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES: \n1 Sales\n2 Development\n3 Accounting\n0 none\nEnter Department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) { return "Sales";}
		else if(depChoice == 2) { return "Development";}
		else if(depChoice == 3) { return "Acct";}
		else { return "";}
	}
	
	//generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*~abcdefghijklmnopqrstuvwxyz";
		char[] password = new char[length];
		for(int i = 0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getmailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display Name:" + firstName + " " + lastName + "\n" +
				"Company Email:" + email + "\n" +
				"Mailbox Capacity:" +mailboxCapacity + "mb";
	}

}
