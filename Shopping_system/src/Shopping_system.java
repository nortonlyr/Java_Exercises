import java.util.Scanner;

public class Shopping_system {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("===�������ϵͳ===");
		System.out.println("======1.��¼======");
		System.out.println("======2.�˳�======");
		System.out.println("��ѡ��");
		int choice1 = in.nextInt();
		if(choice1==1) {
			int count=0;
			while(1==1) {
				System.out.println("�������û�����");
				String name = in.next();
				System.out.println("���������룺 ");
				String pwd = in.next();
				
				if("aaa".equals(name)&& "123".equals(pwd)) {
					while(1==1) {
						System.out.println("==============���˵�============");
						System.out.println("1.�ͻ���Ϣ����");
						System.out.println("2.�������");
						System.out.println("3.�������");
						System.out.println("4.ע��");
						System.out.println("��ѡ��");
						int choice2 = in.nextInt();
						if(choice2==1) {
							
							System.out.println("==============���˵�============");
							System.out.println("1.����û�");
							System.out.println("2.����ͳ��");
							System.out.println("3.�������˵�");
							System.out.println("��ѡ��");
							int choice21=in.nextInt();
							if (choice21==1) {
								String clist="";
								while(1==1) {
									System.out.println("������������");
									String name1=in.next();
									System.out.println("���������䣺");
									int age1 = in.nextInt();
									clist=clist+name1+"----"+age1+"\n";
									System.out.println("��ӳɹ����������������1�� ������������ֹͣ��");
								}
							}
						}
						
					}
				}
			}
	}
	}
}
