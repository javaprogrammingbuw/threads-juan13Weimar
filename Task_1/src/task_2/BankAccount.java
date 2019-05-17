package task_2;

public class BankAccount {

	private int currentBalance;	
	private String iban;	
	private final int limit = 0;
	
	// Constructor
	public BankAccount(String iban, int currentBalance) {
		this.setIban(iban);
		this.currentBalance = currentBalance;
	}
	
	// Methods
	public void withdraw(int amount) {
		if(this.currentBalance - amount > this.limit)
			this.currentBalance -= amount;
	}
	
	public void deposit(int amount) {
		this.currentBalance += amount;
	}
	
	// if employee A is asking for something from B, B for somehting from C, and C for A
	// could happen that all of them get stuck because they need the same thing one to another
	// at the same time
	// volatile allows access to attributes to only one member at a time. We could use it on curretB
	// 'synchonized' allows the acces to methods to only one member at a time
	synchronized public void transfer(int amount, BankAccount ba) {
		if(this.currentBalance - amount > this.limit) {
			this.currentBalance -= amount;
			ba.currentBalance += amount;
		}			
	}

	
	// Get and Set
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}	
	public int getCurrentBalance() {
		return currentBalance;
	}
	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;	}
	
	
		
}
