public class printer {
	public static void main(String[] args) {
		// for 循环行列打印
		for(int i=0; i<9; i++) {
		
		for(int j=1; j<9; j++) {
			System.out.println(" * ");
		}
		System.out.println(" * ");
	}
	System.out.println();

	
	// while 循环

		int i=0;
	while(i<9) {
		i++;
		for(int j=1; j<9; j++) {
			System.out.println(" * ");
		}
		System.out.println(" * ");
	}

	
	// do while 循环
	int a = 1;
	int s = 0;
	do {
			a++;
			for(int j=1; j<9; j++) {
				System.out.println(" * ");
			}
			System.out.println(" * ");
	}while(a<9);
}
}
