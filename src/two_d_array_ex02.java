
public class two_d_array_ex02 {
	public static void main(String[] args) {
		char arr[][]=new char[4][];
		arr[0]=new char[] {'��','��','��','��','��'};
		arr[1]=new char[] {'��','��','��','��','��'};
		arr[2]=new char[] {'ҹ','��','��','��','��'};
		arr[3]=new char[] {'��','��','֪','��','��'};
		
		System.out.println("----��� ---- ");
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			if(i%2==0) {
				System.out.println("��");
			}else {
				System.out.println("��");
			}
		}
		
		System.out.println("----���� ---- ");
		for (int j=0; j<arr[0].length; j++) {
			for (int i=3; i>=0; i--) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("��������");
	}
}
