
public class Sum2Darray extends Thread{

	public int[] row;
	private int sum = 0;
	// Constructor
	public Sum2Darray(int[] row) {
		this.row = row;
	}
	
	// sums all elements of a row.
	public void run() {
		for (int i = 0; i < row.length; i++) {
			this.setSum(this.getSum() + this.row[i]);
		}	
		System.out.println(this.getSum());
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}	
}
