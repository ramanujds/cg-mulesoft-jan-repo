package com.cg.examples;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateManipulation {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2020, 5, 25);
		
		LocalDate today = LocalDate.now();
		
		System.out.println(date);
		
		System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MMM/yyyy")));
		
		LocalDate anotherDay = LocalDate.parse("2022-01-20");
		
		System.out.println(anotherDay);
		
		System.out.println(today.isBefore(anotherDay));
		
		long difference = Duration.between(date.atStartOfDay(), today.atStartOfDay()).toDays();
		long monthDiff = difference/30;
		
//		long dayDiff = difference - monthDiff*30;
//		System.out.println("Difference = "+difference);
//		System.out.println("Difference = "+monthDiff+" months and "+dayDiff+" days");
//		System.out.println("Difference = "+monthDiff+" months and "+dayDiff+" days");
//		System.out.println("Experience = "+monthDiff+" months and "+dayDiff+" days");

		LocalTime time = LocalTime.now();
		
		System.out.println("Time  - "+time);
		
		LocalDateTime dateTime = LocalDateTime.now();
		
		System.out.println("Date&Time  - "+dateTime);
	}

}
