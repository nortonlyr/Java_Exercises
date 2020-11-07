/*
(Compute the perimeter of a triangle) Write a program that reads three edges for
a triangle and computes the perimeter if the input is valid. Otherwise, display that
the input is invalid. The input is valid if the sum of every pair of two edges is
greater than the remaining edge.
*/

import java.util.Scanner;

public class E3_19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter three edges for a triangle
		System.out.println("Enter three edges for a triangle:");
		System.out.print(" Edge 1 points x, y: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		System.out.print(" Edge 2 points x, y: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
	}
}
