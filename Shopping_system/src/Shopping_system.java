import java.util.Scanner;

public class Shopping_system {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("===购物管理系统===");
		System.out.println("======1.登录======");
		System.out.println("======2.退出======");
		System.out.println("请选择：");
		int choice1 = in.nextInt();
		if(choice1==1) {
			int count=0;
			while(1==1) {
				System.out.println("请输入用户名：");
				String name = in.next();
				System.out.println("请输入密码： ");
				String pwd = in.next();
				
				if("aaa".equals(name)&& "123".equals(pwd)) {
					while(1==1) {
						System.out.println("==============主菜单============");
						System.out.println("1.客户信息管理");
						System.out.println("2.购物结算");
						System.out.println("3.真情回馈");
						System.out.println("4.注销");
						System.out.println("请选择：");
						int choice2 = in.nextInt();
						if(choice2==1) {
							
							System.out.println("==============主菜单============");
							System.out.println("1.添加用户");
							System.out.println("2.年龄统计");
							System.out.println("3.返回主菜单");
							System.out.println("请选择：");
							int choice21=in.nextInt();
							if (choice21==1) {
								String clist="";
								while(1==1) {
									System.out.println("请输入姓名：");
									String name1=in.next();
									System.out.println("请输入年龄：");
									int age1 = in.nextInt();
									clist=clist+name1+"----"+age1+"\n";
									System.out.println("添加成功！继续添加请输入1， 输入其他内容停止：");
								}
							}
						}
						
					}
				}
			}
	}
	}
}
