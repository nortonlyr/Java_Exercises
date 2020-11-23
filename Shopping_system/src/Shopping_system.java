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
									String choice3=in.next();
									if("1".equals(choice3)) {
										continue;
									} else {
										System.out.println(clist);
										break;
									}
								}
							} else if (choice21==2) {
								int up30=0;
								int down30=0;
								int i=1;
								while(i<=3) {
									System.out.println("请输入姓名：");
									String name2=in.next();
									System.out.println("请输入年龄：");
									int age2=in.nextInt();
									if(age2>=30) {
										up30++;
									} else {
										down30++;
									}
									i++;
								}
								System.out.println("30岁以上比例："+up30/3.0*100+"%");
								System.out.println("30岁以下比例："+down30/3.0*100+"%");
							}else {
								continue;
							}
						}else if (choice2==2) {
							System.out.println("商品列表：101.苹果 5元 102.梨子 6元 103.香蕉 3元");
							double total=0;
							while(1==1) {
								System.out.println("请输入商品编号：");
								int pid=in.nextInt();
								System.out.println("请输入商品数量：");
								int pnum=in.nextInt();
								String pName="";
								if(pid==101) {
										pName="苹果";
										pPrice=5;
								}else if(pid=102){
										pName="梨子";
										pPrice=6;
								}else if(pid=103) {
										pName="香蕉";
										pPrice=3;
								}
							}
						}
						
					}
				}
			}
	}
	}
}
