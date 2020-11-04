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
		double income = input.nextDouble();
		
		// Compute tax
		double tax =  0;
		switch (status)
		{
			case 0 : // Compute tax for single filers
				tax += (income <= 8350) ? income * 0.10 : 8350 * 0.10;
				if (income > 8350)
					tax += (income <= 33950) ? (income - 8350) * 0.15 :
					25600 * 0.15;
				if (income > 33950)
					tax += (income <= 82250) ? (income - 33950) * 0.25 :
					48300 * 0.25;
				if (income > 82250)
					tax += (income <= 171550) ? (income - 82250) * 0.28 :
					89300 * 0.28;
				if (income > 171550)
					tax += (income <= 372950) ? (income - 171550) * 0.33 :
					201400 * 0.33;
				if (income > 372950)
					tax += (income - 372950) * 0.35;
		}
	}
	
}
