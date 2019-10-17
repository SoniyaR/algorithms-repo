package src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateParseTest {
	
	 private final static SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", new Locale("en", "IN"));
	   
	 private final static SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm a", new Locale("en", "IN"));
	    
	public static void main(String[] args) {
		String str = "2019-08-22T13:07:17.687";
		try {
			Date date = inputDateFormat.parse(str.replace('T', ' '));
			System.out.println(outputDateFormat.format(date));
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		

	}

}
