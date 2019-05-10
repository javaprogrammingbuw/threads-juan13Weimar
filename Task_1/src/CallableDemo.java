import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {
	
	private static int cntr = 0;
	private final int id = ++cntr;
	
	public Integer call(){
		return id;
	}
}