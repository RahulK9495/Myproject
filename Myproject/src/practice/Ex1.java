package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Ex1 {
	  public static void main(String[] args){
	       
		  SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss.SSS yyyy/MM/dd ");
		  a.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		  
		  System.out.println("Now :"+a.format(System.currentTimeMillis()));
	  }
}
