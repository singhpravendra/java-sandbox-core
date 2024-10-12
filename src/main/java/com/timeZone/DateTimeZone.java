/**
 * 
 */
package com.timeZone;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author pravendra.singh
 *
 */
public class DateTimeZone {
	
	public  String convertTo24Hour(String Time) {	
	 DateFormat f1 = new SimpleDateFormat("hh:mm a");
	    Date d = null;
	    try {
	        d = f1.parse(Time);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }
	    DateFormat f2 = new SimpleDateFormat("HH:mm");
	    String x = f2.format(d);

	    return x;

}
	
	public static void main(String[] args) {
		DateTimeZone dt =new DateTimeZone();
		String time = "9:00 AM";
		System.out.println(dt.convertTo24Hour(time));
		
		//Number format 
		NumberFormat myFormat = NumberFormat.getInstance();
		myFormat.setGroupingUsed(true);
		System.out.println(myFormat.format(9876541));
	}
}
