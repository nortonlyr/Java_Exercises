import java.util.Scanner;

public class Shopping_system {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("===�������ϵͳ===");
		System.out.println("======1.��¼======");
		System.out.println("======2.�˳�======");
		System.out.println("��ѡ��: ");
		int choice1 = in.nextInt();
		if(choice1==1) {
			int count=0;
			while(1==1) {
				System.out.println("�������û���: ");
				String name = in.next();
				System.out.println("����������: ");
				String pwd = in.next();
				
				if("aaa".equals(name)&& "123".equals(pwd)) {
					while(1==1) {
						System.out.println("==============���˵�============");
					}
				}
			}
	}
	}
}
