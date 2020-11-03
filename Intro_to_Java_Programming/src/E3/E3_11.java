/*
(Find the number of days in a month) Write a program that prompts the user
to enter the month and year and displays the number of days in the month. For
example, if the user entered month 2 and year 2012, the program should display
that February 2012 had 29 days. If the user entered month 3 and year 2015, the
program should display that March 2015 had 31 days.
*/

import java.util.Scanner;

public class E3_11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter the month an year
		System.out.println("Enter the month as integer: ");
		int month = input.nextInt();
		System.out.println("Enter the year as integer: ");
		int year = input.nextInt();
		
		boolean leapYear = 
				(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		// Display the number of days in the month
		switch (month)
		{
			case 1: System.out.println("January " + year + "had 31 days"); break;
			case 2: System.out.println((leapYear) ? "29 days": " 28 days"); break;
			case 1: System.out.println("March " + year + "had 31 days"); break;
		}
	}
	
}
