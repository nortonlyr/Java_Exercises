import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
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
		int count = 0;
		while (1==1) {
			System.out.println("�����뿨��: ");
			String carNum=in.next();
			System.out.println("����������: ");
			String password=in.next();
			
			double balance=0;
			if (carNum.equals(cardNum1) && password.equals(password1)){
				System.out.println("ݔ�����_���Ñ�: ��1");
				balance = balance1;
				break;
			}else if(carNum.equals(cardNum2) && password.equals(password2)){
				System.out.println("ݔ�����_���Ñ�: ��2");
				balance=balance2;
				break;
			}else if(carNum.equals(cardNum3) && password.equals(password3)){
				System.out.println("ݔ�����_���Ñ�: ��3");
				balance=balance3;
				break;
			}else {
				System.out.println("��̖�ܴaݔ���e�`��Ո����ݔ��! ");
				continue;
			}
		
			
			while(1==1) {
				System.out.println("Ոݔ��Ҫ�k��ĘI��: 1.��� 2. ȡ�� 3. �˳�: ");
				int choice = in.nextInt();
			
				if(choice==1) {
					System.out.println("Ոݔ������~: ");
					double money1 = in.nextDouble();
					if (money1>0) {
						balance = balance + money1;
						System.out.println("���ɹ�, ����" + money1 + "Ԫ, ���~" + balance + "Ԫ ");
					} else {
						System.out.println("�����~ݔ���e�`! ");
					}
				}else if(choice==2) {
					System.out.println("Ոݔ��ȡ����~: ");
					double money2 = in.nextDouble();
					if (money2>0 && money2<=balance) {
						balance = balance + money2;
						System.out.println("ȡ��ɹ�, ȡ��" + money2 + "Ԫ, ���~" + balance + "Ԫ ");
					} else {
						System.out.println("ȡ����~ݔ���e�`! ");
					}
				}else if(choice==3) {
					System.out.println("�k��Y��, Ո�պÿ�Ƭ! ");
					break;
				}else {
					System.out.println("ݔ���e�`, Ո�����x��! ");
					continue;
				}
			}
		}
		}
	}
}
