package task_2;

public class Employee extends Thread{

	private String name;
	private BankAccount origin;
	private BankAccount destiny;
	private int amount;
	
	
	// Constructor
	public Employee (String name, BankAccount origin, BankAccount destiny, int amount) {
		this.name = name;
		this.origin = origin;
		this.destiny = destiny;
		this.amount = amount;
	}
	
	public void run() {
		this.origin.transfer(this.amount, this.destiny);
		System.out.println(this.name + "has transfered " + this.amount +"$ to " + this.destiny.getIban() +" account");
	}
	
}
