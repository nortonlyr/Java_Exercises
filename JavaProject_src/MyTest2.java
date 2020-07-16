
public class MyTest2 {
	String name;
	
	public void getName() {
		int id=0;
		System.out.println(id + name);
	}
	public static void main(String[] args) {
		for (int i=0; i<=10; i++) {
			System.out.println("i = " + i);
			for (int j = 1; j<=10; j++) {
				System.out.println("j = " + j);
			}
		}
	}
}