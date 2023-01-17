package dateandtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModifyDateAndTime {

	public static void main(String[] args) {
		
		A a=new A();
		
		String get1=a.m1("Sun-20Nov2022T17:36");
		System.out.println("Return Value :" +get1);

	}

}

class A{
	
	public String m1(String layoverDuration)
	{
		String str="";
		System.out.println("Original String :" +layoverDuration);
		String splitString=layoverDuration.substring(layoverDuration.indexOf("-")+1);
		System.out.println("After Split  :" +splitString);
		
		String replacedString=splitString.replace('T', ' ');
		
		System.out.println("Replaced String :" +replacedString);
		
		
		StringBuilder sb=new StringBuilder();
		sb.append(replacedString.substring(5, 9)).append("-");
		sb.append(replacedString.substring(2, 5)).append("-");
		sb.append(replacedString.substring(0, 2)).append(" ");
		sb.append(replacedString.substring(10, 12)).append(":");
		sb.append(replacedString.substring(13, 15));
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd HH:ss");
		Date date;
		try {
			date=sdf.parse(sb.toString());
			sdf=new SimpleDateFormat("yyyy-MM-dd HH:ss");
			str=sdf.format(date);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return str.replace(' ', 'T');
					
		
	}
}


