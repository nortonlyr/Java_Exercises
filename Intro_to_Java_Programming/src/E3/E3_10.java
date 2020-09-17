/*
  Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
  Revise the program to randomly generate an addition question with two
  integers less than 100.
*/

import java.util.Scanner;

public class E3_10 {
	public static void main(String[] args) {
		int number1 = (int)(Math.random()*100);
		int number2 = (int)(Math.random()*100);
		
		System.out.println("What is " + number1 + " + " + number2 + "? ");
		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
	}
}
