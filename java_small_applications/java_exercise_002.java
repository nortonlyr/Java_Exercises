//��Ŀ��һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ���
//https://www.cnblogs.com/jssj/p/11222351.html
public class java_exercise_002 {
	public static void main(String[] args) {
		squareNum();
	}
	
	public static void squareNum() {
		int i = 1;
		while(true) {
			int tmp = i*i;
			int z = 1;
			while(true) {
				if(z*z - tmp >= 168) {
					break;
				}
				z++;
			}
			if (z*z - i*i == 168 && (z*z - 168 - 100)>= 0) {
				System.out.println("һ��������������100����һ����ȫƽ������ �ټ���168����һ����ȫƽ�������tԓ����: " + (z*z - 168 - 100));
				break;
			} else {
				i++;
			}	
		}
	}
}
