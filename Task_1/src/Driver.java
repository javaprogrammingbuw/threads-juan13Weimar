// Create a method which computes the sum of all elements in a 2D integer array. 
// For better Performance use at least 2 Threads or Runnables in parallel.
// (Hint: Have a look on how the join()-Method is working)
public class Driver {

	public static void main(String[] args) {
		/*Thread t = Thread.currentThread();
		System.out.println("Name: " + t.getName());
		System.out.println("ID: " + t.getId());
		System.out.println("Priority: " + t.getPriority());
		System.out.println("State: " + t.getState());*/
		
		ThreadDemo td = new ThreadDemo();
		td.start();

		RunnableDemo rd = new RunnableDemo();
		new Thread(rd).start();
		
		CallableDemo cd = new CallableDemo();
		System.out.println("id: " + cd.call());
		
		System.out.println("Number of threads: "+Thread.activeCount());
		
		
	}

	public void Sum2Darray(int[] array) {
		
	}
	
	
}
