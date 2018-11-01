package test.maven.base.java;

import java.util.Calendar;
import java.util.Date;


public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
	    cal.setTime(new Date());
	    cal.add(12, 0);
	    System.out.print(cal.getTime());;
	}


	
}
