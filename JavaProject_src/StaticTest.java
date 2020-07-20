
public class StaticTest {
	{
		System.out.println("这里是非静态的代码块");
	}
	
	static {
		System.out.println("这里是静态代码块"); //靜態代碼塊先於非靜態代碼塊運行
	}


	public StaticTest() {
		System.out.println("这里是构造方法");
	}

	public void method() {
		System.out.println("这里是成员方法");
	}
public static void main(String[] args) {
	StaticTest test = new StaticTest();
	test.method();  //靜態代碼 -> 非靜態 -> 構造方法 -> 成員方法
}
}
