public class count_flower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			for(;;) {
				System.out.println("请输入水仙花值:");
				int a = sc.nextInt();
			
				int b = a/100;
				System.out.println("个位数为: " + b);
				int c = (a/10)%10;
				System.out.println("十位数为: " + c);
				int d = a%10;
				System.out.println("百位数为: " + d);
			
				if((b*b*b+c*c*c+d*d*d)==a) {
					System.out.println();
					System.out.println("水仙花数为: " + a);
				}else {
					System.out.println("不是水仙花数! ");
					System.out.println();
				}continue;
		}
	}
}
