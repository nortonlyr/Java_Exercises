
public class ArrayRearrangement {
	public static void main(String[] args) {
		int[] [] a = { {2,3,4}, {4,6,8}};
		int[] [] b = {{1,5,2,8}, {5,9,10,-3}, {2,7,-5,-18}};
		
		int c[][] = new int[2][4];
		int k=0, j=0, add=0;
		for (k=0; k<2;k++) {
			for (j=0; j<4; j++) {
				for (int i=0; i<3; i++) {
					add = add + a[k][i] * b[i][j];
				}
				c[k][j] = add;
			}
		}
		//������ά����
		for(int[] e:a) {
			for(int n:e) {
				System.out.println(n+",");
			}
		}
	}
}
