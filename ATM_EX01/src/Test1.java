import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in)
				
		String cardNum1 = "1001";
		String password1 = "123456";
		double balance1 = 10000;
		
		String cardNum2 = "1001";
		String password2 = "123456";
		double balance2 = 20000;
		
		String cardNum3 = "1001";
		String password3 = "123456";
		double balance3 = 30000;
		
		System.out.println("��ӭ�������У�");
		while (1==1) {
			System.out.println("�����뿨��: ");
			String carNum=in.next();
			System.out.println("����������: ");
			String password=in.next();
			
			if (carNum.equals(cardNum1) && password.equals(password1)){
				System.out.println("ݔ�����_���Ñ�: ��1");
			}else if(carNum.equals(cardNum2) && password.equals(password2)){
				System.out.println("ݔ�����_���Ñ�: ��2");
			}else if(carNum.equals(cardNum3) && password.equals(password3)){
				System.out.println("ݔ�����_���Ñ�: ��3");
			}else {
				System.out.println("��̖�ܴaݔ���e�`��Ո����ݔ��! ");
			}
		}
	}
}
