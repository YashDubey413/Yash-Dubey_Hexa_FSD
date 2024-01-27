package datetime;

import java.time.LocalDate;

public class DateTimeFunctions {
	public static void main(String[] args) {
		
		LocalDate date1=LocalDate.now();
		
		LocalDate date2=LocalDate.of(2024, 1, 17);
		
		System.out.println(date1.isLeapYear());
		
		System.out.println(date1.isBefore(date2));
		
		System.out.println(date1.plusDays(2));
		
		System.out.println(date1.plusMonths(2));
		
		System.out.println(date1.plusYears(20));
		
		System.out.println(date1.minusYears(21));
		
		System.out.println(date1.withYear(2020));
		
		System.out.println(date1.getDayOfYear());
		
		System.out.println(date1.getDayOfMonth());
		
		System.out.println(date1.getYear());
	}

}
