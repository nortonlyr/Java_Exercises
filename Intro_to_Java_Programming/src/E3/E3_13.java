/*
(Financial application: compute taxes) Listing 3.5, ComputeTax.java, gives the
source code to compute taxes for single filers. Complete Listing 3.5 to compute
the taxes for all filing statuses.
*/
import java.util.Scanner;

public class E3_13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter filing status
		System.out.print("(0-single filter, 1 married jointly or " + 
				"qualifying widow(er), 2-married separatelt, 3-head of " +
				"household) Enter the filing status: ");
		int status = input.nextInt();
		
		// Prompt the user to enter taxable income
		System.out.print("Enter the taxable income");
	}
	
}
