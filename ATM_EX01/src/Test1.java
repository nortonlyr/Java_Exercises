import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in)
				
		StringcardNum1 = "1001";
		String password1 = "123456";
		double balance1 = 10000;
		
		StringcardNum2 = "1001";
		String password2 = "123456";
		double balance2 = 20000;
		
		StringcardNum3 = "1001";
		String password3 = "123456";
		double balance3 = 30000;
		
		System.out.println("��ӭ�������У�");
		while (1==1) {
			System.out.println("�����뿨��: ");
			String carNum=in.next();
			System.out.println("����������: ");
			String password=in.next();
			
			if (carNum.equal2(cardNum1) && password.equals(password1)){
				System.out.println("ݔ�����_���Ñ�: ��1");
			}elseif(carNum.equal2(cardNum2) && password.equals(password2){
				System.out.println("ݔ�����_���Ñ�: ��2");
			}
		}
	}
}
