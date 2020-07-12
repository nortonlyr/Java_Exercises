
public class break_continue_ex01 {
	public static void main(String[] args) {
		int i=1;
		while (i>0) {
			i++;
			System.out.println(i);
			if (i==10)
				break;
		}
		System.out.println("loop stop");
	}	
}
