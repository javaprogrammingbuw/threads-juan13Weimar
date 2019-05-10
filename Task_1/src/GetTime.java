import java.util.*;
import java.text.DateFormat;

public class GetTime extends Thread{
	
	public void run() {
		
		Date rightNow;
		Locale currentLocale;
		
		DateFormat timeFormatter;
		DateFormat dateFormatter;
		
		String outTime;
		String outDate;
		
		for (int i = 0; i < 20; i++) {
			
			rightNow = new Date();
			currentLocale = new Locale("es");
			timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
			dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
			
			// To convert them to string
			outTime = timeFormatter.format(rightNow);
			outDate = dateFormatter.format(rightNow);
			
			System.out.println(outTime);
			System.out.println(outDate);
			System.out.println();
			
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{}
			
		}
		
		
		
	}
	
}
