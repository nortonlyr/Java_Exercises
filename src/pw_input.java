import java.util.Scanner;

public class pw_input {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd1 = "0";
		String pwd2 = "-1";
		
		do {
			System.out.println("Please enter password: ");
			pwd1=sc.nextLine();
			System.out.println("Please enter password gain: ");
			pwd2=sc.nextLine();
			if(!pwd1.equals(pwd2)) {
				System.out.println("Your password is not match, enter again");
			}
		}while(!pwd1.equals(pwd2));
		System.out.println("You password is done!");
	}
}
