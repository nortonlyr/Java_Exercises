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
		
		System.out.println("欢迎来到银行！");
		while (1==1) {
			System.out.println("请输入卡号: ");
			String carNum=in.next();
			System.out.println("请输入密码: ");
			String password=in.next();
			
			double balance=0;
			if (carNum.equals(cardNum1) && password.equals(password1)){
				System.out.println("輸入正確！用戶: 卡1");
				balance = balance1;
				break;
			}else if(carNum.equals(cardNum2) && password.equals(password2)){
				System.out.println("輸入正確！用戶: 卡2");
				balance=balance2;
				break;
			}else if(carNum.equals(cardNum3) && password.equals(password3)){
				System.out.println("輸入正確！用戶: 卡3");
				balance=balance3;
				break;
			}else {
				System.out.println("卡號密碼輸入錯誤，請重新輸入! ");
				continue;
			}
			while(1==1) {
				System.out.println("請輸入要辦理的業務: 1.存款 2. 取款 3. 退出: ");
				int choice = in.nextInt();
			
				if(choice==1) {
					System.out.println("請輸入存款金額: ");
					double money1 = in.nextDouble();
					if
				}else if(choice==2) {
					
				}else if(choice==3) {
					System.out.println("辦理結束, 請收好卡片! ");
					break;
				}else {
					System.out.println("輸入錯誤, 請重新選擇! ");
				}
			}
		}
	}
}
