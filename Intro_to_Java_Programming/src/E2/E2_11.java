/*
  Rewrite Programming Exercise 1.11 to prompt the user to enter the number
  of years and display the population after the number of years.
*/

import java.util.Scanner;

public class E2_11 {
	public static void main(String[] args) {
		int currentPopulation = 312_032_486;
		int secondPerYear = 365 * 24 * 60 * 60;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numer of years: ");
		int numberOfYears = input.nextInt();
		
		for (int i = 1; i <= numberOfYears; i++) {
			currentPopulation += (secondPerYear / 7);
			currentPopulation += (secondPerYear / 45);
			currentPopulation -= (secondPerYear / 13);
		}
		
		System.out.println("After " + numberOfYears + " years: " + currentPopulation);
	}
}
