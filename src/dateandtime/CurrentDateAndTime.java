package dateandtime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CurrentDateAndTime {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		Date date =new Date();
		String format = sdf.format(date);
		System.out.println("Current Date : "+date);
		System.out.println("Current Date And Time after formatting(SimpleDateFormat): " +format);
		
		
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		 LocalDateTime ldt=LocalDateTime.now();
		 System.out.println("Current Date And Time : " +ldt);
		 String format2 = ldt.format(dtf);
		 LocalDate parse = LocalDate.parse(format2, dtf);
		 System.out.println("Current Date And Time after formatting (DateTimeFormatter): " +ldt);
		

	}

}
