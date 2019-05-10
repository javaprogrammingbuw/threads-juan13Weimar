
public class RunnableDemo implements Runnable{
	public void run(){
		try{
			System.out.println("Thread "+Thread.currentThread().getId() +" is running.");
			Thread.sleep(100);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
