
public class two_d_array_ex02 {
	public static void main(String[] args) {
		char arr[][]=new char[4][];
		arr[0]=new char[] {'春','眠','不','觉','晓'};
		arr[1]=new char[] {'处','处','闻','啼','鸟'};
		arr[2]=new char[] {'夜','来','风','雨','声'};
		arr[3]=new char[] {'花','落','知','多','少'};
		
		System.out.println("----横板 ---- ");
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
			}
			if(i%2==0) {
				System.out.println("，");
			}else {
				System.out.println("。");
			}
		}
		
		System.out.println("----竖板 ---- ");
		for (int j=0; j<arr[0].length; j++) {
			for (int i=3; i>=0; i--) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("。，。，");
	}
}
