package task_2;

public class Driver {

	public static void main(String[] args) {
		
		BankAccount a = new BankAccount("1001-A", 300);
		BankAccount b = new BankAccount("2002-B", 300);
		BankAccount c = new BankAccount("3003-C", 300);
		
		Employee x = new Employee("Fran", a,b,20);
		Employee y = new Employee("Eric",b,c,20);
		Employee z = new Employee("Mark",c,a,20);
		
		x.start();

		y.start();

		z.start();

		try {
			x.join();
			y.join();
			z.join();           
        } catch (InterruptedException e) {
            e.printStackTrace();
        }	
		
		System.out.println("Current balance of " + a.getIban() +" is " + a.getCurrentBalance()+ "$");
		System.out.println("Current balance of " + b.getIban() +" is " + a.getCurrentBalance()+ "$");
		System.out.println("Current balance of " + c.getIban() +" is " + a.getCurrentBalance()+ "$");
		// System.out.println("Current balance of {0} is {1} $".format(c.getIban(),a.getCurrentBalance()));
	}
}
