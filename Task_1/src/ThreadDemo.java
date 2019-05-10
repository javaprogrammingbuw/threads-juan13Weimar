

// extends Thread
// this allows us to use this class as a thread.
// That means that we can use the run method of this class at the same time other
// threads are running. 
public class ThreadDemo extends Thread {

	// All the code the thread executes must be inside of the run method
	public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId() +" is running.");
			Thread.sleep(2000);
		}
		// InterruptedException:
		// Thrown when a thread is waiting, sleeping, or otherwise occupied,
		// and the thread is interrupted, either before or during the activity.
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}	
}
