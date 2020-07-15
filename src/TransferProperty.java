
public class TransferProperty {
int i=47;

	public void call() {
	System.out.println("调用CALL方法");
	for (i=0; i<3; i++) {
		System.out.print(i+" ");
	}
	System.out.println();
	}
	public static void main(String[] args) {
		TransferProperty t1=new TransferProperty();
		TransferProperty t2=new TransferProperty();
		
		t2.i=60;
		
		System.out.println("第一次实例对象调用1的结果"+t1.i);
		t1.call();
		System.out.println("第二次实例对象调用2的结果"+t2.i);
		t2.call();
	}
}
