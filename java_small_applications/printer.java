public class printer {
	public static void main(String[] args) {
		// for ѭ�����д�ӡ
		for(int i=0; i<9; i++) {
		
		for(int j=1; j<9; j++) {
			System.out.println(" * ");
		}
		System.out.println(" * ");
	}
	System.out.println();

	
	// while ѭ��

		int i=0;
	while(i<9) {
		i++;
		for(int j=1; j<9; j++) {
			System.out.println(" * ");
		}
		System.out.println(" * ");
	}

	
	// do while ѭ��
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
