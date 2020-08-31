/*
  Rewrite Listing 2.10, ComputeChange.java, to fix the possible loss of
  accuracy when converting a double value to an int value. Enter the input
  as an integer whose last two digits represent the cents. For example,
  the input 1156 represents 11 dollars and 56 cents.
*/

import java.util.Scanner;

public class E2_22 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an amount in int, for example 1156 " + "(11 dollars and 56 cents): ");
	}
}
