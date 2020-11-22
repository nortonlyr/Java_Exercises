import java.util.Scanner;

public class Shopping_system {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("===购物管理系统===");
		System.out.println("======1.登录======");
		System.out.println("======2.退出======");
		System.out.println("请选择: ");
		int choice1 = in.nextInt();
		if(choice1==1) {
			int count=0;
			while(1==1) {
				System.out.println("请输入用户名: ");
				String name = in.next();
				System.out.println("请输入密码: ");
				String pwd = in.next();
				
				if("aaa".equals(name)&& "123".equals(pwd)) {
					while(1==1) {
						System.out.println("==============主菜单============");
					}
				}
			}
	}
	}
}
