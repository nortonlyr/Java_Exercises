public class count_flower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			for(;;) {
				System.out.println("������ˮ�ɻ�ֵ:");
				int a = sc.nextInt();
			
				int b = a/100;
				System.out.println("��λ��Ϊ: " + b);
				int c = (a/10)%10;
				System.out.println("ʮλ��Ϊ: " + c);
				int d = a%10;
				System.out.println("��λ��Ϊ: " + d);
			
				if((b*b*b+c*c*c+d*d*d)==a) {
					System.out.println();
					System.out.println("ˮ�ɻ���Ϊ: " + a);
				}else {
					System.out.println("����ˮ�ɻ���! ");
					System.out.println();
				}continue;
		}
	}
}
