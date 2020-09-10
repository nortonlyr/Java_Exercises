/*
  Modify Listing 2.10, ComputeChange.java, to display nonzero denominations
  only, using singular words for single units such as 1 dollar and 1 penny,
  and plural words for more than one unit such as 2 dollars and 3 pennies.
*/

import java.util.Scanner;

public class E3_07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in double, for example 11.56: ");
		double amount = input.nextDouble();
		
		int remainingAmount = (int)(amount * 100);
		int[] denominations = new int[5];
		
		denominations[0] = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		denominations[1] = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		denominations[2] = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
	}
}
