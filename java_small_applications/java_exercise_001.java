// ��Ŀ����1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
public class java_exercise_001 {
	public static void main(String[] args) {
		FormThreeNum();
	}
	
	public static void FormThreeNum() {
		for (int i=1; i<=4; i++) {
			for (int j=1; j<=4; j++) {
				for (int k=1; k<=4; k++) {
					if(i != j && j!=k && k!=i) {
						System.out.println("1,2,3,4���ԽM�ɵ���λ��: " + i + j + k);
					}
				}
			}
		}
	}
}