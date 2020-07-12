
public class switch_ex02 {
	public static void main(String[] args) {
	int grade = 5;
	switch(grade) {
	case 10: 
	case 9: System.out.println("Grade A"); break;
	case 8: System.out.println("Grade B"); break;
	case 7: System.out.println("Grade C"); break;
	case 6: System.out.println("Grade D"); break;
	case 5: 
	case 4: 
	case 3: 
	case 2: 
	case 1: 
	case 0: System.out.println("Grade F"); break;
	default: System.out.println("Invilid Grade");
	}
	}
}
