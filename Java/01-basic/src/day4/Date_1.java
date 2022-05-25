package day4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Date_1 {
	public static void main(String[] args) {
		
		// create object
		LocalDate now = LocalDate.now();
		LocalDate date1 = LocalDate.of(2016, 10, 16);
		LocalDate date2 = LocalDate.parse("2016-10-10");
		
		System.out.println("Current date: "+now);
		LocalDate yesterday = now.minusDays(1);
		System.out.println("Yesterday: "+yesterday);
		System.out.println("Tomorrow: "+now.plusDays(1));
		
		System.out.println("Current Year: "+now.getYear());
		System.out.println("Current Month: "+now.getMonth());
		System.out.println("Current Day of week: "+now.getDayOfWeek());
		System.out.println("Current Day of month: "+now.getDayOfMonth());
		
		System.out.println(now + " is leap year? "+ now.isLeapYear());
		System.out.println(date1 + " is leap year? "+date1.isLeapYear());
		
		
		System.out.println(date1 + " is the same to "+ date2 + ": "+ date1.equals(date2));
		
		//Local Time
		LocalTime currentTime = LocalTime.now();
		LocalTime time1 = LocalTime.of(11, 03 , 45);
		LocalTime time2 = LocalTime.parse("04:30");
		
		System.out.println("Current Time: "+ currentTime);
		System.out.println("Prev Time: "+ currentTime.minusHours(1));
		System.out.println("Current Hour: "+ currentTime.getHour());
		System.out.println("Current Minute: "+ currentTime.getMinute());
		
		//Local Date Time
		LocalDateTime currentDate = LocalDateTime.now();
		LocalDateTime dateTime1 = LocalDateTime.of(2016, 10, 16, 11, 33 , 45);
		
		System.out.println("Current date time: "+currentDate);
		System.out.println(dateTime1.getYear());
		System.out.println(dateTime1.getMonth());
		System.out.println(dateTime1.getDayOfMonth());
		System.out.println(dateTime1.getHour());
		System.out.println(dateTime1.getMinute());
		System.out.println(dateTime1.getSecond());
		
		
		
		
	}
}
