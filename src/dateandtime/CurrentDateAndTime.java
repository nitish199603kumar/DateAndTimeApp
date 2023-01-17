package dateandtime;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateAndTime {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
		Date date =new Date();
		String format = sdf.format(date);
		System.out.println("Current Date And Time" +format);
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); 
		 LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Current Date And Time" +ldt);

	}

}
