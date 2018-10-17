package oop;

public class BankAccount {
	// define variables
	String accountNumber;
	
	//static belongs to the class not the object instance
	//final >> constant
	static final String routingNumber = "0122343";
	
	// Instance Variables
	String name;
	String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
	  // 1. They are used to define / setup / initialize properties of an object
	  // 2. Constructors are IMPLICITLY called upon instantiation
	  // 3. THe same name as the class itself
	  // 4. Constructors have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
		
	}
	
	// Overloading: call same method with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "Error: Minimum deposit must be at least $1,000";
		} else {
			Msg = "Thanks for your inital deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
			
			
	}
	
	
	
	// define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getstatus() {
		
	}
	

}
