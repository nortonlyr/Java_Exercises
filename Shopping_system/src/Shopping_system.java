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
									System.out.println("������������");
									String name2=in.next();
									System.out.println("���������䣺");
									int age2=in.nextInt();
									if(age2>=30) {
										up30++;
									} else {
										down30++;
									}
									i++;
								}
								System.out.println("30�����ϱ�����"+up30/3.0*100+"%");
								System.out.println("30�����±�����"+down30/3.0*100+"%");
							}else {
								continue;
							}
						}else if (choice2==2) {
							System.out.println("��Ʒ�б�101.ƻ�� 5Ԫ 102.���� 6Ԫ 103.�㽶 3Ԫ");
							double total=0;
							while(1==1) {
								System.out.println("��������Ʒ��ţ�");
								int pid=in.nextInt();
								System.out.println("��������Ʒ������");
								int pnum=in.nextInt();
								String pName="";
								if(pid==101) {
										pName="ƻ��";
										pPrice=5;
								}else if(pid=102){
										pName="����";
										pPrice=6;
								}else if(pid=103) {
										pName="�㽶";
										pPrice=3;
								}else {
										System.out.println("û�д���Ʒ��");
								}
								
								double t=pPrice*pnum;
								total=total+t;
								System.out.println("��ǰ��ӵ��ǣ�"+pName+"������"+pnum+"�ܼۣ�"+t);
								
								System.out.println("����������1�� ��������ֵ�������ӣ�");
								int choice=in.nextInt();
								if(choice==1) {
										break;
								}
							}
							
							System.out.println("�ϼ�Ӧ���"+total);
							System.out.println("�����븶���");
							double money=in.nextDouble();
							if(money<=total) {
									System.out.println("���㣡");
							}else {
								System.out.println("�տ�"+money+"Ԫ��Ӧ����"+total+"Ԫ������"+(money-total)+"Ԫ");
								System.out.println("��ӭ�´�������");
							}
						}
						else if(choice2==3) {
							System.out.println("��ʼ�齱�����������������������֡�������");
							double r=Math.random();
							int n=(int)(r*100+1);
							System.out.println("���������ǣ�"+n);
							if(n<=5) {
								System.out.println("��ϲ���һ�Ƚ���500Ԫ�����");
							}else if(n<=15) {
								System.out.println("��ϲ��ö��Ƚ���100Ԫ���ѣ�");
							}else {
								System.out.println("лл�ݹˣ�");
							}
						}
						else if(choice2==4) {
							continue;
						}else {
							System.out.println("�������");
							continue;
						}
					}
				}else {
					count++;
					if(count>=3) {
						System.out.println("�Ѿ������������ǿ���˳���");
						break;
					}else {
						System.out.println("����������������룡");
						continue;
					}
				}
			}
	}else if(choice1==2) {
		System.out.println("�˳�ϵͳ��");
	}else {
		System.out.println("�������");
	}
	}
}
