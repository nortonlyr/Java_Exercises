
public class TransferProperty {
int i=47;

	public void call() {
	System.out.println("����CALL����");
	for (i=0; i<3; i++) {
		System.out.print(i+" ");
	}
	System.out.println();
	}
	public static void main(String[] args) {
		TransferProperty t1=new TransferProperty();
		TransferProperty t2=new TransferProperty();
		
		t2.i=60;
		
		System.out.println("��һ��ʵ���������1�Ľ��"+t1.i);
		t1.call();
		System.out.println("�ڶ���ʵ���������2�Ľ��"+t2.i);
		t2.call();
	}
}
