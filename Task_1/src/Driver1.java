public class Driver1 {
	public static void main(String[] args) {
		SimpleThread t = new SimpleThread();
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(t.getState());
	}
}
