
public class break_continue_ex02 {
	public static void main(String[] args) {
		Loop: for (int i=0; i<3; i++) {
			System.out.println("i="+i);
			for (int j=0; j<6; j++) {
				System.out.println("j="+j);
				if(j==4) {
//					break;
					break Loop; //Loop is a label
				}
			}
		}
		System.out.println("loop stop");
	}	
}
