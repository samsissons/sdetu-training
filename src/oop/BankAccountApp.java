package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0234324234";
		acc1.
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0234324234";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0234324234";
		acc3.checkBalance();
				


	}

}
