package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTime {
	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();
		
		System.out.println(date1);
		
		LocalDate dob=LocalDate.of(2002, 4, 17);
		System.out.println("DOb is: "+dob);
		
		String str="2001-12-18";
		LocalDate strdate=LocalDate.parse(str);
		System.out.println("Parsed str with default format: "+strdate);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date2=LocalDate.parse("24/11/2013",format);
		
		System.out.println("Parsed str with custom format: "+date2);
		
		DateTimeFormatter format1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		String date3=date2.format(format1);
		System.out.println(date3);
		
		LocalDateTime dtime=LocalDateTime.now();
		System.out.println(dtime);
		
		DateTimeFormatter myformatter=DateTimeFormatter.ofPattern("MM dd yy");
		String mydate=date1.format(myformatter);
		System.out.println(mydate);
		
	}

}
