
public class Task1 {

	public static void main(String[] args) {

		int[][] array2D = {{2,3,4},{5,6,7}};
		
		Thread s1 = new Sum2Darray(array2D[0]);
		Thread s2 = new Sum2Darray(array2D[1]);
		
		s1.start();
		s2.start();
		
		try {
			s1.join();
            s2.join();            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }		
		
		
		
		
	}

}
